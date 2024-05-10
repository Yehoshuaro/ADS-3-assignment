import java.util.Scanner;
public class Main {
    public static void quickSort(int[] array) {
        sort(array, 0, array.length - 1);
    }
    private static void sort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            sort(array, low, pivot - 1);
            sort(array, pivot + 1, high);
        }
    }
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }


        swap(array, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        quickSort(numbers);
        System.out.println("Sorted Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
