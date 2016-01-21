package parser;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * The Class RemainingQueriesParser.
 * 
 * @author quentin
 */
public class RemainingQueriesParser {

	/**
	 * Parses the.
	 *
	 * @param query
	 *            the query
	 * @return the integer
	 * @throws ParserConfigurationException
	 *             the parser configuration exception
	 * @throws MalformedURLException
	 *             the malformed url exception
	 * @throws SAXException
	 *             the SAX exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public Integer parse(String query)
			throws ParserConfigurationException, MalformedURLException, SAXException, IOException {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new URL(query).openStream());

		doc.getDocumentElement().normalize();

		NodeList responseList = doc.getElementsByTagName("response");

		Node responseNode = responseList.item(0);

		Integer remainingQueries;
		if (responseNode.getNodeType() == Node.ELEMENT_NODE) {

			Element responseElement = (Element) responseNode;
			remainingQueries = Integer
					.parseInt(responseElement.getElementsByTagName("queriesRemained").item(0).getTextContent());

		} else {
			remainingQueries = 0;
		}

		return remainingQueries;
	}
}
