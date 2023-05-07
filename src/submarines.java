
public class submarines {
	String name;
	int size;
	int [] coordinates;
	String status;
	
	public submarines (String name, int size, int [] coordinates, String status ) {
		this.name = name;
		this.size = size;
		this.coordinates = coordinates;
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
		return coordinates;
	}

	public void setCoordinetes(int[] coordinetes) {
		this.coordinates = coordinetes;
	}

}
