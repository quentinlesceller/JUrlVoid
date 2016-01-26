package parser;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import objects.Details;
import objects.Detections;
import objects.IP;
import objects.JUrlVoidResult;

import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

/**
 * The Class ResultParser.
 * 
 * @author quentin
 */
public class ResultParser {

	/**
	 * Parses the.
	 *
	 * @param query
	 *            the query
	 * @return the j url void result
	 * @throws SAXException
	 *             the SAX exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws ParserConfigurationException
	 *             the parser configuration exception
	 */
	public JUrlVoidResult parse(String query) throws SAXException, IOException, ParserConfigurationException {

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new URL(query).openStream());
		doc.getDocumentElement().normalize();

		NodeList detailsList = doc.getElementsByTagName("details");

		Node detailsNode = detailsList.item(0);

		Details details;
		if (detailsNode.getNodeType() == Node.ELEMENT_NODE) {

			Element detailsElement = (Element) detailsNode;
			String host = detailsElement.getElementsByTagName("host").item(0).getTextContent();

			Integer updated = Integer.parseInt(detailsElement.getElementsByTagName("updated").item(0).getTextContent());

			Integer httpResponseCode = Integer
					.parseInt(detailsElement.getElementsByTagName("http_response_code").item(0).getTextContent());
			Integer domainAge = Integer
					.parseInt(detailsElement.getElementsByTagName("domain_age").item(0).getTextContent());

			Integer googlePageRank = Integer
					.parseInt(detailsElement.getElementsByTagName("google_page_rank").item(0).getTextContent());
			Integer alexaRank = Integer
					.parseInt(detailsElement.getElementsByTagName("alexa_rank").item(0).getTextContent());
			Double connectTime = Double
					.parseDouble(detailsElement.getElementsByTagName("connect_time").item(0).getTextContent());
			Integer headerSize = Integer
					.parseInt(detailsElement.getElementsByTagName("header_size").item(0).getTextContent());

			Integer downloadSize = Integer
					.parseInt(detailsElement.getElementsByTagName("download_size").item(0).getTextContent());

			Integer downloadSpeed = Integer
					.parseInt(detailsElement.getElementsByTagName("speed_download").item(0).getTextContent());
			String externalUrlRedirect = detailsElement.getElementsByTagName("external_url_redirect").item(0)
					.getTextContent();

			NodeList ipList = doc.getElementsByTagName("ip");

			Node ipNode = ipList.item(0);
			IP ip;
			if (ipNode.getNodeType() == Node.ELEMENT_NODE) {
				Element ipElement = (Element) detailsNode;

				String address = ipElement.getElementsByTagName("addr").item(0).getTextContent();
				String hostname = ipElement.getElementsByTagName("hostname").item(0).getTextContent();
				Integer asn = Integer.parseInt(ipElement.getElementsByTagName("asn").item(0).getTextContent());
				String asname = ipElement.getElementsByTagName("asname").item(0).getTextContent();
				String countryCode = ipElement.getElementsByTagName("country_code").item(0).getTextContent();
				String countryName = ipElement.getElementsByTagName("country_name").item(0).getTextContent();
				String regionName = ipElement.getElementsByTagName("region_name").item(0).getTextContent();
				String cityName = ipElement.getElementsByTagName("city_name").item(0).getTextContent();
				String continentCode = ipElement.getElementsByTagName("continent_code").item(0).getTextContent();
				String continentName = ipElement.getElementsByTagName("continent_name").item(0).getTextContent();
				Double latitude = Double
						.parseDouble(ipElement.getElementsByTagName("latitude").item(0).getTextContent());
				Double longitude = Double
						.parseDouble(ipElement.getElementsByTagName("longitude").item(0).getTextContent());
				ip = new IP(address, hostname, asn, asname, countryCode, countryName, regionName, cityName,
						continentCode, continentName, latitude, longitude);
			} else {
				ip = null;
			}
			details = new Details(host, updated, httpResponseCode, domainAge, googlePageRank, alexaRank, connectTime,
					headerSize, downloadSize, downloadSpeed, externalUrlRedirect, ip);
		} else {
			details = null;
		}

		NodeList enginesList = doc.getElementsByTagName("engines");
		ArrayList<String> enginesArrayList = new ArrayList<>();
		for (int i = 0; i < enginesList.getLength(); i++) {
			Node engineNode = enginesList.item(i);

			if (engineNode.getNodeType() == Node.ELEMENT_NODE) {

				Element engineElement = (Element) engineNode;
				enginesArrayList.add(engineElement.getElementsByTagName("engine").item(0).getTextContent());

			} else {
				enginesArrayList = null;
			}
		}

		NodeList detectionsList = doc.getElementsByTagName("detections");
		Detections detections;
		if (detectionsList.getLength() != 0) {
			Node detectionsNode = detectionsList.item(0);
			Integer count;

			if (detectionsNode.getNodeType() == Node.ELEMENT_NODE) {

				Element detectionsElement = (Element) detectionsNode;
				count = Integer.parseInt(detectionsElement.getElementsByTagName("count").item(0).getTextContent());

			} else {
				count = 0;
			}

			detections = new Detections(enginesArrayList, count);
		} else {
			detections = null;
		}
		NodeList responseList = doc.getElementsByTagName("response");

		Node responseNode = responseList.item(0);
		Double pageLoad;
		if (responseNode.getNodeType() == Node.ELEMENT_NODE) {

			Element responseElement = (Element) responseNode;
			pageLoad = Double.parseDouble(responseElement.getElementsByTagName("page_load").item(0).getTextContent());

		} else {
			pageLoad = 0.0;
		}

		JUrlVoidResult result = new JUrlVoidResult(details, detections, pageLoad);

		return result;
	}
}
