package Week1.Day2;
import java.util.Arrays;
public class MissingElementInAnArray {
public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		int length = arr.length;
		for (int i =0; i<length; i++) {
			int num = arr [i+1] -1;
			if (num!=arr[i]) {
				System.out.println("Missing Num: " + num);
				break;
			}
		}
	}

}	


