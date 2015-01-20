package ch.rasc.wampspring.demo.various.grid;

public class SortInfo {
	private String property;

	private SortDirection direction;

	public SortInfo() {
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public SortDirection getDirection() {
		return direction;
	}

	public void setDirection(SortDirection direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "SortInfo [property=" + property + ", direction=" + direction + "]";
	}

}
