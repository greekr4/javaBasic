package Exercise;
import java.util.Scanner;
public class BankApplication {
	private static Account2[] accountArry = new Account2[100];
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	boolean run = true;
	while(run) {
		System.out.println("--------------------------------------------");
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("--------------------------------------------");
		System.out.print("선택> ");
		int selectNo = sc.nextInt();
		if(selectNo == 1){createAccount();}
		else if(selectNo == 2){accountList();}
		else if(selectNo == 3){deposit();}
		else if(selectNo == 4){withdraw();}
		else{run = false;
		System.out.println("프로그램 종료");}}}
	public static int findAccount(String ano){		
		for (int i=0;i<accountArry.length;i++)
		{//null이 아닌 배열에 ano와 비교해서 순서 따오기
			if (accountArry[i]!=null && accountArry[i].getAno().equals(ano)) {return i;}
		}
		return -1;
		}
	private static void deposit() {
	System.out.print("계좌번호 입력 > ");
	String cano = sc.next();
	if (findAccount(cano) == -1)
	{System.out.println("계좌를 찾을 수 없습니다.");}
	else{System.out.print("입금 금액 입력 > ");
	int depo = sc.nextInt();
	if (depo > 0){
	System.out.println(depo+"원 입금되었습니다.");
	depo = accountArry[findAccount(cano)].getBalance() + depo;
	accountArry[findAccount(cano)].setBalance(depo);
	} else {System.out.println("금액을 정확하게 입력해주세요.");}}}
	
	
	private static void withdraw() {
	System.out.print("계좌번호 입력 > ");
	String cano = sc.next();
	if (findAccount(cano) == -1)
	{System.out.println("계좌를 찾을 수 없습니다.");}
	else {
	System.out.print("출금 금액 입력 > ");
	int with = sc.nextInt();
	if (with > 0){if ((accountArry[findAccount(cano)].getBalance() - with) >= 0)
	{System.out.println(with+"원 출금되었습니다.");
	with = accountArry[findAccount(cano)].getBalance() - with;
	accountArry[findAccount(cano)].setBalance(with);
	} else {System.out.println("보유중인 금액보다 많이 출금할 수 없습니다.");}
	} else {System.out.println("금액을 정확하게 입력해주세요.");}
	}
	}
	
	public static void accountList()
	{
		System.out.println("\n********************************************");
		System.out.println("계좌번호\t|\t이름\t|\t잔액");
		System.out.println("───────────────────────────────────────────");
		for (int i=0;i<accountArry.length;i++)
		{
			if (accountArry[i]!=null) {
				System.out.print(accountArry[i].getAno()+"\t|\t");
				System.out.print(accountArry[i].getOwner()+"\t|\t");
				System.out.print(accountArry[i].getBalance()+"\n");
			}
		}
		System.out.println("********************************************\n");
	}

	public static void createAccount()
	{
		System.out.print("계좌번호 입력> ");
		String ano2 = sc.next();
		System.out.print("성함 입력> ");
		String owner2 = sc.next();
		System.out.print("초기입금액 입력> ");
		int bal2 = sc.nextInt();
		if (bal2 > 0){
		for (int i=0;i<accountArry.length;i++)
		{
		///중복 계좌 검사
		if (accountArry[i]!=null && accountArry[i].getAno().equals(ano2))
		{
		System.out.println("!!!!계좌번호 중복!!!!");
		return;
		}
		if (accountArry[i]==null){
		accountArry[i] = new Account2(ano2,owner2,bal2);
		return;
		}
		}
		System.out.println("계좌가 생성되었습니다.");
		}else {
		System.out.println("금액을 정확하게 입력해주세요.");
		}
		
	}

}
