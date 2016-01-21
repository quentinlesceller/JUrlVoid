package objects;

/**
 * The Class Details.
 * 
 * @author quentin
 */
public class Details {

	/** The host. */
	private String host;

	/** The updated. */
	private Integer updated;

	/** The http response code. */
	private Integer httpResponseCode;

	/** The domain age. */
	private Integer domainAge;

	/** The google page rank. */
	private Integer googlePageRank;

	/** The alexa rank. */
	private Integer alexaRank;

	/** The connect time. */
	private Double connectTime;

	/** The header size. */
	private Integer headerSize;

	/** The download size. */
	private Integer downloadSize;

	/** The download speed. */
	private Integer downloadSpeed;

	/** The external url redirect. */
	private String externalUrlRedirect;

	/** The ip. */
	private IP ip;

	/**
	 * Instantiates a new details.
	 *
	 * @param host
	 *            the host
	 * @param updated
	 *            the updated
	 * @param httpResponseCode
	 *            the h ttp response code
	 * @param domainAge
	 *            the domain age
	 * @param googlePageRank
	 *            the google page rank
	 * @param alexaRank
	 *            the alexa rank
	 * @param connectTime
	 *            the connect time
	 * @param headerSize
	 *            the header size
	 * @param downloadSize
	 *            the download size
	 * @param downloadSpeed
	 *            the download speed
	 * @param externalUrlRedirect
	 *            the external url redirect
	 * @param ip
	 *            the ip
	 */
	public Details(String host, Integer updated, Integer httpResponseCode, Integer domainAge, Integer googlePageRank,
			Integer alexaRank, Double connectTime, Integer headerSize, Integer downloadSize, Integer downloadSpeed,
			String externalUrlRedirect, IP ip) {
		super();
		this.host = host;
		this.updated = updated;
		this.httpResponseCode = httpResponseCode;
		this.domainAge = domainAge;
		this.googlePageRank = googlePageRank;
		this.alexaRank = alexaRank;
		this.connectTime = connectTime;
		this.headerSize = headerSize;
		this.downloadSize = downloadSize;
		this.downloadSpeed = downloadSpeed;
		this.externalUrlRedirect = externalUrlRedirect;
		this.ip = ip;
	}

	/**
	 * Gets the ip.
	 *
	 * @return the ip
	 */
	public IP getIp() {
		return ip;
	}

	/**
	 * Gets the host.
	 *
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * Gets the updated.
	 *
	 * @return the updated
	 */
	public Integer getUpdated() {
		return updated;
	}

	/**
	 * Gets the HTTP response code.
	 *
	 * @return the httpResponseCode
	 */
	public Integer getHTTPResponseCode() {
		return httpResponseCode;
	}

	/**
	 * Gets the domain age.
	 *
	 * @return the domainAge
	 */
	public Integer getDomainAge() {
		return domainAge;
	}

	/**
	 * Gets the google page rank.
	 *
	 * @return the googlePageRank
	 */
	public Integer getGooglePageRank() {
		return googlePageRank;
	}

	/**
	 * Gets the alexa rank.
	 *
	 * @return the alexaRank
	 */
	public Integer getAlexaRank() {
		return alexaRank;
	}

	/**
	 * Gets the connect time.
	 *
	 * @return the connectTime
	 */
	public Double getConnectTime() {
		return connectTime;
	}

	/**
	 * Gets the header size.
	 *
	 * @return the headerSize
	 */
	public Integer getHeaderSize() {
		return headerSize;
	}

	/**
	 * Gets the download size.
	 *
	 * @return the downloadSize
	 */
	public Integer getDownloadSize() {
		return downloadSize;
	}

	/**
	 * Gets the download speed.
	 *
	 * @return the downloadSpeed
	 */
	public Integer getDownloadSpeed() {
		return downloadSpeed;
	}

	/**
	 * Gets the external url redirect.
	 *
	 * @return the externalUrlRedirect
	 */
	public String getExternalUrlRedirect() {
		return externalUrlRedirect;
	}

}
