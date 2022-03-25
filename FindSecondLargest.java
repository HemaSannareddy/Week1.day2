package Week1.Day2;

import java.util.Arrays;

public class FindSecondLargest {
 public static void main(String[] args) {
	int[] a = {3,2,11,4,6,7};
	Arrays.sort(a);
	System.out.println(a[a.length-2]);
	
}
}
