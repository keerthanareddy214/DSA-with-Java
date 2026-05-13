package Arrays;

public class Deletion { 
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int pos = 3;
        for(int i = pos; i < arr.length -1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        for(int no : arr) {
            System.out.print(no + " ");
        }
    }
}