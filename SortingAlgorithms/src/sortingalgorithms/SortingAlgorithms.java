import java.util.Arrays;

public class SortingAlgorithms {

    // 1. Bubble Sort (Ascending Order)
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    // 2. Selection Sort (Ascending Order)
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    // 3. Insertion Sort (Ascending Order)
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] originalArray = {45, 12, 89, 7, 34, 23, 90, 18, 56, 3, 72, 29};

        int[] bubbleArray = Arrays.copyOf(originalArray, originalArray.length);
        int[] selectionArray = Arrays.copyOf(originalArray, originalArray.length);
        int[] insertionArray = Arrays.copyOf(originalArray, originalArray.length);

        bubbleSort(bubbleArray);
        selectionSort(selectionArray);
        insertionSort(insertionArray);

        System.out.println("Original Array:          " + Arrays.toString(originalArray));
        System.out.println("Bubble Sort Result:      " + Arrays.toString(bubbleArray));
        System.out.println("Selection Sort Result:   " + Arrays.toString(selectionArray));
        System.out.println("Insertion Sort Result:   " + Arrays.toString(insertionArray));
    }
}
