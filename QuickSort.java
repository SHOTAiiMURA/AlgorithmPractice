public class QuickSort {
    static void quickSort(int[] array, int start, int end) {
        //                       run-time complexity = Best case O(n log(n))
        //				   		                   Average case O(n log(n))
        //				   		                   Worst case O(n^2) if already sorted

        //                       space complexity    = O(log(n)) due to recursion
        // quick sort = moves smaller elements to left of a pivot. in contrast, moves larger elements to right of a pivot.
        // recursively divide array in 2 partitions.
        if (start < end) return;
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }
    static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j < end; j++){
            if(array[j]<pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
    public static void main(String[] args) {
        int[] array = {2,3,5,4,1,9,6,8,7};
        quickSort(array, 0, array.length - 1);

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
