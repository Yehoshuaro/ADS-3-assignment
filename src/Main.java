import java.util.Scanner;
public class Main {
    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int[] left = new int[array.length / 2];
            int[] right = new int[array.length - left.length];
            System.arraycopy(array, 0, left, 0, left.length);
            System.arraycopy(array, left.length, right, 0, right.length);

            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }
    }
    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0; int j = 0; int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            }
            else {
                array[k++] = right[j++];
            }
        }
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        mergeSort(array);
        System.out.println("Sorted Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
