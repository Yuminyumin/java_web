package test.domain;

public class RequestTestDTO {
	private String id, pwd;
	
	public RequestTestDTO() {
	}

	public RequestTestDTO(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "RequestTestDTO [id=" + id + ", pwd=" + pwd + "]";
	}
	
	
}
