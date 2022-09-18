
public class MyAppTriangle {

	public static void main(String[] args) {
		Triangle triangle1=new Triangle(10);
		System.out.println("Base of triangle:" + triangle1.getBase());
		System.out.println("height of triangle:" + triangle1.getHeight());
		double area=triangle1.displayArea();
		System.out.println(area);
		
	}
}
