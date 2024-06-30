public class InsertionSort {
    static void insertionSort(int data[], int arraySize){
        int j, temp;
        for(int i = 1; i < arraySize; i++) {
            j = i;

            //descending order
            //while(i>0 && data[j-1]<data[i])
            //accending order
            while (j > 0 && data[j - 1] < data[j]) {
                temp = data[j - 1];
                data[j - 1] = data[j];
                data[j] = temp;
                j -= 1;
            }
        }
    }
    public static void main(String[] args) {
        int[] data = {6,7,8,91,4,3};
        int arraySize = data.length;
        insertionSort(data, arraySize);

        for(int i = 0; i < arraySize; i++){
            System.out.print(data[i]+" ");
        }

    }
}
