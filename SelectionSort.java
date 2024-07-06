public class SelectionSort {
    //quadratic time O(n2)
    //small data set = good
    //large data set = bad
    public static void main(String[] args) {
        int[] arr = {8,2,3,6,9,1,4,7,5,1};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " ");
        }
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
