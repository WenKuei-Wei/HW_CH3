
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
		System.out.println("生產了車子");
	}
	public ccar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("生產了車號為:"+num+"汽油量為:"+gas+"的車子");
	}
	public void show() {
		System.out.println("車號為:"+num);
		System.out.println("汽油量為:"+gas);
	}
}

