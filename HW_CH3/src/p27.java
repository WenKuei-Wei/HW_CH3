
public class p27 {
public static void main (String [] args) {
	ccar car1;
	car1 = new ccar();
	car1.show();
	
	ccar car2;
	car2 = new ccar(1234,25.0);
	car2.show();
}
}
class ccar{
	private int num;
	private double gas;
	public ccar() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public ccar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("�Ͳ��F������:"+num+"�T�o�q��:"+gas+"�����l");
	}
	public void show() {
		System.out.println("������:"+num);
		System.out.println("�T�o�q��:"+gas);
	}
}

