package algo;

public class MaxMin {
	
	static int max;
	static int min;
	public static void max(int[] num) {
		 max =0;
		min = num[0];
		for(int i : num) {
			if(i>max) {
				max = i;
			}
			if(i<min) {
				min = i;
			}
		}
	}
	
//	public static int min(int[] num) {
//		int min =num[0];
//		for(int i : num) {
//			if(i<min) {
//				min= i;
//			}
//		}
//		return min;
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int arr[]= {5,4,3,89,98};
//		System.out.println(max(arr));
//		System.out.println(min(arr));
//
//	}

}
