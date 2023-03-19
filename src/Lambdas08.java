import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Using the reduce function 
 *
 */
public class Lambdas08 {

	public static void main(String[] args) {
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		withLambdas1(friends);
		withLambdas2(friends);
	}
	
	
	/**
	 * using the reduce with default parameter
	 * @param friends
	 */
	private static void withLambdas2(List<String> friends) {
		String steveOrLonger = friends
							.stream()
							.reduce("Steve", (name1, name2) -> name1.length() >= name2.length() ? name1: name2);
		
		System.out.println(steveOrLonger);
		
	}


	/**
	 * Using the reduce with two params
	 * @param friends
	 */
	private static void withLambdas1(List<String> friends) {
		Optional<String> aLongName = friends
			.stream()
			.reduce((name1, name2) -> name1.length() >= name2.length() ? name1 : name2);
		aLongName.ifPresent(name -> System.out.println(String.format("A longest name: %s", name)));
	}




}
