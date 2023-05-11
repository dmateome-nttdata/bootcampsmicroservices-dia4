package prueba;

import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Nums {

	public static void main(String[] args) {
		List<Integer>numbers =List.of(18,6,4,15,55,78,12,9,8);
		
		List<Integer>list=numbers.stream().filter(x->x>10).collect(Collectors.toList());
		System.out.println(list);
	}

}
