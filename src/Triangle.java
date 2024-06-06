import java.util.*;
import java.lang.Math;
public class Triangle implements Shape
{
	Triangle(double sideOne,double sideTwo,double sideThree)
	{
		this.sideOne=sideOne;
		this.sideTwo=sideTwo;
		this.sideThree=sideThree;
	}
   double sideOne,sideTwo,sideThree;
   public double getArea()
   {
	   double s=(sideOne+sideTwo+sideThree)/2;
	   System.out.println(s);
	   double AreaOfTriangle=Math.sqrt(s*(s-this.sideOne)*(s-this.sideTwo)*(s-this.sideThree));
	   System.out.println(AreaOfTriangle);
	   return AreaOfTriangle;
   }
   public static void main(String[] args)
   {
	   double s1,s2,s3;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the sideone: ");
	   s1=sc.nextDouble();
	   System.out.println("enter the sideTwo: ");
	   s2=sc.nextDouble();
	   System.out.println("enter the sideThree: ");
	   s3=sc.nextDouble();
	   Shape shape=new Triangle(s1,s2,s3);
	   double TriangleArea=shape.getArea();
	   System.out.println("the area of Triangle: "+TriangleArea);
   }
}
