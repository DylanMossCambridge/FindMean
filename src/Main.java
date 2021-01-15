import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] numArr = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> numList = new ArrayList<>();
        for(int num : numArr){
            numList.add(num);
        }

        System.out.printf("For Loop Mean %d\n",forLoopMean(numArr));
        System.out.printf("For Each Mean %d\n",forEachMean(numArr));
        System.out.printf("Iterator Mean %d\n",iteratorMean(numList));
    }

    public static int forLoopMean(int[] numArr){
        int total = 0;
        for(int i=0; i<numArr.length; i++){
            total += numArr[i];
        }
        return total / numArr.length;
    }

    public static int forEachMean(int[] numArr){
        int total = 0;
        for(int num : numArr){
            total += num;
        }
        return total / numArr.length;
    }

    public static int iteratorMean(ArrayList<Integer> numList){
        Iterator<Integer> step = numList.iterator();
        int total = 0;
        while(step.hasNext()){
            total += step.next();
        }
        return total / numList.size();
    }
}
