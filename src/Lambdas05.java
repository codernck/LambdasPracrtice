import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Using the predicates in lambdas
 *
 */
public class Lambdas05 {

	public static void main(String[] args) {
		// withDuplicatePredicates();
		// withoutDuplicatePredicates1();
		// withoutDuplicatePredicates2();
		withoutDuplicatePredicates3();
	}
	
	
	/**
	 * Using predicate in-line function
	 */
	private static void withoutDuplicatePredicates2() {
		Function<String, Predicate<String>> 
		startsWithLetter = (String letter) -> 
				{
					Predicate<String> checkStarts = (String name) -> name.startsWith(letter);
					return checkStarts;
				};
		
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		long nCount = friends
						.stream()
						.filter(startsWithLetter.apply("N"))
						.count();
		System.out.println(nCount);
		
		long bCount = friends
						.stream()
						.filter(startsWithLetter.apply("B"))
						.count();
		System.out.println(bCount);
	}
	
	/**
	 * Using predicate in-line function
	 */
	private static void withoutDuplicatePredicates3() {
		Function<String, Predicate<String>> 
							startsWithLetter = letter ->  
											   name -> name.startsWith(letter);
		
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		long nCount = friends
						.stream()
						.filter(startsWithLetter.apply("N"))
						.count();
		System.out.println(nCount);
		
		long bCount = friends
						.stream()
						.filter(startsWithLetter.apply("B"))
						.count();
		System.out.println(bCount);
	}

	/**
	 * Using the same predicate as a predicate-function
	 */
	private static void withoutDuplicatePredicates1() {
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		
		long nCount = friends
			.stream()
			.filter(checkIfStartsWith("N"))
			.count();
		System.out.println(nCount);
		
		long bCount = friends
			.stream()
			.filter(checkIfStartsWith("B"))
			.count();
		System.out.println(bCount);
			
		
	}
	
	
	/**
	 * Predicate as a function
	 * @param letter
	 * @return
	 */
	public static Predicate<String> checkIfStartsWith(final String letter) {
		return name -> name.startsWith(letter);
	}
	
	
	/**
	 * Separate predicate for Separate logic
	 */
	private static void withDuplicatePredicates() {
		Predicate<String> startsWithB = name -> name.startsWith("B");
		
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		long nCount				 = friends
									.stream()
									.filter(name -> name.startsWith("N"))
									.count();
		System.out.println(nCount);
		
		long bCount = friends
						.stream()
						.filter(name -> name.startsWith("B"))
						.count();
		System.out.println(bCount);
		
	}

}
