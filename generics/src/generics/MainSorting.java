package generics;

import java.util.Arrays;

public class MainSorting {

	public static void main(String[] args) {
		Integer[] intArr = {4, 1, 2, 5, 3};
		System.out.println(Arrays.toString(intArr));

		Sorting<Integer> intSort = new Sorting<>(intArr);
		intSort.bubbleSort();
		System.out.println(Arrays.toString(intArr));
	}

}
