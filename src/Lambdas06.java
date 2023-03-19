import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Using the Option 
 *
 */
public class Lambdas06 {

	public static void main(String[] args) {
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		// withoutLambdas(friends, "N");
		// withoutLambdas(friends, "Z");
		// withLambdas(friends, "N");
		withLambdas(friends, "Z");
	}
	
	
	/**
	 * Finding the element in list using the Option
	 * @param friends
	 * @param startingLetter
	 */
	private static void withLambdas(List<String> friends, String startingLetter) {
		Optional<String> findFirst = friends
			.stream()
			.filter(name -> name.startsWith(startingLetter))
			.findFirst();
		
		System.out.println(String.format("A name starting with %s: %s", startingLetter, findFirst.orElse("No name found!")));
		System.out.println("------------------------------");
		
		findFirst.ifPresent(name -> System.out.println(name));
	}


	/**
	 * finding the element iterating list
	 * @param names
	 * @param startingLetter
	 */
	private static void withoutLambdas(List<String> names, String startingLetter) {
		
		String foundName = null;
		for (String name : names) {
			if (name.startsWith(startingLetter)) {
				foundName = name;
				break;
			}
		}
		
		System.out.println(String.format("A name starting with %s: ", startingLetter));
		
		if (foundName != null) {
			System.out.println(foundName);
		} else {
			System.out.println("No name found!");
		}
	
	}
	

}
