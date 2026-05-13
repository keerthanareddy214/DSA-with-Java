package Arrays;
public class Update {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int pos = 2;
        int newValue = 99;
        arr[pos] = newValue;
        for(int no : arr) {
            System.out.print(no + " ");
        }
    }
}