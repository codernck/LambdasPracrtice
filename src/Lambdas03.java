import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Using the count function
 *
 */
public class Lambdas03 {

	public static void main(String[] args) {
		// nonLambdasCode();
		usingStreams();
	}

	/**
	 * count function using the streams
	 */
	private static void usingStreams() {
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		List<String> startsWithN = friends
									.stream()
									.filter(name -> name.startsWith("N"))
									.collect(Collectors.toList());
		System.out.println(startsWithN);
		
		System.out.println(String.format("Found %d names", startsWithN.size()));
		
		System.out.println("---------using count--------------------");
		long count = friends
			.stream()
			.filter(name -> name.startsWith("N"))
			.count();
		System.out.println(count);
			
		
	}

	/**
	 * count using the forr loop
	 */
	private static void nonLambdasCode() {
		List<String> startsWithN = new ArrayList<String>();
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		
		for (String friend : friends) {
			if (friend.startsWith("N")) {
				startsWithN.add(friend.toUpperCase());
			}
		}
		
		System.out.println(startsWithN);
	}
}
