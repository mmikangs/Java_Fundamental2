package java_20190530;

public class Member {

	//instance변수를 private를 붙여서 정보를 숨기는 것.
	//외부에는 공개를 시키지 않는 것 - 정보의 은닉화
	//instance변수를 하면 습관적으로 private를 작성할 것.
	//얘의 정보를 바꿔주는 함수를 만들 것
	//name이라는 정보를 바꿔주는setname
	//접근한정자가 필요해 -> private
	private String name;
	private String cphone;
	private String address;
	private String zipcode;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCphone() {
		return cphone;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	
/*	
 * 이 부분은 직접 입력해 본 것!!!!!! (그러나 오른 쪽 버튼에서 ALT+SHIFT+S 누르고 R 누르고 TAB 누르고 ENTER 누르고 TAB TAB TAB TAB (4번 ) 누르고 ENTER누르면 된다.)
 * //변경할 수 있는 setter나 getter함수를 만들어서 정보를 은닉화한다.
	//setter함수
	// 이 함수는 외부에서 보이게 하는 것.
	public void setName(String n){
		name = n;
	}
	
	//getter함수
	public String getName(){
		return name;
	}
	
	*/
}
