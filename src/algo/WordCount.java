package algo;

public class WordCount {

	static String sentence = "Hello World 123 456";
	
	static int wordCount(String sentence) {
		String data[] = sentence.split(" ");
		return data.length;
	}
	
	static int wordMatchCount(String sentence, String word) {
		String data[] = sentence.split(" ");
		String m = word.trim();
		int count=0;
		
		for (int i =0;i<=data.length-1;i++) {
			if(m == data[i].toString()) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(wordCount(sentence));
		System.out.println(wordMatchCount(sentence,"Hello"));
		
	}

}
