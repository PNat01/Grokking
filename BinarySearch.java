import java.util.Arrays;

public class BinarySearch {

    public static int binary_search(int[] array, int val) {
        int mid = 0;
        int low = 0, high = array.length;
        int midVal = 0;
        while(low <= high) {
            mid = (low + high) / 2;
            midVal = array[mid];
            if(midVal == val) {
                return val;
            }
            else if(val < midVal) {
                high = mid-1;
            }
            else if(val > midVal) {
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,67,65,454,34,32,4};
        Arrays.sort(array);
        System.out.println(array);
        System.out.println(binary_search(array, 65));
        System.out.println(binary_search(array, 66));
    }
}
