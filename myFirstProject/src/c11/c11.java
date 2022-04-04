package c11;

import java.util.ArrayList;
import java.util.Iterator;

public class c11 {
	public static void main(String[]args)
	{
	ArrayList a1= new ArrayList();
	a1.add(10);
	a1.add(-5);
	a1.add(10);
	System.out.println(a1);
	Iterator i=a1.iterator();
	while (i.hasNext())
	{
	System.out.println(i.next());
	}
	}

}
