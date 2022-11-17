public class P15 {
	public static void main(String[] args) {
		Caraa car1;
		car1 = new Caraa();
		
		int num=12134;
		double gas=20.5;
	
		car1.setnumgas(num,gas);
	}
}

class Caraa
{
	//Car類別
	int num;
	double gas;
	
	void setnumgas(int n,double i)
	{
		num = n;
		System.out.println("車號是" + num);
		gas = i;
		System.out.println("油量是" + gas);		
	}
}