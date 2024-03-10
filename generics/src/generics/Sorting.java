package generics;

//upperbound
public class Sorting<T extends Comparable<T>> {
	private T[] objArr;

	public Sorting(T[] objArr) {
		this.objArr = objArr;
	}
	public void bubbleSort() {
		for(int i=0;i<objArr.length;i++) {
			for(int j=0;j<objArr.length-i-1;j++) {
				if(objArr[j].compareTo(objArr[j+1]) > 0) {
					T obj = objArr[j];
					objArr[j] = objArr[j+1];
					objArr[j+1] = obj;
				}
			}
		}
	}
}
