import java.util.Arrays;
public class BubbleSort {

    /**
     * Function to sort given array in-place using Bubble Sort algorithm
     * @param array
     */
    public static void bubbleSort(int array[]) {

        //Get the length of the array
        int size = array.length;

        // loop to access each array element
        for (int i = 0; i < size - 1; i++) {
            boolean isSorted = true;

            // loop to compare adjacent elements
            for (int j = 0; j < size - i - 1; j++) {

                // compare two adjacent elements
                if (array[j] > array[j + 1]) {
                    // swap elements if they are not in the intended order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }

    public static void main(String args[]) {
        //  Input array
        int[] data = {-2, 45, 0, 11, -9, 1};
        //Method call to sort arry in-place
        bubbleSort(data);

        // print the sorted array
        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}

// Time Complexity : O(n^2)
// where n is the number of elements in the array.
// This means that the time taken by bubble sort to sort an array of n elements grows quadratically as the size of the array increases.
//
// Space Complexity : O(1)
//Bubble sort works by swapping adjacent elements in the array,so it only needs to
// keep track of two elements at a time and does not require any additional memory for temporary storage.