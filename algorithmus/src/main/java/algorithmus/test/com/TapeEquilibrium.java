package algorithmus.test.com;

public class TapeEquilibrium {

	public static int solution(int A) {

		String str = String.valueOf(A);
	    if (str.length() <= 1) {
	        return A;
	    }

	    char[] firstHalf = str.substring(0,str.length()/2).toCharArray();
	    char[] secondHalf = new StringBuilder(str.substring(str.length()/2)).reverse().toString().toCharArray();
	    StringBuilder finalStr = new StringBuilder();
	    for (int i=0;i<firstHalf.length;i++) {
	        finalStr.append(firstHalf[i]);
	        finalStr.append(secondHalf[i]);
	    }
	    // To handle for odd numbers length of array
	    if (secondHalf.length > firstHalf.length) {
	        finalStr.append(secondHalf[secondHalf.length - 1]);
	    }

	    return Integer.parseInt(finalStr.toString());
	}

	public static void main(String args[]) {
		int A = 1;
		System.out.println(solution(A));

	}
}
