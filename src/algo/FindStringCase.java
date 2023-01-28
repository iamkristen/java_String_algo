package algo;

public class FindStringCase {
	public static boolean isUpperCase(String s) {
		return s.chars().allMatch(Character::isUpperCase);

	}
	
	public static boolean isLowerCase(String s) {
		return s.chars().allMatch(Character::isLowerCase);
//		return s.chars().noneMatch(Character::isUpperCase);

	}
	
	public static boolean anyLowerCase(String s) {
		return s.chars().anyMatch(Character::isLowerCase);
//		return s.chars().noneMatch(Character::isUpperCase);

	}
	
	public static boolean anyUpperCase(String s) {
		return s.chars().anyMatch(Character::isUpperCase);
//		return s.chars().noneMatch(Character::isUpperCase);

	}
	
	static boolean passwordComplex(String password) {
		return password.chars().anyMatch(Character::isUpperCase)
				&& password.chars().anyMatch(Character::isLowerCase) 
				&& password.chars().anyMatch(Character::isDigit);                                                                                    
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(anyLowerCase("heLlo"));
		System.out.println(isUpperCase("HELLO"));
		System.out.println(isLowerCase("hello")); 
		System.out.println(anyUpperCase("heLlo"));
		System.out.println(passwordComplex("helLo1234"));
	}

}
