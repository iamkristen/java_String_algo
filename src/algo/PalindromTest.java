package algo;

public class PalindromTest {
	
	
//============== Reverse using recursion ===================
	
	static String reverse(String s) {
		if(s == null || s.isEmpty()) {
			return s;
		}
		return s.charAt(s.length()-1)+reverse( s.substring(0,s.length()-1));
	}

//=============== Reverse using loop =========================
	
//	static String reverse(String s) {
//		if(s == null || s.isEmpty()) {
//			return s;
//		}
//		StringBuilder sb = new StringBuilder();
//		for(int i =s.length()-1;i>= 0 ; i--) {
//			sb.append(s.charAt(i));
//		}
//		return sb.toString();
//	}
//	
	
	
//=============== Custom equal function ===============
//	
//	public static boolean isEqual(String s1,String s2) {
//		if(s1==null||s2==null||s1.isEmpty()||s2.isEmpty()||s1.length() != s2.length()) {
//			return false;
//		}
//
//		for (int i=0; i<=s1.length()-1;i++) {
//			if(s1.charAt(i)!= s2.charAt(i)) {
//				return false;
//			}
//		}
//		return true;
//	}

	public static boolean isPalindromString(String s) {
		if(s==null|| s.isEmpty()) {
			return true;
		}
		return s.equals(reverse(s)); //isEqual(s,reverse(s)); 	
	
	}
	
	
//============= isPalindrome without recursion =========
	
//	private static boolean isPalindromString(String string) {
//		char[] ch = string.toCharArray();
//		int count =0;
//		for(int i=0; i< ch.length/2; i++) {
//		if(ch[i] == ch[ ch.length-1-i]){
//		count++;
//		continue;
//		}
//		}
//		if(count >0) {
//		return true;
//		}
//		return false;
//		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "natan";
		System.out.println(isPalindromString(test)); 
		
	}

}
