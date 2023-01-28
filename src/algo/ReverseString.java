package algo;
public class ReverseString {
	
	static String reverseString(String s) {
		
		if(s == null || s.isEmpty()) {
			return s;
		}
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
		
	}		
		
		
		//===========Custom Method==============
	
//		StringBuilder reversed = new StringBuilder();
//		if(s == null || s.isEmpty()) {
//			return s;
//		}
//		for(int i=s.length()-1; i>=0; i--) {
//				
//				reversed.append(s.charAt(i));
//		}
//		return reversed.toString();	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( reverseString("Local gang"));
		System.out.println( reverseString(""));
		System.out.println( reverseString("ng"));
		System.out.println( reverseString(null));
		
		
		
	}

}
