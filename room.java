
public class room {
	private int dimensions,ceiling,electricboards;

	public int getDimensions() {
		return dimensions;
	}

	public room(int dimensions, int ceiling, int electricboards) {
		super();
		this.dimensions = dimensions;
		this.ceiling = ceiling;
		this.electricboards = electricboards;
	}

	public void setDimensions(int dimensions) {
		this.dimensions = dimensions;
	}

	public int getCeiling() {
		return ceiling;
	}

	public void setCeiling(int ceiling) {
		this.ceiling = ceiling;
	}

	public int getElectricboards() {
		return electricboards;
	}

	public void setElectricboards(int electricboards) {
		this.electricboards = electricboards;
	}
	
	

}
