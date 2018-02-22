package algoritm.impl;

import algoritm.SortAlgorithm;

public class CocktailSort implements SortAlgorithm {

	@Override
	public int[] sort(int[] arr) {
		int leftMark = 0;
		int rightMark = arr.length - 1;
		while (leftMark <= rightMark) {
			for (int i = leftMark; i < rightMark; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
			rightMark--;
			for (int i = rightMark; i > leftMark; i--) {
				if (arr[i] < arr[i - 1]) {
					swap(arr, i, i - 1);
				}
			}
			leftMark++;

		}
		return arr;
	}

	@Override
	public double getComplexity(int n) {
		return (Math.pow(n, 2) / Math.pow(10, 6)) * 1000;
	}
}
