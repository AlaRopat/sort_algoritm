package runner;


import algoritm.SortAlgorithm;
import algoritm.impl.BubbleSort;
import algoritm.impl.CocktailSort;
import algoritm.impl.PermutationSort;
import algoritm.impl.QuickSort;
import java.util.Random;


public class Main {

  private static final int[] ARRAY_LENGTHS = {10, 100, 1000, 10000};
  private static Random generator = new Random();

  public static void main(String[] args) {
    for (int length : ARRAY_LENGTHS) {
      executeSort(new QuickSort(), length, "Quick Sort");
      executeSort(new BubbleSort(), length, "Bubble Sort");
      executeSort(new CocktailSort(), length, "Cocktail Sort");
    }
    executeSort(new PermutationSort(), ARRAY_LENGTHS[0], "Permutation Sort");
  }

  private static void printArray(String message, int[] arr, long time, int arrayLength) {
    System.out.println("\n\n" + message);
    for (int i : arr) {
      System.out.print(i + " ");
    }

    System.out.print("\n\nExecution time: " + time + " ms N=" + arrayLength);
  }

  private static int[] getArray(int length) {
    int[] array = new int[length];
    for (int i = 0; i < length; i++) {
      array[i] = generator.nextInt(1000);
    }
    return array;
  }

  private static void executeSort(SortAlgorithm sortAlgorithm, int arrayLength, String sortName) {
    long startTime = System.currentTimeMillis();
    int[] quickSortArr = sortAlgorithm.sort(getArray(arrayLength));
    long endTime = System.currentTimeMillis();

    printArray(sortName, quickSortArr, endTime - startTime,
        arrayLength);
    System.out.printf(" Complexity: %f\n", sortAlgorithm.getComplexity(arrayLength));
  }
}
