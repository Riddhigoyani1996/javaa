package AssignmentJavaa;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateElement {

	public static void main(String[] args) {
     ArrayList a1=new ArrayList();
     
     a1.add("hello");
     a1.add("testing");
     a1.add("world");
     a1.add("by");
     a1.add("java");
     a1.add("12345678");
     
     
     a1.remove(3);
     System.out.println(a1);
     
     
     Iterator i=a1.iterator();
     while (i.hasNext()) {
      System.out.println(i.next());		
	}
     
	}

}
