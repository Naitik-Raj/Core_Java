package javacollection.list;

import java.util.*;

class Student{
	int rollNo;
	String name;
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
}

public class ListDemo {

	public static void main(String[] args) {
		List objectList = new ArrayList<>();
		
		objectList.add(1);
		objectList.add("abc");
		objectList.add(new Student(1,"abc"));
		//we can't use primitive type in collection
		System.out.println(objectList);
		List<Integer> ll = new LinkedList<Integer>();
		List<Integer> ll1 = new LinkedList<Integer>();
		
		
		Student std = (Student) objectList.get(2);
		System.out.println(std);
		ll.add(1);
		ll.add(2);
		ll.add(3);
		
		int num = ll.get(0);
		ll1.add(3);
		ll1.add(2);
		
		ll.retainAll(ll1);//output common element
		System.out.println(ll);
		
		List<Student> stdList = new ArrayList<Student>();
		int size = stdList.size();
		System.out.println(size);
		
		stdList.add(new Student(2,"acb"));
		stdList.add(new Student(3,"acb"));
		stdList.add(new Student(4,"acb"));
		stdList.add(new Student(5,"acb"));
		
		stdList.set(2, new Student(33,"dfgh"));
		System.out.println(stdList);
		
		Iterator<Student> stdIterator = stdList.iterator();
		//2 methods hasNext() and next();
		System.out.println("while loop");
		while(stdIterator.hasNext()) {
			System.out.println(stdIterator.next());
		}
		
		System.out.println("forEach");
		for(Student stds:stdList) {
			if(stds.getRollNo() == 33) {
				stds.setRollNo(4);
				std.setName("naitik");
			}
			System.out.println(stds);
		}
		System.out.println("lambda forEach");
		stdList.forEach(e->System.out.println(e));
		System.out.println("method Referencing");
		stdList.forEach(System.out::println);
		
		Stack<Student> stdStack = new Stack<>();
		int i = 0;
		for(Student stds: stdList) {
			stdStack.push(stds);
		}
		Iterator<Student> stdIterator1 = stdStack.iterator();
		while(stdIterator1.hasNext()) {
			stdList.add(stdStack.pop());
			System.out.println(stdList);
		}
	}

}
