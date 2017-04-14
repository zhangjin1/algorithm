package org.zj;

/**
 * 交换排序之快速排序
 * 
 * @author zhangjin
 *
 */
public class QuickSort {

	public static void sort(int[] elements) {
		post(0, elements.length - 1, elements);
	}

	private static void post(int low, int high, int[] elements) {
		if (low >= high) {
			return;
		}
		int keyPosition = low;
		int position = getPosition(low, high, elements, keyPosition);
		post(low, position - 1, elements);
		post(position + 1, high, elements);

	}

	private static int getPosition(int low, int high, int[] elements,
			int keyPosition) {
		int key = elements[keyPosition];
		while (low < high) {
			while (low < high && elements[high] >= key) {
				high--;
			}
			elements[keyPosition] = elements[high];
			elements[high] = key;
			keyPosition = high;
			while (low < high && elements[low] <= key) {
				low++;
			}
			elements[keyPosition] = elements[low];
			elements[low] = key;
			keyPosition = low;
		}

		return keyPosition;
	}
}
