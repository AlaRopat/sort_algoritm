package algoritm.impl;

import algoritm.SortAlgorithm;

public class QuickSort implements SortAlgorithm {

	@Override
	public int[] sort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
		return arr;
	}

	@Override
	public double getComplexity(int n) {
		return (n * lg(n) / Math.pow(10, 6)) * 1000;
	}

	private void quickSort(int[] arr, int b, int e) {
		if (b >= e) {
			return;
		}
		int i = b, j = e;
		int root = i;
		while (i < j) {
			while (i < root & arr[i] <= arr[root]) {
				i++;
			}
			while (j > root & arr[root] <= arr[j]) {
				j--;
			}
			if (i < j) {
				swap(arr, i, j);
				if (i == root) {
					root = j;
				} else if (j == root) {
					root = i;
				}
			}
		}
		quickSort(arr, b, root);
		quickSort(arr, root + 1, e);
	}

	private double lg(double x) {
		return Math.log(x) / Math.log(2.0);
	}
}
