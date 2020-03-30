package rocks.zipcode.io.assessment4.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for(SomeType t : array){
            if(getNumberOfOccurrences(t) %2 != 0){
                return t;
            }
        }

        return null;
    }

    public SomeType findEvenOccurringValue() {
        for(SomeType t : array){
            if(getNumberOfOccurrences(t) %2 == 0){
                return t;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int count = 0;
        for (SomeType t : array) {
            if (valueToEvaluate.equals(t))
                count++;
        }
        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

        return null;
    }
}
