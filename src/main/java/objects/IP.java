package objects;

/**
 * The Class IP.
 * 
 * @author quentin
 */
public class IP {

	/** The address. */
	private String address;

	/** The hostname. */
	private String hostname;

	/** The asn. */
	private Integer asn;

	/** The asname. */
	private String asname;

	/** The country code. */
	private String countryCode;

	/** The country name. */
	private String countryName;

	/** The region name. */
	private String regionName;

	/** The city name. */
	private String cityName;

	/** The continent code. */
	private String continentCode;

	/** The continent name. */
	private String continentName;

	/** The latitude. */
	private Double latitude;

	/** The longitude. */
	private Double longitude;

	/**
	 * Instantiates a new ip.
	 *
	 * @param address
	 *            the address
	 * @param hostname
	 *            the hostname
	 * @param asn
	 *            the asn
	 * @param asname
	 *            the asname
	 * @param countryCode
	 *            the country code
	 * @param countryName
	 *            the country name
	 * @param regionName
	 *            the region name
	 * @param cityName
	 *            the city name
	 * @param continentCode
	 *            the continent code
	 * @param continentName
	 *            the continent name
	 * @param latitude
	 *            the latitude
	 * @param longitude
	 *            the longitude
	 */
	public IP(String address, String hostname, Integer asn, String asname, String countryCode, String countryName,
			String regionName, String cityName, String continentCode, String continentName, Double latitude,
			Double longitude) {
		super();
		this.address = address;
		this.hostname = hostname;
		this.asn = asn;
		this.asname = asname;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.regionName = regionName;
		this.cityName = cityName;
		this.continentCode = continentCode;
		this.continentName = continentName;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Gets the hostname.
	 *
	 * @return the hostname
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * Gets the asn.
	 *
	 * @return the asn
	 */
	public Integer getAsn() {
		return asn;
	}

	/**
	 * Gets the asname.
	 *
	 * @return the asname
	 */
	public String getAsname() {
		return asname;
	}

	/**
	 * Gets the country code.
	 *
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * Gets the country name.
	 *
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * Gets the region name.
	 *
	 * @return the regionName
	 */
	public String getRegionName() {
		return regionName;
	}

	/**
	 * Gets the city name.
	 *
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * Gets the continent code.
	 *
	 * @return the continentCode
	 */
	public String getContinentCode() {
		return continentCode;
	}

	/**
	 * Gets the continent name.
	 *
	 * @return the continentName
	 */
	public String getContinentName() {
		return continentName;
	}

	/**
	 * Gets the latitude.
	 *
	 * @return the latitude
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * Gets the longitude.
	 *
	 * @return the longitude
	 */
	public Double getLongitude() {
		return longitude;
	}

}
