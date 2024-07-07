public class seletionSort {
    public static void main(String[] args) {
        int[] array = {3,5,4,1,8,6,7,1,9,2};
        selectionSort(array);
        for(int i=0; i < array.length; i++){
            System.out.print(i + " ");
        }
    }
    public static void selectionSort(int array[]){
        for(int i = 0; i < array.length-1; i++){
            int minInt = i;
            for(int j = 0; j <array.length; j++){
                if(array[minInt]>array[j]){
                    minInt = j;
                }
            }
        int temp = array[i];
        array[i] = array[minInt];
        array[minInt] = temp;
        }
    }
}