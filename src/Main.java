import java.util.Scanner;

public class Main {

    public static void SelectionSort(int[] numbers) {
        for (int sortedPartSize = 0; sortedPartSize < numbers.length - 1; sortedPartSize++) {
            int smallestIndex = sortedPartSize;
            for (int j = sortedPartSize + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            if (smallestIndex != sortedPartSize) {
                int temp = numbers[sortedPartSize];
                numbers[sortedPartSize] = numbers[smallestIndex];
                numbers[smallestIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        SelectionSort(numbers);
        System.out.println("Sorted Array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
