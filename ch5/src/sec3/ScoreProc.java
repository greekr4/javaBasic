package sec3;

public class ScoreProc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"길정훈","김동협","김성민","김태균","신길호"};
		int[][] scores = {{90,75,100},{95,90,65},{80,85,95},{85,80,85},{70,90,80}};
		int[] tot = {0,0,0};				//과목별 총점
		float[] avg = {0.0f,0.0f,0.0f};		//과목별 평균
		int total = 0;						//전체 총점
		float average = 0.0f;				//전체 평균
		int a = 0;
		System.out.println("이름\t국어\t영어\t수학");
		for(int i=0;i<names.length;i++)
		{
			System.out.print(names[i]+"\t");
			for(int j=0;j<scores[i].length;j++)
			{
				System.out.print(scores[i][j]+"\t");
				tot[j]+=scores[i][j];
				a++;
			}
			System.out.println("");

		}
		for (int i=0;i<tot.length;i++)
		{
			total += tot[i];
			avg[i] = (float) (tot[i]) / (names.length);
		}
		average = (float)total / a;
		
		
		System.out.println("과목별총점\t"+tot[0]+"\t"+tot[1]+"\t"+tot[2]);
		System.out.println("과목별평균\t"+avg[0]+"\t"+avg[1]+"\t"+avg[2]);
		System.out.print("전체총점\t"+total+"\t전체평균\t");
		System.out.printf("%3.2f",average);		//출력 형식 인자
		
		
		
		

		
		
		
	}

}
