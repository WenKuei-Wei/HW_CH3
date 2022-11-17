public class P26{
	public static void main(String[] args) {
		Carbbbb car1;
		car1 = new Carbbbb();

		car1.show();
		}
}

class Carbbbb
{
	//Car類別
	private int num;
	private double gas;
	
	public Carbbbb() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	public void show()
	{
		System.out.println("車號是" + num);
		System.out.println("油量是" + gas);
	}
}