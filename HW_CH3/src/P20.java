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
	//Car���O
	int num;
	double gas;
	
	void show()
	{
		System.out.println("�����O" + num);
		System.out.println("�o�q�O" + gas);
	}
}