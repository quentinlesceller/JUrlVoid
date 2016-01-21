package objects;

/**
 * The Class JUrlVoidResult.
 * 
 * @author quentin
 */
public class JUrlVoidResult {

	/** The details. */
	private Details details;

	/** The detections. */
	private Detections detections;

	/** The page load. */
	private Double pageLoad;

	/**
	 * Instantiates a new j url void result.
	 *
	 * @param details
	 *            the details
	 * @param detections
	 *            the detections
	 * @param pageLoad
	 *            the page load
	 */
	public JUrlVoidResult(Details details, Detections detections, Double pageLoad) {
		super();
		this.details = details;
		this.detections = detections;
		this.pageLoad = pageLoad;
	}

	/**
	 * Gets the details.
	 *
	 * @return the details
	 */
	public Details getDetails() {
		return details;
	}

	/**
	 * Gets the detections.
	 *
	 * @return the detections
	 */
	public Detections getDetections() {
		return detections;
	}

	/**
	 * Gets the page load.
	 *
	 * @return the pageLoad
	 */
	public Double getPageLoad() {
		return pageLoad;
	}

}
