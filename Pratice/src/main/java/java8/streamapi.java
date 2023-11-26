package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

class streamapi
{
	public static void main(String[]args) {
		 List<String> names =  Arrays.asList("Alice","Bob", "Charlie");
		 List<Integer>nums = Arrays.asList(6,10,4,3,2,1);
		 Predicate<Integer>predi =  n -> n%2 ==1;
		 names.forEach(name -> System.out.println(name));
		// Stream<Integer>  data =
				 nums
				                .stream()
				                .filter(predi)
				                .sorted()
				                .map(n -> n*2)
				                .forEach(n -> System.out.println(n));
		//  Stream<Integer> sorteddata =  data.sorted(); 
		//  sorteddata.forEach(n->System.out.println(n));
		// Stream<Integer> mappedData =  data.map(n->n*2);
		// mappedData.forEach(n->System.out.println(n));
		
	}
}