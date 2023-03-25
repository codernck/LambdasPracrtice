import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdas11 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("John", 20),
				new Person("Sara", 21),
				new Person("Jane", 21),
				new Person("Greg", 35));
		
		// ascendingLambda1(people);
		// ascendingLambda2(people);
		// ascendingLambda3(people);
		// ascendingLambda4(people);
		// minLambda1(people);
		maxLambda1(people);
	
	}

	/**
	 * Sorting the method using the sorted and lambdas
	 * @param people
	 */
	public static void ascendingLambda1(List<Person> people) {
		// sorting using the lambdas
		List<Person> ascendingAge = people
										.stream()
										.sorted((p1, p2) -> p1.ageDifference(p2))
										.collect(Collectors.toList());
		
		ascendingAge.forEach(System.out::println);
	}
	
	/**
	 * Sorting the method using the sorted and lambdas and scope
	 * @param people
	 */
	public static void ascendingLambda2(List<Person> people) {
		// sorting using the lambdas
		List<Person> ascendingAge = people
										.stream()
										.sorted(Person::ageDifference)
										.collect(Collectors.toList());
		
		ascendingAge.forEach(System.out::println);
	}
	
	/**
	 * Reusing the comparison lambda comparator
	 * @param people
	 */
	public static void ascendingLambda3(List<Person> people) {
		// create the comparators
		Comparator<Person> compareAscending = (p1, p2) -> p1.ageDifference(p2);
		Comparator<Person> compareDescendng = compareAscending.reversed();
		
		
		// sorting using the lambdas ascending
		List<Person> ascendingAge = people
										.stream()
										.sorted(compareAscending)
										.collect(Collectors.toList());
		
		ascendingAge.forEach(System.out::println);
		
		System.out.println("--------------------------");
		
		// sorting using the lambdas descending
		List<Person> descendingAge = people
				.stream()
				.sorted(compareDescendng)
				.collect(Collectors.toList());
		
		descendingAge.forEach(System.out::println);
	}
	
	/**
	 * Sorting by name
	 * @param people
	 */
	public static void ascendingLambda4(List<Person> people) {
		List<Person> namesAsc = people
									.stream()
									.sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
									.collect(Collectors.toList());
		namesAsc.forEach(System.out::println);
	}
	
	/**
	 * get the min-age of all people in the list
	 * @param people
	 */
	public static void minLambda1(List<Person> people) {
		people
			.stream()
			.min(Person::ageDifference)
			.ifPresent(youngest -> System.out.println("Youngest: "+youngest));
	}
	
	/**
	 * get the min-age of all people in the list
	 * @param people
	 */
	public static void maxLambda1(List<Person> people) {
		people
			.stream()
			.max(Person::ageDifference)
			.ifPresent(eldest -> System.out.println("Eldest: "+eldest));
	}
	

}
