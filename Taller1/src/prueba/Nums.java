package prueba;

import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Nums {

	public static void main(String[] args) {
		List<Integer>numbers =List.of(18,6,4,15,55,78,12,9,8);
		
		int list=(int) numbers.stream().filter(x->x>10).count();
		System.out.println(list);
	}

}
