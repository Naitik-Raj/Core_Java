package generics;

import java.util.Arrays;

public class MainReverse {

	public static void main(String[] args) {
		Integer[] intArr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(intArr));
		
		ReverseArr<Integer> integerArr = new ReverseArr<>(intArr);
		integerArr.reverse();
		System.out.println(Arrays.toString(intArr));
		
		String[] strArr = {"1", "2", "3", "4", "5"};
		System.out.println(Arrays.toString(strArr));
		
		ReverseArr<String> stringArr = new ReverseArr<>(strArr);
		stringArr.reverse();
		System.out.println(Arrays.toString(strArr));


	}

}
