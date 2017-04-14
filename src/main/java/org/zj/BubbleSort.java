package org.zj;

/**
 * 交换排序之冒泡排序
 * 
 * @author zhangjin
 *
 */
public class BubbleSort {

	public static void sort(int[] elements) {
		int size = elements.length, temp;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				if (elements[j] > elements[j + 1]) {
					temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
			}
		}
	}
}
