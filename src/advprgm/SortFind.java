package advprgm;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"Slice","Suga","Namjoon","JHope"};
		Set<String> namesContainingS=Arrays.stream(names).sorted()
				.filter(name->name.toLowerCase().contains("s")).collect(Collectors.toSet());
		System.out.println("Sorted names:"+Arrays.toString(names));
		System.out.println("Names containing 's': "+namesContainingS);

	}

}
