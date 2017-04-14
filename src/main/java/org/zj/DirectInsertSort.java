package org.zj;

/**
 * 插入排序之直接插入排序
 * 
 * @author zhangjin
 *
 */
public class DirectInsertSort {

	public static void sort(int[] elements) {
		int size = elements.length;
		int temp;
		int count = 0;
		for (int i = 1; i < size; i++) {
			temp = elements[i];
			for (int j = i; j >= 0; j--) {
				count++;
				// 与temp<elements[j - 1]条件比减少了循环次数
				if (j == 0 || temp > elements[j - 1]) {// 若比前一位置的值大，则此位置就是最终位置并停止前溯
					elements[j] = temp;
					break;
				}
				elements[j] = elements[j - 1];
			}
		}

		System.out.println("total:" + count);
	}
}
