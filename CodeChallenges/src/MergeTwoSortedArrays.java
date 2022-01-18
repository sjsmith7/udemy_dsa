import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrays {

    public MergeTwoSortedArrays(){

    }
    public List<Integer> MergeTwoSortedArraysFunc(){
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(0);
        arr1.add(3);
        arr1.add(4);
        arr1.add(31);

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(4);
        arr2.add(6);
        arr2.add(30);

        List<Integer> sortedArray = new ArrayList<>();

        int i = 0;
        int j = 0;
        int count = 0;
        // arr1 = 0,3,4,31  arr2 = 4,6,30
        while (i < arr1.size() && j < arr2.size()) {

            // if they are the same value, then increment both and take one
            if (arr1.get(i).equals(arr2.get(j))) {
                sortedArray.add(arr1.get(i));
                i++;
                j++;
                count++;
            }
            // if arr1 num < arr2
            else if (arr1.get(i) < arr2.get(j)) {
                sortedArray.add(arr1.get(i));
                i++;
                count++;
            }
            // arr2 num < arr1 num
            else {
                sortedArray.add(arr2.get(j));
                j++;
                count++;
            }

        }
        // Store remaining elements of first array
        while (i < arr1.size()) {
            sortedArray.add(count, arr1.get(i));
            i++;
        }
        // Store remaining elements of second array
        while (j < arr2.size()) {
            sortedArray.add(count, arr2.get(j));
            j++;
        }
        // should be 0,3,4,6,30,31
        return sortedArray;
    }
}
