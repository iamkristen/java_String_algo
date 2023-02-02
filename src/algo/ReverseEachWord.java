package algo;

public class ReverseEachWord {
	
	static String reverseWord(String s) {
		String arr[] = s.split(" ");

		StringBuilder result = new StringBuilder();
		for(int i=0; i >= arr.length-1; i++) {
			StringBuilder rev = new StringBuilder(arr[i]);
			System.out.println(rev.reverse());
			result.append(rev.reverse());
			result.append(" ");
		}
		System.out.println(result.toString());
		return result.toString();
	}
	
	public static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverseWord("Hello Buddy"));

	}

}
