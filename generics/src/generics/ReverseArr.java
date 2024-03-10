package generics;

public class ReverseArr<T> {
	
	private T[] objArr;
	
	public ReverseArr(T[] objArr) {
		this.objArr = objArr;
	}
	 
	public void reverse() {
		int left = 0, right = objArr.length-1;
		while(left < right) {
			T obj = objArr[left];
			objArr[left] = objArr[right];
			objArr[right] = obj;
			left++;right--;
		}
	}
	
}
