package test.domain;

public class ResponseTestDTO {
	private String name;

	public ResponseTestDTO() {
	}

	public ResponseTestDTO(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ResponseTestDTO [name=" + name + "]";
	}
	
}
