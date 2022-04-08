package Ex;



public class LoginEx {

	public static void main(String[] args) {
		try {
			login("whith","12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		try {
			login("blue","54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

	
	
	public static void login(String id, String password) throws NotExistIDException,WrongPasswordException{
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디X");
		}
		if(!password.equals("12345")) {
			throw new WrongPasswordException("비번X");
		}
		
		
	}
	
	

}
