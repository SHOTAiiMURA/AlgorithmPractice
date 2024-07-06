public class insertionSort2 {
    public static void main(String[] args) {
        int[] arr = {6,7,8,91,4,3};
        insertionSort(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(i + " ");
        }
    }
    public static void insertionSort(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

    }
}
