package course.Algorithms;

import java.util.Arrays;


public class Sorting {

    public Sorting() {

    }

    public void BubbleSort() { // 0(n^2)
        // needed the logic to stop looping from geeksforgeeks (j < arr.length-i-1) https://www.geeksforgeeks.org/bubble-sort/
        // otherwise had the logic down for swapping variables
        // instructors solution has for the first loop "i < arr.length" & second loop "j < arr.length" for stopping the loops (using js) unsure why that works.
        int[] arr = new int[]{99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        System.out.println("Before: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                int first = arr[j];
                if (arr[j] > arr[j + 1]) {
                    // swap the two
                    arr[j] = arr[j + 1];
                    arr[j + 1] = first;
                }
            }

        }
        System.out.println("After: " + Arrays.toString(arr));
    }
    public void SelectionSort() { // 0(n^2)
        // https://www.geeksforgeeks.org/selection-sort/?ref=leftbar-rightbar
        // keep track of the lowest value at it's index position
        // swap the arr at the lowest position with the index i item
        int[] arr = new int[]{99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        System.out.println("Before: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            int min = i; // get the lowest value index
            int temp = arr[min]; // get the value too
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After: " + Arrays.toString(arr));
    }

    // Great for when you think the list is almost sorted & small data sets.
    public void InsertionSort() { // 0(n^2)
        //https://www.geeksforgeeks.org/insertion-sort/
        /*Function to sort array using insertion sort*/
        // Can also do some fancy string splicing with python/js for this solution.

        int[] arr = new int[]{2, 1, 3, 4, 5, 63, 87, 283, 4, 0};
        System.out.println("Before: "+ Arrays.toString(arr));

        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;

        /* Move elements of arr[0..i-1], that are
           greater than key, to one position ahead
           of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("After: " + Arrays.toString(arr));
    }

    public void MergeSort(int[] arr) { //0(n log n)
        // Divide and Conquer algorithm
        // One of the most popular
        // Normally, one of the fastest ways to sort.
        // https://www.youtube.com/watch?v=Ns7tGNbtvV4
        // Implementation here: https://www.baeldung.com/java-merge-sort
        int[] numbers = new int[]{99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

    }
    public void QuickSort(int[] arr) {
        // Divide and Conquer algorithm
        // Quick Sort also one of the most popular
        // picks a pivot point and places items smaller than the pivot to the left &
        // larger to the right.
        // https://www.geeksforgeeks.org/quick-sort/
        System.out.println("Before: ");

        System.out.println("After: ");

    }

}
