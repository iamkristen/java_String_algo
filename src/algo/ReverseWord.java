 package algo;

public class ReverseWord {
	
	
	static String reverseWord(String s) {
		if(s == null || s.isEmpty() ) {
			return s;
		}
		String result [] =  s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = result.length-1; i>=0;i--) {
			sb.append(result.length-1 == i?result[i]+" ":result[i]);
		}
		return sb.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( reverseWord("Hello World"));
	}

}
