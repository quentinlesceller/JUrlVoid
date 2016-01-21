package checker;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import objects.JUrlVoidResult;
import parser.RemainingQueriesParser;
import parser.ResultParser;

/**
 * The Class JUrlVoid.
 * 
 * @author quentin
 */
public class JUrlVoid {

	/** The api key. */
	private String apiKey;

	/**
	 * Instantiates a new j url void.
	 *
	 * @param apiKey
	 *            the api key
	 */
	public JUrlVoid(String apiKey) {
		this.apiKey = apiKey;

	}

	/**
	 * Check url.
	 *
	 * @param url
	 *            the url
	 * @return the j url void result
	 */
	public JUrlVoidResult checkUrl(String url) {
		JUrlVoidResult result;
		String query = "http://api.urlvoid.com/api1000/" + apiKey + "/host/" + url;
		ResultParser parser = new ResultParser();
		try {
			result = parser.parse(query);
		} catch (SAXException | IOException | ParserConfigurationException e) {

			e.printStackTrace();
			result = null;
		}
		return result;
	}

	/**
	 * Gets the remaining queries.
	 *
	 * @return the remaining queries
	 */
	public Integer getRemainingQueries() {
		Integer result;
		String query = "http://api.urlvoid.com/api1000/" + apiKey + "/stats/remained/";
		RemainingQueriesParser parser = new RemainingQueriesParser();
		try {
			result = parser.parse(query);
		} catch (SAXException | IOException | ParserConfigurationException e) {

			e.printStackTrace();
			result = null;
		}
		return result;
	}
}
