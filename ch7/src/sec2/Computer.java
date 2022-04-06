package sec2;

public class Computer extends Calculator{

	@Override
	double areaCircle(double r) {
		System.out.println("입력하신 반지름 : "+r+"의 면적을 구합니다.2");
		return Math.PI * r * r;
	}
	
}
