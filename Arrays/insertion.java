package Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int pos = 2;
        int element = 99;
        for(int i = arr.length-1;i>pos;i--) {
            arr[i] = arr[i-1];
        }
        arr[pos] = element;
        for(int no : arr) { // Traversing updated array
            System.out.print(no + " ");
             

        } 
    }
    
}
