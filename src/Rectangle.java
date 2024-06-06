import java.util.*;
public class Rectangle implements Shape
{
	double length;
	double breadth;
	Rectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
   public double getArea()
   {
	   return this.length*this.breadth;
   }
   public static void main(String[] ar)
   {
	   double l,b;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the length: ");
	   l=sc.nextDouble();
	   System.out.println("enter the breadth: ");
	   b=sc.nextDouble();
	   Shape shape=new Rectangle(l,b); 
	   double RectangleArea=shape.getArea();
	   System.out.println("the area of rectangle: "+RectangleArea);
   }
}

