package algo;

public class EvenIndex {
	
	static boolean atEvenIndex(String s,char c) {
		for (int i=1; i<=s.length()/2+1; i= i+2) {
			if(s.charAt(i) == c) {
				System.out.println(s.charAt(i));
				
				return true;
			
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Hello";
		char c = 'l';
		System.out.println(atEvenIndex(s,c));

	}

}
