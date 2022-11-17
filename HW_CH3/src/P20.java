public class P20 {
	public static void main(String[] args) {
		Carb car1;
		car1 = new Carb();
		car1.num = 1234;
		car1.gas = -10;
		
		car1.show();
		
	}
}

class Carb
{
	//Car類別
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車號是" + num);
		System.out.println("油量是" + gas);
	}
}