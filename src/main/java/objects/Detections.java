package objects;

import java.util.ArrayList;

/**
 * The Class Detections.
 * 
 * @author quentin
 */
public class Detections {

	/** The engines. */
	private ArrayList<String> engines;

	/** The count. */
	private Integer count;

	/**
	 * Instantiates a new detections.
	 *
	 * @param engines
	 *            the engines
	 * @param count
	 *            the count
	 */
	public Detections(ArrayList<String> engines, Integer count) {
		super();
		this.engines = engines;
		this.count = count;
	}

	/**
	 * Gets the engines.
	 *
	 * @return the engines
	 */
	public ArrayList<String> getEngines() {
		return engines;
	}

	/**
	 * Gets the count.
	 *
	 * @return the count
	 */
	public Integer getCount() {
		return count;
	}

}
