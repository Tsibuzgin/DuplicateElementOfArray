package duplicateElementOfArray;

import java.util.*;

public class DuplicateElementOfArray {
	public static void main(String[] args)
	{
		//declaring variables for two indexes
		int index_first = 0;
		int index_second = 0;
		Scanner in = new Scanner(System.in);
		//declaring an array
		int[] array = new int[101];
		//reading array
		for (int i = 0; i <= 100; i++) {
			array[i] = in.nextInt();
		};
		//searching for a duplicate element
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j < i; j++) {
				if (array[j] == array[i]) {
					index_first = j;
					index_second = i;
					break;
				}
			}
			if (index_second != 0) break;
		};
		//showing element and its indices
		System.out.println("The duplicated element is " + array[index_second]);
		System.out.println("Its indices are " + index_first + " and " + index_second);
	}
}
