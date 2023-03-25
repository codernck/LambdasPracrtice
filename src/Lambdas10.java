import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Iterating the String 
 *
 */
public class Lambdas10 {

	public static void main(String[] args) {
		final String str = "w00t";
		
		// this prints the ascii value not the exact characters
		str.chars().forEach(ch -> System.out.println(ch));
		System.out.println("----------------");
		
		// one more way to display
		str.chars().forEach(System.out::println);
		System.out.println("----------------");
		
		// this will display the chars instead of the ascii values
		str.chars().forEach(Lambdas10::printChar);
		System.out.println("----------------");
		
		// using the lambdas mapToObj function
		str
			.chars()
			.mapToObj(ch -> Character.valueOf((char)ch))
			.forEach(System.out::println);
		System.out.println("----------------");
		
		// filter and display only the digits
		str
			.chars()
			.filter(ch -> Character.isDigit(ch))
			.forEach(ch -> printChar(ch));
		System.out.println("----------------");
		
		// same using the scope operator
		str
			.chars()
			.filter(Character::isDigit)
			.forEach(Lambdas10::printChar);
			
	}
	
	/**
	 * return the char instead of the ascii
	 * @param inChar
	 */
	public static void printChar(int inChar) {
		System.out.println((char)inChar);
	}
	
	
	
	
	
}
