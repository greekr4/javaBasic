package sec3;

public class Exercise04 {

	public static void main(String[] args) {
		int penciles=534,students=30;
		//학생 한 명이 가지는 연필 수
		int pencilsPerStudent = penciles / students;
		System.out.println(pencilsPerStudent);
		
		//남은 연필 수
		int pencilsLeft = penciles % students;
		System.out.println(pencilsLeft);

	}

}
