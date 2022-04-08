package sec1;
class Member {
	public String id;
	Member(String id){this.id=id;}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member mem = (Member) obj;
			if(id.equals(mem.id)) {
				return true;
			}
		}
		return false;
	}
}
public class ObjectEx2 {

	public static void main(String[] args) {
		Member obj1 = new Member("kkt");
		Member obj2 = new Member("yeeun");
		Member obj3 = new Member("kkt");
		if(obj1.equals(obj2)) {
			System.out.println("obj1 = obj2 : dd");
		} else
		{
			System.out.println("obj1 = obj2 : ss");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1 = obj3 : dd");
		} else
		{
			System.out.println("obj1 = obj3 : ss");
		}
	

	}

}
