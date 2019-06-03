package java_20190603;

import java.lang.*;

class A extends Object {
	A() {
		super();
	}

}

class B extends A {
	B() {
		super();
	}
}

// class의 접근한정자와 일치한다. 그래서 public 붙임!!!
public class SuperDemo extends Object {

	public SuperDemo() {

		super();

	}
}
