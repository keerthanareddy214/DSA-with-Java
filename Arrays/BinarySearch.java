package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90};
        int element = 30;
        int low = 0;
        int high = arr.length-1;
        boolean found = false;
        while (low <= high) {
            int mid = (low+high)/2;
            if(arr[mid] == element) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            }
            if(element > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(!found) {
            System.out.println("Element not found");
        }

    }
    
}
