package java_20190530;

public class Member {

	//instance������ private�� �ٿ��� ������ ����� ��.
	//�ܺο��� ������ ��Ű�� �ʴ� �� - ������ ����ȭ
	//instance������ �ϸ� ���������� private�� �ۼ��� ��.
	//���� ������ �ٲ��ִ� �Լ��� ���� ��
	//name�̶�� ������ �ٲ��ִ�setname
	//���������ڰ� �ʿ��� -> private
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
 * �� �κ��� ���� �Է��� �� ��!!!!!! (�׷��� ���� �� ��ư���� ALT+SHIFT+S ������ R ������ TAB ������ ENTER ������ TAB TAB TAB TAB (4�� ) ������ ENTER������ �ȴ�.)
 * //������ �� �ִ� setter�� getter�Լ��� ���� ������ ����ȭ�Ѵ�.
	//setter�Լ�
	// �� �Լ��� �ܺο��� ���̰� �ϴ� ��.
	public void setName(String n){
		name = n;
	}
	
	//getter�Լ�
	public String getName(){
		return name;
	}
	
	*/
}
