
public class p28 {
public static void main (String [] args) {
	Car2 car1;
	car1 = new Car2();
	car1.show();
	
	Car2 car2;
	car2 = new Car2(1234,25.0);
	car2.show();
}
}
class Car2{
	private int num;
	private double gas;
	public Car2() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public Car2(int n, double g) {
		this();
		num = n;
		gas = g;
		System.out.println("�Ͳ��F������:"+num+"�T�o�q��:"+gas+"�����l");
	}
	public void show() {
		System.out.println("������:"+num);
		System.out.println("�T�o�q��:"+gas);
	}
}

