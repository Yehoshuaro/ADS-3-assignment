import java.util.Scanner;
public class Main {
    public static void heapSort(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }
    private static void heapify(int[] array, int n, int i) {
        int the_largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < n && array[leftChild] > array[the_largest]) {
            the_largest = leftChild;
        }
        if (rightChild < n && array[rightChild] > array[the_largest]) {
            the_largest = rightChild;
        }
        if (the_largest != i) {
            int swap = array[i];
            array[i] = array[the_largest];
            array[the_largest] = swap;

            heapify(array, n, the_largest);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        heapSort(array);
        System.out.println("Sorted array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

