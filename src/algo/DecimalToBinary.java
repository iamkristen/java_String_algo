package algo;

public class DecimalToBinary {
	
	
	static String toBinary(int num) {
		int reminder;
		int quotent = num;
		StringBuilder result = new StringBuilder();
		do {
			reminder = quotent%2;
			quotent = quotent/2;
			result.append(reminder);
			
		}
		
		while(quotent>1);
		if(quotent == 1) {
			result.append(quotent);
		}
		
		
		return result.reverse().toString();
	}
	
	static String toHexa(int num) {
		int reminder;
		int quotent = num;
		String temp="";
		StringBuilder result = new StringBuilder();
		do {
			reminder = quotent%16;
			quotent = quotent/16;
			switch (reminder){
			case 10:
				temp = "a";
				break;
			case 11:
				temp = "b";
				break;
			case 12:
				temp = "c";
				break;
			case 13:
				temp = "D";
				break;
			case 14:
				temp = "E";
				break;
			case 15:
				temp = "F";
				break;
			}
			if(reminder>9) {
				result.append(temp);
			}
			else {
				result.append(reminder);
			}
			
			
		}
		
		while(quotent>15);
		if(quotent <= 15) {
			result.append(quotent);
		}
		
		
		return result.reverse().toString();
	}
	
	static double binaryToDecimal(String num) {
		String number = reverse( num);
		char[] results= number.toCharArray();
		double sum = 0;
		for(int i=0; i<results.length; i++) {
			sum = sum + Math.pow(2, i)*Character.getNumericValue(results[i]);
		}
		
		
		return sum;
	}
	
	static double hexaToDecimal(String num) {
		String number = reverse( String.valueOf(num));
		char[] results= number.toCharArray();
		int temp = 0;
		double sum = 0;
		for(int i=0; i<results.length; i++) {
			
			if(temp>9) {
				switch(results[i]) {
				case 'a':
					temp = 10;
					break;
					
				case 'b':
					temp = 11;
					break;
				case 'c':
					temp = 12;
					break;
				case 'd':
					temp = 13;
					break;
					
				case 'e':
					temp = 14;
					break;
				case 'f':
					temp = 15;
					break;
				}
				sum = sum + Math.pow(16, i)*temp;
			}else {
				sum = sum + Math.pow(16, i)*Character.getNumericValue(results[i]);
			}
		
		}
		
		
		return sum;
	}
	
	static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	

	public static void main(String[] args) {
		
		int num = 130;

		System.out.println("Hexa: "+toHexa(num));
		System.out.println("Binary: "+toBinary(num));
		System.out.println("Binary to Decimal: "+binaryToDecimal("10000010"));
		System.out.println("Hexa to Decimal: "+hexaToDecimal("12f4a"));
	}
}
