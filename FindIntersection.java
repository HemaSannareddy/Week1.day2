package Week1.Day2;

import java.util.Arrays;
public class FindIntersection{

public static void main(String[] args) {
			int[] a = {3,2,11,4,6,7};
			int[] b = {1,2,8,4,9,7};
			int length = a.length;
			int length1 = b.length;
			Arrays.sort(a);
			Arrays.sort(b);
			for (int k=0; k<length; k++) {
				for (int l=0; l<length1; l++) {
					if (a[k]==b[l]) {
						System.out.println(a[k]);
					}
				}
	}
}
}

