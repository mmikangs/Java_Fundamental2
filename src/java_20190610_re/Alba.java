package java_20190610_re;

import java.util.ArrayList;

public class Alba extends Parent {

	String address;

	ArrayList<Alba> list = new ArrayList<Alba>();

	// �����ڸ� ����� ������ �ȳ�����? alt shift s-> o
	public Alba(String name, String cphone, String address) {
		super();
		this.name = name;
		this.cphone = cphone;
		this.address = address;
	}

	public void insert() {
		list.add(new Alba(name, cphone, address));

	}

}
