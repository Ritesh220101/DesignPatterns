package resources;

public class Hat {
	private String shortName;
	private String longName;
	private double basePrice;
	private double gst;

	public Hat(String shortName, String longName, double basePrice, double gst) {
		super();
		this.shortName = shortName;
		this.longName = longName;
		this.basePrice = basePrice;
		this.gst = gst;
	}

	public String getShortName() {
		return shortName;
	}

	public String getLongName() {
		return longName;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public double getGst() {
		return gst;
	}
}
