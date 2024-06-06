import java.util.*;
public class ReverseString 
{
	String str = "";
	String revstring(String name,int index)
	{
		if(index<0)
		return str;
		str=str+name.charAt(index);
		return revstring(name,index-1);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string: ");
		String name=sc.nextLine();
		ReverseString rev=new ReverseString();
		System.out.println(rev.revstring(name,name.length()-1));
	}

}
