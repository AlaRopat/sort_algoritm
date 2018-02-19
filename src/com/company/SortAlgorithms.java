package com.company;

public class SortAlgorithms {

  public static int[] bubbleSort(int[] arr) {
    int temp;
    for (int i = arr.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
        }
      }
    }
    return arr;
  }

  public static int[] cocktailSort(int[] arr) {
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


  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}
