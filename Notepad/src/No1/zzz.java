package No1;

import java.util.Arrays;

public class zzz {

	public static void main(String[] args) {
		int[] numbers = {5,0,2,7};
        int[] answer = {};
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++) {
        	for(int j=1;j<numbers.length;j++) {
        		if (j>i) {
        			System.out.println(numbers[i]+"+"+numbers[j]);
        			System.out.println(numbers[i]+numbers[j]);
        			answer[i] = numbers[i]+numbers[j];
        		}
        	}
        	}
        }
        
	}


