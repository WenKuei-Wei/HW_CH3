public class P17 {
	public static void main(String[] args) {
		Caraaa car1;
		car1 = new Caraaa();
		car1.setnumgas(1234,20.5);
		int numm = car1.getnum();
		double gass = car1.getgas();
		System.out.println("�����O" + numm);
		System.out.println("�o�q�O" + gass);	
	}
}

class Caraaa
{
	//Car���O
	int num;
	double gas;
	
	void setnumgas(int n,double i)
	{
		num = n;
		System.out.println("�����]�w��");
		gas = i;
		System.out.println("�o�q�]�w��");		
	}
	int getnum()
	{
		System.out.println("�լd������...");
		return num;	
	}
	double getgas()
	{
		System.out.println("�լd�o�q��...");
		return gas;	
	}	
	
}