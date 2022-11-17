public class P17 {
	public static void main(String[] args) {
		Caraaa car1;
		car1 = new Caraaa();
		car1.setnumgas(1234,20.5);
		int numm = car1.getnum();
		double gass = car1.getgas();
		System.out.println("車號是" + numm);
		System.out.println("油量是" + gass);	
	}
}

class Caraaa
{
	//Car類別
	int num;
	double gas;
	
	void setnumgas(int n,double i)
	{
		num = n;
		System.out.println("車號設定中");
		gas = i;
		System.out.println("油量設定中");		
	}
	int getnum()
	{
		System.out.println("調查車號中...");
		return num;	
	}
	double getgas()
	{
		System.out.println("調查油量中...");
		return gas;	
	}	
	
}