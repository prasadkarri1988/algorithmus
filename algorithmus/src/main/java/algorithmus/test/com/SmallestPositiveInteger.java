package algorithmus.test.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author prasad
 * 
 *         Write a function:
 * 
 *         class Solution { public int solution(int[] A); }
 * 
 *         that, given an array A of N integers, returns the smallest positive
 *         integer (greater than 0) that does not occur in A.
 * 
 *         For example, given A = [1, 3, 6, 4, 1, 2], the function should return
 *         5.
 * 
 *         Given A = [1, 2, 3], the function should return 4.
 * 
 *         Given A = [−1, −3], the function should return 1.
 * 
 *         Write an efficient algorithm for the following assumptions:
 * 
 *         N is an integer within the range [1..100,000]; each element of array
 *         A is an integer within the range [−1,000,000..1,000,000].
 *
 */
public class SmallestPositiveInteger {

	public int solution(int[] A) {

		int N = A.length;
		Set<Integer> set = new HashSet<Integer>();
		for (int a : A) {
			if (a > 0) {
				set.add(a);
			}
		}
		for (int i = 1; i <= N + 1; i++) {
			if (!set.contains(i)) {
				return i;
			}
		}
		return 1;
	}
}


public class SmallestPositiveInteger {

	public static int solution(int[] A) {
		Arrays.sort(A);
		int missingNumber = 1, i = 0,status=0;

		if (A.length == 1) {
			if (A[0] > 1) {
				return 1;
			} else {
				if (A[0] < 1) {
					return 1;
				} else {
					return A[0] + 1;
				}
			}

		}

		for (i = 0; i < A.length; i++) {
			if(A[i]<1) {
				status=2;
				continue;
			}
			if (A[i] == missingNumber) {
				status=1;
				continue;
			} else {
				if(status==0) {
					return missingNumber;
				}
				if (missingNumber!= A[i]) {
					return missingNumber;
				} else {
					return missingNumber + 1;
				}
			}
		}
		if (i == A.length &&  status!=2) {
			return missingNumber + 1;
		}

		return missingNumber;
	}

	
	public static void main(String args[]) {
		int[] a = {1,2};
		int i = solution(a);
		System.out.println(i);
	}
}




