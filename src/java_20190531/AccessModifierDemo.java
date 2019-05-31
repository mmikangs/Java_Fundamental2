package java_20190531;

//Ctrl+shift+O (다른package에서 가져올 때 써야 class를 인식할 수 있음!!!!)
import java_20190531.tt.Cat;

//상속했다고 해서 부모님꺼 다 쓸 수 있는거 아님!!!
//private은 상속해도 절대 안돼!!!!!!!!!!!
//protect는 상속받으면 가능해~
//접근한정자로 제한하면 안되는 것도 있는데 protect는 상속받으면 줄 수 있어.

public class AccessModifierDemo extends Cat {

	public static void main(String[] args) {
		Car c = new Car();

		// modelNumber의 경우 private을 했기 때문에 class내에서만 정의가 가능하다. (setters와
		// getters를 이용하거나 public으로 바꾸거나!!!!!!!!)
		// c.modelNumber = "68오 4395";
		// 주석은 코드 위에다가 작성한다. 밑에 달면 안돼!!!!!주석을 읽고 밑에 코드를 보면 된다.!!!!!!!

		// default는 같은 패키지(디렉토리)에서 접근 가능.
		c.color = "red";

		// 서로 다른 패키지에 있어야만 의미가 있어.
		// protected의 정의는 서로 다른 패키지에서 상속받는 경우 접근가능.
		c.doorCount = 5;

		// 서로 다른 패키지에서 접근 가능
		// underscore를 붙이면 단위수 구분이 가능해.딱 알 수 있도록
		c.price = 10_000_000;

		System.out.println(c.color);
		System.out.println(c.doorCount);
		System.out.println(c.price);

		// package안에 잇는 같은 class는 인식하는데 package안에 있는 다른 package는 인식하지 못해
		Cat cat = new Cat();

		cat.nickName = "tomcat";


		AccessModifierDemo a = new AccessModifierDemo();

		// Cat class를 상속받으면, public뿐만 아니라 protected도 사용 가능. (even though, packages are different. 서로 다른 package라고 할지라도)
		// protected도 사용이 가능하다.
		a.age = 10;
		a.nickName = "먼지";

	}

}
