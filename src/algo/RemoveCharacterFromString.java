package algo;

public class RemoveCharacterFromString {
	
	
//============remove by using stringBuilder======================
	
//	private static String remove(String s,char c) {
//	if(s==null|| s.isEmpty()) {
//		return s;
//	}
//		char arr[] = s.toCharArray();
//		StringBuilder sb = new StringBuilder();
//		for(char a : arr) {
//			if(c != a ) {
//				sb.append(a);
//			}
//		}
//		return sb.toString();
//	}
	
//========== Remove by using substring ==============	

	private static String remove(String s,char c) {
		if(s==null|| s.isEmpty()) {
			return s;
		}
		int count = 0;
		for(int i =0;i<=s.length()-1; i++ ) {
			if(s.charAt(i)== c) {
				count = i;
			}
		}
		return s.substring(0,count)+s.substring(count+1,s.length());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(remove("Local",'L'));

	}

}
