
public class monitor
{
	private int size,weight,resultion;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public monitor(int size, int weight, int resultion) {
		super();
		this.size = size;
		this.weight = weight;
		this.resultion = resultion;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getResultion() {
		return resultion;
	}

	public void setResultion(int resultion) {
		this.resultion = resultion;
	}
}