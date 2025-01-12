import java.util.Arrays;
import java.util.Scanner;

public class RemoveItemInArray {
    public static void main(String[] args) {
        int[] arr = {3,563,634,782,4,3,45,65,};
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int index_del = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index_del = i;
            }
        }
        for (int i = index_del; i < arr.length; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
