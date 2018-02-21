package algoritm.impl;

import algoritm.SortAlgorithm;

public class PermutationSort implements SortAlgorithm {

	@Override
	public int[] sort(int[] arr) {
		while (!isSorted(arr)) {
			for (int i = 1; i <= arr.length - 1; i++) {
				swap(arr, i, (int) (Math.random() * i));
			}
		}
		return arr;
	}

	private boolean isSorted(int[] a) {
		for (int i = a.length - 1; i > 0; i--) {
			if (a[i] < a[i - 1]) {
				return false;
			}
		}
		return true;
	}
}
