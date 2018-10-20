package streamsapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PeekTest {

	public static void main(String[] args) {

		List<String> versions = new ArrayList<>();
		versions.add("Lollipop");
		versions.add("KitKat");
		versions.add("Jelly Bean");
		versions.add("Ice Cream Sandwidch");
		versions.add("Honeycomb");
		versions.add("Gingerbread"); // filtering all vaersion which are longer than 7 characters 
		versions.stream()
		.filter(s -> {
			System.out.println("First");
			return s.length() > 8;
		})
		.peek(e -> System.out.println("After the first filter: " + e))
		.filter(s -> {
			System.out.println("Second");
			return s.startsWith("H");
		})
		.peek(e -> System.out.println("After the second filter: " + e))
		.collect(Collectors.toSet());
	}

}
