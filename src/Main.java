

/*
 * @created ${DAY}/${MONTH}/${YEAR} - ${TIME}
 * @project ${PROJECT_NAME}
 * @package
 * @author Qaisar Abbas
 */

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static int[] printDistinct(int arr[], int n) {


        int[] uniqueArray = new int[n];

        // Pick all elements one by one
        int count = 0;
        for (int i = 0; i < n; i++) {
            // Check if the picked element
            // is already printed
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }

                if (i == j) {
                    uniqueArray[count++] = arr[i];
                }
            }
            // If not printed earlier,
            // then print it

        }

        return uniqueArray;
    }

    // Driver program
    public static void main (String[] args) {

        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int n = arr.length;


        int[] uniqueArray = printDistinct(arr, n);

        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.println(uniqueArray[i]);
        }

    }
}