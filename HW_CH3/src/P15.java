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
	//Car���O
	int num;
	double gas;
	
	void setnumgas(int n,double i)
	{
		num = n;
		System.out.println("�����O" + num);
		gas = i;
		System.out.println("�o�q�O" + gas);		
	}
}