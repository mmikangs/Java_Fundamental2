package java_20190607;

public class Member {

	private String name;
	private String id;

	public Member(String name, String id) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString(){
		return "아이디 : " +id+", 이름 :" +name ;
	}
	
}
