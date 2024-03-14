package org.example;

import java.util.ArrayList;

public class ArraysCompareUtils {


    public static <T> boolean compareArrays(ArrayList<T> array1,ArrayList<T> array2){
        if(array1.size() != array2.size()){
            return false;
        }
        for (int i = 0; i < array1.size(); i++) {
            if(array1.get(i).getClass() != array2.get(i).getClass()){
                return false;
            }
        }
        return true;
    }
}
