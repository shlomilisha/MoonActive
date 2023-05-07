
public class submarines {
	String name;
	int size;
	int [] coordinetes;
	String status;
	
	public submarines (String name, int size, int [] coordinetes, String status ) {
		this.name = name;
		this.size = size;
		this.coordinetes = coordinetes;
		this.status = status;
	}
	public submarines (String name, int size, String status ) {
		this.name = name;
		this.size = size;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int[] getCoordinetes() {
		return coordinetes;
	}

	public void setCoordinetes(int[] coordinetes) {
		this.coordinetes = coordinetes;
	}

}
