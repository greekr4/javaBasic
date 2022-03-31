package sec1;

public class Bread2 {

	
		//croissant, cream, bean
	public static void main(String[] args) {
	
		Bread cream = new Bread("크림빵","생크림",120,1500,10);
		Bread croissant = new Bread("크로아상","밀가루",100,500,5);
		Bread bean = new Bread("단팥빵","팥",200,500,1);
		
		
		
		System.out.println("빵이름 : "+cream.getName());
		System.out.println("재료 : "+cream.getMatrial());
		System.out.println("중량 : "+cream.getGram());
		System.out.println("가격 : "+cream.getPrice());
		System.out.println("남은개수 : "+cream.getCnt());
		
		
		System.out.println(cream.computerTotal());
		Bread aa = new Bread();
		aa.info();
		
		
		
	}

}
