package sec3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		int[] intArr = {20,40,35,25};
		String[] strArr = {"김","이","박"};
		String[] nameArr = {"김","이","박"};
		Object[] objArr = {1,"1",2,"2",3,4};
		
		System.out.println("요소의 수 : " + strArr.length);
		
		for (int i=0;i<strArr.length;i++)
		{
			System.out.print(strArr[i]+", ");
		}
		Set set1 = new HashSet();
		for(int i=0;i<strArr.length;i++) {
		 set1.add(strArr[i]);
		}
		System.out.println("\n"+ set1);
		
		
		Set set2 = new HashSet();
		for(int i=0;i<nameArr.length;i++) {
		 set2.add(nameArr[i]);
		}
		System.out.println(set2);
		
		Set set3 = new HashSet();
		for(int i=0;i<intArr.length;i++) {
		 set3.add(intArr[i]);
		}
		System.out.println(set3);
		System.out.println("1안에 2이 포함?"+set1.containsAll(set2));
		System.out.println("1안에 3이 포함?"+set1.containsAll(set3));
		Iterator it = set1.iterator();
		while(it.hasNext())
		{
			System.out.println("요소 : " + it.next());
		}
	}

}
