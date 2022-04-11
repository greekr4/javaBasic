package sec3;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random a = new Random();
		int[] selNum = new int[6];
		for(int i=0;i<6;i++)
		{
		System.out.println(a.nextInt(45)+1);
		}
	}

}
