
public class CircumferenceTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1= new Circle();   //Circle类型的变量c1
		c1.radius= 50;   //c1的半径
		Circle c2 = new Circle();
		c2.radius=10;
		double circum1= c1.circumference();   //c1的circumstance方法值等于circum1
		double circum2= c2.circumference();
		System.out.println("Circle 1 has circumference"+circum1);
		System.out.print("Circle 2 has circumference"+circum2);


	}

}
