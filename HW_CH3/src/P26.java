public class P26{
	public static void main(String[] args) {
		Carbbbb car1;
		car1 = new Carbbbb();

		car1.show();
		}
}

class Carbbbb
{
	//Car���O
	private int num;
	private double gas;
	
	public Carbbbb() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void show()
	{
		System.out.println("�����O" + num);
		System.out.println("�o�q�O" + gas);
	}
}