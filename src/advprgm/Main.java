package advprgm;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {67,23,78,23,99,12,67,75,23};
		int sum=Arrays.stream(arr).distinct().sum();
		System.out.println("Distinct numbers: "+sum);

	}

}
