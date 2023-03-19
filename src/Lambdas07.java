import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Map-to-int 
 *
 */
public class Lambdas07 {

	public static void main(String[] args) {
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		withLambdas1(friends);
	}
	
	
	/**
	 * Total number of characters of all names in the friends list
	 * @param friends
	 * @param startingLetter
	 */
	private static void withLambdas1(List<String> friends) {
		int charFriendsLen = friends
			.stream()
			.mapToInt(name -> name.length())
			.sum();
		
		System.out.println("Total number of chars in all names: "+charFriendsLen);
	}




}
