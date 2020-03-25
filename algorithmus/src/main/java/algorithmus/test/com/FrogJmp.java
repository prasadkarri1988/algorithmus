package algorithmus.test.com;

public class FrogJmp {

	public static int solution(int X, int Y, int D) {
		int count = 0;

		if (X == Y) {
			return 1;
		}
		
		int rem=Y-X-D;
		count++;
		rem = rem / D;
		count=count+rem;
		System.out.println(count);
		rem = Y % D;
		if (rem != 0) {
			count = count + 1;
		}
		return count;
	}

	public static void main(String args[]) {
		int result = solution(10, 100, 20);
		System.out.println(result);
	}
}