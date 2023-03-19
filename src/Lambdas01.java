import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Iterating the list
 *
 */
public class Lambdas01 {

	public static void main(String[] args) {
		// nonLambdasCode();
		// nonLambdasConsumer();
		// lambdas();
	}

	private static void nonLambdasCode() {
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		for (int i = 0; i < friends.size(); i++) {
			System.out.println(friends.get(i));
		}
		
		for (String friend : friends) {
			System.out.println(friend);
		}
	}
	
	private static void nonLambdasConsumer() {
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		
		friends.forEach(new Consumer<String>() {
			@Override
			public void accept(String name) {
				System.out.println(name);
			}
		});
	}

	/**
	 * forEach and lambdas
	 */
	private static void lambdas() {
		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		friends.forEach((final String s) -> System.out.println(s));
		System.out.println("----------------------");
		friends.forEach((name) -> System.out.println(name));
		System.out.println("----------------------");
		friends.forEach(name -> System.out.println(name));
		System.out.println("----------------------");
		friends.forEach(System.out::println);
	}
}
