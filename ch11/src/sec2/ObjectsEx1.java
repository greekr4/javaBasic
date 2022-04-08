package sec2;

import java.util.Comparator;

class Student {
	public int sno;
	public String sname;
	public Student(int sno, String sname) {	this.sno = sno;	this.sname = sname;	}
	
}
class StudentCompare implements Comparator<Student>{

	@Override
	public int compare(Student a, Student b) {
		if(a.sno == b.sno && a.sname == b.sname) {
			return 2;
		}else if(a.sno == b.sno || a.sname == b.sname) {
			return 1;
		}
		return 0;
	}
	
}
public class ObjectsEx1 {

	public static void main(String[] args) {
		Student a = new Student(7,"김기태");
		Student b = new Student(7,"이규진");
		Student c = new Student(8,"이규호");
		StudentCompare sc = new StudentCompare();
		System.out.println(sc.compare(a, c));

	}

}
