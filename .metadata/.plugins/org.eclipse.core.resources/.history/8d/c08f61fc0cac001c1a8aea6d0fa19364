package sec1;

public class Array3 {

	public static void main(String[] args) {
		String[] names = {"김태균","김효민","신길호","여승원","이규진"};
		//5명의 3과목 점수 선언 jum[][]
		int[][] jum = {{100,80,90},{70,90,80},{60,90,80},{90,80,70},{85,95,85}};
		int hap = 0;
		float py = 0.0f;
		int[] tot2 = new int[names.length];
		float[] avg2 = new float[names.length];
		int[] tot = new int[names.length];
		float[] avg = new float[names.length];
		
		
		
		System.out.println("성명	국어	영어	수학	총점	평균");
		System.out.println("*********************************************");
		for (int i=0;i<names.length;i++)
		{
			System.out.print(names[i]+"	");
			for (int j=0;j<jum[i].length;j++)
			{
				System.out.print(jum[i][j]+"	");
				tot[i] += jum[i][j];
				avg[i] = tot[i] / 3.0f;
			}
			System.out.print(tot[i] + "	" + avg[i]);
			System.out.println("");
			
		}
		
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<5;j++)
			{
				tot2[i] += jum[j][i];
			}
		}
		
		for (int i=0;i<3;i++)
		{
			avg2[i] = (tot2[i]) / (names.length);
		}
			
		for (int i=0;i<tot.length;i++)
		{
			hap += tot[i];
		}
		for (int i=0;i<avg.length;i++)
		{
			py += avg[i];
		}
			py = py / avg.length;
		System.out.println("*********************************************");
		System.out.print("과목총점");
		for (int i=0;i<3;i++)
		{
		System.out.print("	"+tot2[i]);
		}
		System.out.println("");
		System.out.print("과목평균");
		for (int i=0;i<3;i++)
		{
		System.out.print("	"+avg2[i]);
		}
		System.out.println("");
		System.out.println("*********************************************");
		System.out.println("전체총점	"+hap);
		System.out.println("전체평균	"+py);

		

	}

}
