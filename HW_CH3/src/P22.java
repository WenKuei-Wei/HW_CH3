public class P22{
	public static void main(String[] args) {
		Carbb car1;
		car1 = new Carbb();
		car1.setnumgas(1234,20.5);
		car1.show();
		
		System.out.println("故意設錯一次 : ");
		car1.setnumgas(1234,-22.5);
		car1.show();
		
	}
}

class Carbb
{
	//Car類別
	private int num;
	private double gas;
	
	public void setnumgas(int n,double g) {
		if(g > 0 && g < 100)
		{
			num = n;
			gas = g;
			System.out.println("車號設" + num);
			System.out.println("油量設" + gas);
		}
		else
		{
			num = n;
			gas = g;
			System.out.println(gas + "的汽油量不對歐！導致錯誤了");
		}
	}
	void show()
	{
		System.out.println("車號是" + num);
		System.out.println("油量是" + gas);
	}
}