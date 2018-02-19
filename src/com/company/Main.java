package com.company;

import java.util.Random;

public class Main {

  private static final int ARRAY_LENGTH = 10;
  private static int[] arr = new int[ARRAY_LENGTH];

  private static Random generator = new Random();

  public static void main(String[] args) {

    printArray(SortAlgorithms.bubbleSort(getArray()));
    printArray(SortAlgorithms.cocktailSort(getArray()));
    initArray();
    quickSort(0, arr.length - 1);
    printArray(arr);

  }

  private static void quickSort(int b, int e) {
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
        SortAlgorithms.swap(arr, i, j);
        if (i == root) {
          root = j;
        } else if (j == root) {
          root = i;
        }
      }
    }
    quickSort(b, root);
    quickSort(root + 1, e);
  }

  private static void printArray(int[] arr) {
    System.out.print("\n");
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }


  private static int[] getArray() {
    int[] array = new int[ARRAY_LENGTH];
    for (int i = 0; i < ARRAY_LENGTH; i++) {
      array[i] = generator.nextInt(100);
    }
    return array;
  }

  private static void initArray() {
    for (int i = 0; i < ARRAY_LENGTH; i++) {
      arr[i] = generator.nextInt(100);
    }

  }
}
