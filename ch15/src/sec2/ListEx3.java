package sec2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		String[] names = {"1번","2번","3번","4번","5번","6번","7번"};
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		long start;
		long end;
		
		start = System.nanoTime();
		for (String name : names) {
			list1.add(name);
		}
		end = System.nanoTime();
		System.out.println(end-start);
		
		
		start = System.nanoTime();
		for (String name : names) {
			list2.add(name);
		}
		end = System.nanoTime();
		System.out.println(end-start);
		
		start = System.nanoTime();
		for (int i=0;i<list1.size();i++)
		{
		System.out.print(list1.get(i));
		}
		end = System.nanoTime();
		System.out.println();
		System.out.println(end-start);
		
		
		
		start = System.nanoTime();
		for (int i=0;i<list2.size();i++)
		{
		System.out.print(list2.get(i));
		}
		end = System.nanoTime();
		System.out.println();
		System.out.println(end-start);
	}

}
