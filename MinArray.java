public class MinArray {
    public static void main(String[] args) {
        int[] arr = {2,42,5,35456,346,456,356,3456,3457,34567,4567,456,73456,3457,356,2};
        int index = minValue(arr);
        System.out.println("The smallese element in the array is :" + arr[index]);
    }
    public static int minValue(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }
}
