package generics;

import java.util.Arrays;

public class GenericMethod {

	public static void main(String[] args) {
		Integer[] integerArr = {1, 2, 3, 4, 5};
		String[] stringArr = {"abc", "def", "ghi"};
		printArr(integerArr);
		printArr(stringArr);
	}
	//this is generic method which means it place the type at runtime i.e; when we pass the type as a argument then it will take 
	//place like int, string, custom obj etc;
	public static <T> void  printArr(T[] objArr) {
		System.out.println(Arrays.toString(objArr));
	}
}
