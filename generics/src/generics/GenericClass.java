package generics;

//K key, V value, T type
public class GenericClass<T> {
	T obj;
	public void printObject(T obj) {
		System.out.println(obj);
	}
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	public GenericClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "GenericClass [obj=" + obj + "]";
	}
	public GenericClass(T obj) {
		super();
		this.obj = obj;
	}
}
