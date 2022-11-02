public abstract class Shape {
	int x,y,r;
	void printArea() {
		
	}

}

public class Rectangle extends Shape {
	Rectangle(int len,int bre){
		x=len;
		y=bre;
	}
	void printArea() {
		int area;
		area=x*y;
		System.out.println("area of rectangle is:"+area);
	}

}
public class Triangle extends Shape{
	Triangle(int len,int bre){
		x=len;
		y=bre;
	}
	void printArea() {
		double area;
		area=0.5*x*y;
		System.out.println("area of triangle :"+area);
	}
	
}
public class Circle extends Shape {
	Circle(int rad){
		r=rad;
	}
	void printArea() {
		double area;
		area=3.14*r*r;
		System.out.println("area of circle:"+area);
	}

}
public class AreaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle ob1=new Triangle(3,4);
		Circle ob2=new Circle(2);
		Rectangle ob3=new Rectangle(4,5);
		ob1.printArea();
		ob2.printArea();
		ob3.printArea();
		

	}

}
