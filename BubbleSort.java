import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        Integer[] numList = {8,7,6,5,4,3,2,1};
        Arrays.sort(numList);
        for(int i : numList){
            System.out.println(i);
        }
    }
}
