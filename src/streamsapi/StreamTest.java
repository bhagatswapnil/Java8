package streamsapi;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamTest {

	public void test() throws IOException {
		Path path = Paths.get("/home/bridgeit/Desktop/trial/txt.txt");
		Stream<String> streamOfStrings = Files.lines(path);
		Stream<String> streamWithCharset = Files.lines(path, Charset.forName("UTF-8"));
		streamOfStrings.forEach(line -> System.out.println(line));
		System.out.println("----------------------------------------------------------------------------");
		streamWithCharset.forEach(line -> System.out.println(line));
		streamOfStrings.close();
		streamWithCharset.close();
	}

	public static void main(String[] args) throws IOException {
		StreamTest fileStream = new StreamTest();
//		fileStream.test();
		Stream<String> stream = Stream.of("a", "b", "c").filter(element -> element.contains("b"));
		Optional<String> firstElement = stream.findFirst();
		
		//will throw java.lang.IllegalStateException as the stream has ended above 
//		Optional<String> anyElement = stream.findAny();
		Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);
		Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
		streamGenerated.forEach(item -> System.out.print(item + " "));
		streamIterated.forEach(num -> System.out.print(num + " "));
		
		
	}
}










