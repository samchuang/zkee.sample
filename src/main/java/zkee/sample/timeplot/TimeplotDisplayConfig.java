package zkee.sample.timeplot;


public class TimeplotDisplayConfig {
	private String dotColor;
	private String lineColor;
	private String fillColor;
	private int lineWidth;
	private int eventLineWidth;
	private int dotRadius;
	private boolean showValues;
	private boolean hideTime;
	private boolean hideValue;

	public TimeplotDisplayConfig() {
		super();
	}
	
	public TimeplotDisplayConfig(String lineColor, String fillColor,
			String dotColor, int lineWidth, int eventLineWidth, int dotRadius,
			boolean showValues, boolean hideTime, boolean hideValue) {
		super();
		this.dotColor = dotColor;
		this.lineColor = lineColor;
		this.fillColor = fillColor;
		this.lineWidth = lineWidth;
		this.eventLineWidth = eventLineWidth;
		this.dotRadius = dotRadius;
		this.showValues = showValues;
		this.hideTime = hideTime;
		this.hideValue = hideValue;
	}

	static TimeplotDisplayConfig createDefaultConfig() {
		return new TimeplotDisplayConfig("#088FB8", "#008bb6", "#000000", 1, 1, 2, true, false, false);
	}
	
	public boolean isShowValues() {
		return showValues;
	}

	public void setShowValues(boolean showValues) {
		this.showValues = showValues;
	}

	public boolean isHideTime() {
		return hideTime;
	}

	public void setHideTime(boolean hideTime) {
		this.hideTime = hideTime;
	}

	public boolean isHideValue() {
		return hideValue;
	}

	public void setHideValue(boolean hideValue) {
		this.hideValue = hideValue;
	}

	public String getDotColor() {
		return dotColor;
	}

	public void setDotColor(String dotColor) {
		this.dotColor = dotColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public int getLineWidth() {
		return lineWidth;
	}

	public void setLineWidth(int lineWidth) {
		this.lineWidth = lineWidth;
	}

	public int getEventLineWidth() {
		return eventLineWidth;
	}

	public void setEventLineWidth(int eventLineWidth) {
		this.eventLineWidth = eventLineWidth;
	}

	public int getDotRadius() {
		return dotRadius;
	}

	public void setDotRadius(int dotRadius) {
		this.dotRadius = dotRadius;
	}
}