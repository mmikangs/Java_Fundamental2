package java_20190604;

public class OverrdingDemo {
	public static void main(String[] args) {
		//Shape shape = new Shape();
		
		Triangle t = new Triangle();
		t.draw();
		
		Rectangle r = new Rectangle();
		r.draw();
		
		Shape s = new Triangle();
		s.name = "�ﰢ��";
		s.degree = 60;
		s.drawLine();
		s.draw();//Shape�� draw() ȣ����� �ʰ� Triangle��  draw() ȣ���
		//s.dot = "";
		//s.angleDegree = 180;
		//s.drawCoordinate();
	}
}










