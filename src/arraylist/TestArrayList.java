package arraylist;

public class TestArrayList {

	public static void main(String[] args) {

		System.out.println("ArrayList");
		ArrayList array = new ArrayList();
		array.add("1");
		System.out.println(array);
		array.add("2");
		System.out.println(array);
		array.add("3");
		System.out.println(array);
		array.add("4");
		System.out.println(array);
		array.add("5");
		System.out.println(array);

		System.out.println("First");

		array.addFirst(0);
		System.out.println("Add.First = "+array);

		System.out.println("Last");

		array.addLast(5);
		System.out.println("Add.Last = "+array);

		System.out.println("Size");

		array.size();
		System.out.println("Size = "+array.size());

		System.out.println("Remove Array 5");

		array.remove(5);
		System.out.println("Remove = "+array);
	}

}
