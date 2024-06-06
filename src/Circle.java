import java.util.*;
public class Circle implements Shape 
{
	double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	public double getArea() 
	{
		return 3.14*radius*radius;
	}
	public static void main(String[] args)
	{
		double r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius: ");
		r=sc.nextDouble();
		Shape shape=new Circle(r);
		double CircleArea=shape.getArea();
		System.out.println(CircleArea);
	}

}
