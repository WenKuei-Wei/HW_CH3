public class P06 {
	public static void main(String[] args) {
		Carr car1;
		car1 = new Carr();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		System.out.println("車號是" + car1.num);
		System.out.println("油量是" + car1.gas);		
	}
}

class Carr
{
	//Car類別
	int num;
	double gas;
}