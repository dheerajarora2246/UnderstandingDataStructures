public class MyArrayListTest {

	public static void main(String[] args) {

		IList myList = new MyArrayList();
		myList.add(1);
		myList.add(11);
		myList.add(7);
		myList.add(101);
		myList.add(71);
		myList.add(117);
		myList.add(101);

		System.out.println("Original List: " + myList.toString());

		myList.insertBefore(71, 99);

		System.out.println("Adding 99 before 71: " + myList.toString());

		myList.insertAfter(71, 98);

		System.out.println("Adding 98 after 71: " + myList.toString());

		myList.replace(0, 7);

		System.out.println("Replacing value at index 0[from 1 to 7]: " + myList.toString());

		myList.replaceAll(101, 102);

		System.out.println("Replacing all existing 101 values to 102: " + myList.toString());

	}

}

/*
 * Testing Region // IList myList = new MyArrayList(); // myList.add(1); //
 * myList.add(11); // myList.add(7); // myList.add(101); // myList.add(71); //
 * myList.add(117); // myList.clear(); // myList.add(22);
 * 
 * // myList.add(0, 22); // myList.add(-1, 22);// Ignored // myList.add(7,
 * 22);// Ignored // myList.add(5, 22); // myList.add(6, 22);
 * 
 * // myList.insertBefore(117, 99); // myList.insertBefore(0, 99);
 * 
 * // myList.insertAfter(71, 99); // myList.insertAfter(0, 99);
 * 
 * // myList.replace(2, 8);
 * 
 * // myList.add(71); // myList.replaceAll(71, 21);
 * 
 * // System.out.println("Index(7): " + myList.indexOf(7)); //
 * System.out.println("Value(5): " + myList.get(5)); //
 * System.out.println("Remove(2): " + myList.remove(2)); // //
 * System.out.println("Size: " + myList.size()); //
 * System.out.println("Capacity: " + myList.getCapacity()); //
 * System.out.println(myList.toString());
 */