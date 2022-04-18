package sec2;

import java.util.ArrayList;
import java.util.List;

class Human{
	private String name;
	private int sno;
	private int age;
	public String getName() {		return name;	}
	public void setName(String name) {		this.name = name;	}
	public int getSno() {		return sno;	}
	public void setSno(int sno) {		this.sno = sno;	}
	public int getAge() {		return age;	}
	public void setAge(int age) {		this.age = age;	}
	
}
public class ListEx1 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("111");
		list1.add("222");
		list1.add("333");
		System.out.println(list1.size());
		System.out.println(list1);
		for(String name : list1) {
			System.out.println(name);
		}
		String irum = list1.get(1);
		System.out.println(irum);
		list1.add("444");
		list1.remove(1);
		System.out.println();
		System.out.println(list1);
		
		List<Human> h1 = new ArrayList<Human>();
		Human m1 = new Human();
		m1.setName("ㄱㄱㄱ");
		m1.setSno(5);
		m1.setAge(39);
		h1.add(m1);
		
		Human m2 = new Human();
		m2.setName("ㄴㄴㄴ");
		m2.setSno(6);
		m2.setAge(28);
		h1.add(m2);
		
		Human m3 = new Human();
		m3.setName("ㄷㄷㄷ");
		m3.setSno(7);
		m3.setAge(40);
		h1.add(m3);
		
		System.out.println("번호\t이름\t나이");
		for(Human h : h1) {
			System.out.print(h.getSno()+"\t");
			System.out.print(h.getName()+"\t");
			System.out.print(h.getAge()+"\n");			
		}
		
		
	}

}
