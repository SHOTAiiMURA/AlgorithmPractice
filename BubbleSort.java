import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort {
    public static void main(String[] args) {
        Integer[] numList = {4,6,2,8,5,12,1,8};
        //accending sort
        Arrays.sort(numList);
        //descending sort
        //Arrays.sort(numList,Comparator.reverseOrder());
        for(int i : numList){
            System.out.println(i);
        }
    }
}
