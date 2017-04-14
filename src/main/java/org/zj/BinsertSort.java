package org.zj;

/**
 * 插入排序之折半插入排序
 * 
 * @author zhangjin
 *
 */
public class BinsertSort {

	public static void sort(int[] elements) {
		int size = elements.length;
		if (size <= 1) {
			return;
		}
		int position, key;
		for (int i = 1; i < size; i++) {
			key = elements[i];
			position = getPosition(0, i - 1, elements, key);
			for (int j = i; j > position; j--) {
				elements[j] = elements[j - 1];
			}
			elements[position] = key;
		}
	}

	public static int getPosition(int low, int high, int[] elements, int key) {
		if (low >= high) {
			if (key > elements[low]) {
				return low + 1;
			} else {
				return low;
			}
		}
		int mid = (low + high) / 2;
		if (key > elements[mid]) {
			low = mid + 1;
		} else {
			high = mid - 1;
		}
		return getPosition(low, high, elements, key);
	}
}
