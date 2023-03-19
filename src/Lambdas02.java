import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Applying operation on each element or the list
 *
 */
public class Lambdas02 {

	public static void main(String[] args) {
		// nonLambdasCode();
		// lambdasCode();
		usingStreams();
	}

	/**
	 * Using the map function on streams
	 */
	private static void usingStreams() {
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		friends
			.stream()
			.map(name -> name.toUpperCase())
			.forEach(name -> System.out.println(name));
		
		System.out.println("--------------getting the count--------------");
		friends
			.stream()
			.map(name -> name.length())
			.forEach(count -> System.out.print(count + " "));
		
		System.out.println();
		System.out.println("------------with method reference--------------");
		friends
			.stream()
			.map(String::toUpperCase)
			.forEach(name -> System.out.println(name));
	}

	/**
	 * forEach and lambda applied
	 */
	private static void lambdasCode() {
		List<String> upperCaseNames = new ArrayList<String>();
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		friends.forEach(name -> upperCaseNames.add(name.toUpperCase()));
		System.out.println(friends);
	}

	/**
	 * without using the lambdas
	 */
	private static void nonLambdasCode() {
		List<String> upperCaseNames = new ArrayList<String>();
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		
		for (String friend : friends) {
			System.out.println(friend);
			upperCaseNames.add(friend.toUpperCase());
		}
	}
}
