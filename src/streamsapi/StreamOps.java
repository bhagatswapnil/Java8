package streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamOps {

	static int i = 1;

	public static void printer() {
		System.out.println(i++);
	}

	public static void main(String[] args) {

		List<String> list = Arrays.asList("abcd", "bcde", "cdef", "defg");
//		Stream<String> newStream = list.stream().filter(item -> {
//			printer();
//			return item.contains("c");
//		});
		Stream<String> stream = list.stream();
		try {
			long num = stream.filter(element -> {
				System.out.println(("filter() was called"));
				printer();
				if (i == 5) {
					throw new ArithmeticException("Crap");
				}
				return element.contains("f");
			}).map(element -> {
				System.out.println(("map() was called"));
				return element.toUpperCase();
			}).count();
		} catch (Exception e) {
			System.out.println("Oh oh!!");
			//the stream gets consumed here
		}
		
		Optional<String> anyElement = stream.findAny();
		
	}

}
