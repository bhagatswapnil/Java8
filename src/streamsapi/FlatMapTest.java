package streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapTest {

	public static void main(String[] args) {

		List evens = Arrays.asList(2, 4, 6);
		List odds = Arrays.asList(3, 5, 7);
		List primes = Arrays.asList(2, 3, 5, 7, 11);

		long numbers = Stream.of(evens, odds, primes).flatMap(list -> {
			System.out.println(list);
			return list.stream();
		}).count();

		System.out.println(numbers);
		
	}

}
