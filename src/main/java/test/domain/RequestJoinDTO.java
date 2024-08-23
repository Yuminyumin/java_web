package test.domain;

public class RequestJoinDTO {
	private String id, pwd, name, gender;

	public RequestJoinDTO() {
	}

	public RequestJoinDTO(String id, String pwd, String name, String gender) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.gender = gender;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "RequestJoinDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
}
