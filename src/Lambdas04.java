import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Reusing the lambda expression 
 * @author kiran
 *
 */
public class Lambdas04 {

	public static void main(String[] args) {
		// withoutLambdasReuse();
		withLambdasReuse();
	}

	/**
	 * seperate lambda expression for each list
	 */
	private static void withoutLambdasReuse() {
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		List<String> editors = Arrays.asList("Brian", "Jackie", "John", "Mike");
		List<String> comrades = Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");
		
		long countFriendsStartN = friends
									.stream()
									.filter(name -> name.startsWith("N"))
									.count();
		System.out.println(countFriendsStartN);
		
		long countEditorsStartN = editors
				.stream()
				.filter(name -> name.startsWith("N"))
				.count();
		System.out.println(countEditorsStartN);
		
		long countcomradesStartN = comrades
				.stream()
				.filter(name -> name.startsWith("N"))
				.count();
		System.out.println(countcomradesStartN);
		
	}

	/**
	 * using the same lambda expression with all the lists
	 */
	private static void withLambdasReuse() {
		final Predicate<String> startsWithN = name -> name.startsWith("N");
		
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		List<String> editors = Arrays.asList("Brian", "Jackie", "John", "Mike");
		List<String> comrades = Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");
		
		long countFriendsStartN = friends
									.stream()
									.filter(startsWithN)
									.count();
		System.out.println(countFriendsStartN);
		
		long countEditorsStartN = editors
				.stream()
				.filter(startsWithN)
				.count();
		System.out.println(countEditorsStartN);
		
		long countcomradesStartN = comrades
				.stream()
				.filter(startsWithN)
				.count();
		System.out.println(countcomradesStartN);
		
	}

}
