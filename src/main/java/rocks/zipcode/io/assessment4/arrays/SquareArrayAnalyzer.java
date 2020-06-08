package rocks.zipcode.io.assessment4.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.addAll(Arrays.asList(inputArray));

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.addAll(Arrays.asList(squaredValues));

        ArrayList<Integer> squared = new ArrayList<>();
        for(int i : arr1){
            squared.add(i * i);
        }

        for (int i = 0; i <arr2.size() ; i++) {
            if(!squared.contains(i)){
                return true;
            }
        }
        return false;
    }
}
