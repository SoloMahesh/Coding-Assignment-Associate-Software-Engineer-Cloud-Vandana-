
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_Suffle {
	
	public static void main(String[] args) {
		Integer[] a = {1, 2, 3, 4, 5, 6, 7};
		List<Integer> lst = Arrays.asList(a);
        	Collections.shuffle(lst);
        	lst.toArray(a);
		System.out.println(Arrays.toString(a));
	}

}
