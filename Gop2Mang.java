import java.util.Scanner;

public class Gop2Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1 = 5;
        int size2 = 7;
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        for (int i = 0; i < size1; i++) {
            System.out.println("Enter element of arr1 " + (i + 1) + ":");
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < size2; i++) {
            System.out.println("Enter element of arr2 " + (i + 1) + ":");
            arr2[i] = scanner.nextInt();
        }
        int[] arr3 = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
        arr3[i] = arr1[i];

        }
        for (int i = 0; i < size2; i++) {
            arr3[size1 + i] = arr2[i];
        }
        System.out.print("Mảng sau khi gộp: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
