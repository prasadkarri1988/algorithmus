package algorithmus.test.com;

import java.util.Arrays;

public class FindMissingElement {

	public static int solution(int[] A) {
		int result = 0;
		if (A.length == 1) {
			if (A[0] == 1) {
				return A.length + 1;
			} 
		}
		Arrays.sort(A);

		for (int i = 0; i < A.length; i++) {
			if (A[i] != i + 1) {
				break;
			}else {
				result=result+1;
			}
		}
		return result+1;
	}

	public static void main(String args[]) {
		int[] A = {1};
		System.out.println(solution(A));

	}

}
