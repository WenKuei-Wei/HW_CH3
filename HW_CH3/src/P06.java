public class P06 {
	public static void main(String[] args) {
		Carr car1;
		car1 = new Carr();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		System.out.println("�����O" + car1.num);
		System.out.println("�o�q�O" + car1.gas);		
	}
}

class Carr
{
	//Car���O
	int num;
	double gas;
}