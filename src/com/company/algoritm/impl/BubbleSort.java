package algoritm.impl;

import algoritm.SortAlgorithm;

public class BubbleSort implements SortAlgorithm {


	@Override
	public int[] sort(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
		return arr;
	}
}
