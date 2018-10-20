package streamsapi;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Stream;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("asfw");
		list.add("fsghe");
		list.add("sweg");
		list.add("bcd");
		list.add("xcsh");
		list.add("yjnfd");
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(3423);
		list1.add(2355);
		list1.add(5647);
		list1.add(67753);
		list1.add(1535);
		list1.add(6363);
		
		int sf = list1.stream().findFirst().get();
		
		
		
		System.out.println(sf);
//		Stream stream = list.stream();
//		stream.flatMap(mapper);
	}

}
