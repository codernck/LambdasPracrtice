import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Using the joining 
 *
 */
public class Lambdas09 {

	public static void main(String[] args) {
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		// withoutLambdas1(friends);
		// withoutLambdas2(friends);
		// withoutLambdas3(friends);
		
		withLambdas(friends);
	}
	
	/**
	 * Using the Collectors.join and also map
	 * @param friends
	 */
	private static void withLambdas(List<String> friends) {
		String joinedStr = friends
								.stream()
								.map(String::toUpperCase)
								.collect(Collectors.joining(", "));
		System.out.println(joinedStr);
	}


	/**
	 * join using the java-8 String.join
	 * @param friends
	 */
	private static void withoutLambdas3(List<String> friends) {
		System.out.println(String.join(", ", friends));
	}

	/**
	 * join using the advance for loop
	 * @param friends
	 */
	private static void withoutLambdas1(List<String> friends) {
		for (String name : friends) {
			System.out.print(name + ", ");
		}
		System.out.println();
	}
	
	/**
	 * join using the traditional for loop
	 * @param friends
	 */
	private static void withoutLambdas2(List<String> friends) {
		for (int i = 0; i <= friends.size() - 1; i++) {
			System.out.print(friends.get(i) + ", ");
		}
		System.out.println();
	}


}
