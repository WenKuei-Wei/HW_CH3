public class P11 {
	public static void main(String[] args) {
		Carrrrr car1;
		car1 = new Carrrrr();
		
		car1.num = 1234;
		car1.gas = 20.5;		
		car1.show();		
		car1.show();		
		car1.show();		
		car1.show();
	}
}

class Carrrrr
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