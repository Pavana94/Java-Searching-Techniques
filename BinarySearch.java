import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array before Binary Search
        Arrays.sort(arr);

        System.out.print("Enter element to search: ");
        int key = scanner.nextInt();

        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                scanner.close();
                return;

            } else if (key < arr[mid]) {
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }

        System.out.println("Element not found");

        scanner.close();
    }
}