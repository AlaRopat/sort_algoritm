package runner;


import algoritm.SortAlgorithm;
import algoritm.impl.BubbleSort;
import algoritm.impl.CocktailSort;
import algoritm.impl.PermutationSort;
import algoritm.impl.QuickSort;
import java.util.Random;


public class Main {
  private static final int ARRAY_LENGTH = 10;
  private static Random generator = new Random();

  public static void main(String[] args) {
    SortAlgorithm bubbleSort = new BubbleSort();
    printArray("Bubble Sort: ", bubbleSort.sort(getArray()));
    SortAlgorithm cocktailSort = new CocktailSort();
    printArray("Cocktail sort: ", cocktailSort.sort(getArray()));
    SortAlgorithm quickSort = new QuickSort();
    printArray("Quick sort: ", quickSort.sort(getArray()));
    SortAlgorithm permutationSort = new PermutationSort();
    printArray("Permutation Sort: ", permutationSort.sort(getArray()));
  }

  private static void printArray(String message, int[] arr) {
    System.out.print("\n" + message);
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


}
