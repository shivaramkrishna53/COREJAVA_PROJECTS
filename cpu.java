
public class cpu {

public int getProcessor() {
		return processor;
	}

	public void setProcessor(int processor) {
		this.processor = processor;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}

	public int getCd() {
		return cd;
	}

	public void setCd(int cd) {
		this.cd = cd;
	}

public cpu(int processor, int ram, int rom, int cd) {
		super();
		this.processor = processor;
		this.ram = ram;
		this.rom = rom;
		this.cd = cd;
	}

private	int processor,ram,rom,cd;
	
}
