public class P12 {
	public static void main(String[] args) {
		Carrrrrr car1;
		car1 = new Carrrrrr();
		
		car1.num = 1234;
		car1.gas = 20.5;		
		car1.showCar();		
		
	}
}

class Carrrrrr
{
	//Car類別
	int num;
	double gas;
	
	void show()
	{
		System.out.println("車號是" + num);
		System.out.println("油量是" + gas);
	}
	
	void showCar()
	{
		System.out.println("顯示車子資訊 : ");
		show();
		
	}
}