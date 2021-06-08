import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Collections;

public class DayThree {
	public static void main(String[] args) {
		//1
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Hi");
		arr.add("Bye");
		arr.add(null);
		System.out.println(arr.get(0) + " : " + arr.get(1));
		arr.set(2, arr.get(1));
		arr.set(1, arr.get(0));
		arr.set(0, arr.get(2));
		arr.set(2, null);
		System.out.println(arr.get(0) + " : " + arr.get(1));
		//2
		ArrayList<String> array = new ArrayList<String>();
		array.add("Hi");
		array.add("Bye");
		ArrayList<String> arr2 = (ArrayList<String>) arr.clone();
		System.out.println(arr);
		System.out.println(arr2);
		//3
		LinkedList<String> array2 = new LinkedList<String>();
		array2.add("Hi");
		array2.add("Bye");
		array2.add("Try");
		array2.add("Rye");
		array2.add("Cry");
		ListIterator<String> iterate = array2.listIterator(arr.size());
		while(iterate.hasPrevious()) {
			System.out.println(iterate.previous());
		}
		//4
		LinkedList<String> array3 = new LinkedList<String>();
		array3.add("Hi");
		array3.add("Bye");
		array3.add("Try");
		array3.add("Rye");
		array3.add("Cry");
		array3.offerLast("Last");
		System.out.println(array3);
		//5
		LinkedList<String> array4 = new LinkedList<String>();
		array4.add("Hi");
		array4.add("Bye");
		array4.add("Try");
		array4.add("Rye");
		array4.add("Cry");
		System.out.println(array4.indexOf("Try"));
		System.out.println(array4.get(2));
		ListIterator<String> iterate = arr.listIterator(0);
		while(iterate.hasNext()) {
			if(iterate.next() == "Try") {
				System.out.println(iterate.previous());
				iterate.next();
			}
	}
		//6
		LinkedList<String> array5 = new LinkedList<String>();
		array5.add("Hi");
		array5.add("Bye");
		array5.add("Try");
		array5.add("Rye");
		array5.add("Cry");
		LinkedList<String> array6 = new LinkedList<String>();
		array6.add("111");
		array6.add("222");
		array6.add("333");
		array6.add("444");
		array6.add("555");
		array5.addAll(array5);
		System.out.println(array5);
		//7
		ArrayList<Student> array7 = new ArrayList<Student>();
		array7.add(new Student(1, "Gary", 23));
		array7.add(new Student(4, "David", 22));
		array7.add(new Student(3, "Amanda", 26));
		array7.add(new Student(2, "John", 27));
		Collections.sort(arr);
		for(int i=0; i < array7.size(); i++) {
			System.out.println("Name: " + array7.get(i).name + "\tRank: " + array7.get(i).rank + "\tAge: " + array7.get(i).age );
		}
		System.out.println();
		Collections.sort(array7, new AgeCompare());
		for(int i=0; i < array7.size(); i++) {
			System.out.println("Name: " + array7.get(i).name + "\tRank: " + array7.get(i).rank + "\tAge: " + array7.get(i).age );
		//9
			int charcount = 0;
			try {
				Reader reader = new FileReader(System.getProperty("user.dir") + "/randText.txt");
				int data = reader.read();
				while (data != -1) {
					System.out.print((char) data);
					charcount += 1;
					data = reader.read();
				}
				reader.close();
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
		}
		System.out.println();
		System.out.println("There are: " + charcount + " Characters ini that file including newlines");
		}
		//10
/*		Square sqr = (a) -> (a*a);
		System.out.println(sqr.square(10));*/
	}

	//interface
	interface Square {
		public int square(int a);
	}
}
