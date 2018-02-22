package algoritm;

public interface SortAlgorithm {


	int [] sort(int [] arr);

	double getComplexity(int n);


	default void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
