package org.zj;

public class SortTest {

	public static void main(String[] args) {
		int[] elements = new int[] { 1, 0, 4, 34, 22, 13, 46, 55, 12, 9, 39,
				24, 87, 33 };
		// int[] elements = new int[] { 1, 0, 4, 34 };
		QuickSort.sort(elements);
		for (int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ",");
		}
	}
}
