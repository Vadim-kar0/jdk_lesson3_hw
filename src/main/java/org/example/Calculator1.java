package org.example;

public class Calculator {


    public static  <T extends Number> T  sum(T t1,T t2){
        if(t1 instanceof Integer)
            return (T) (Integer.valueOf(t1.intValue() + t1.intValue()));
        else if(t1 instanceof Double)
            return (T) (Double.valueOf(t1.doubleValue() + t1.doubleValue()));
        else if(t1 instanceof Float)
            return (T) (Float.valueOf(t1.floatValue() + t1.floatValue()));

        return null;

    }
}
