public class P09 {
	public static void main(String[] args) {
		Carrrr car1;
		car1 = new Carrrr();
		
		car1.num = 1234;
		car1.gas = 20.5;		
	}
}

class Carrrr
{
	//Car類別
	int num;
	double gas;
	
	void show()
	{
		System.out.println("1車號是" + num);
		System.out.println("1油量是" + gas);
	}
}