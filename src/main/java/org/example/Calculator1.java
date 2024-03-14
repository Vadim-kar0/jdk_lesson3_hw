package org.example;

public class Calculator1 {


    public static <T extends Number> T sum(T num1, T num2) {
        if (num1 instanceof Integer) {
            if(num2 instanceof Float){
                return (T) Float.valueOf(num1.floatValue() + num2.floatValue());
            } else if (num2 instanceof Double) {
                return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
            } else
            return (T) Integer.valueOf(num1.intValue() + num2.intValue());
        } else if (num1 instanceof Float) {
            if(num2 instanceof Double){
                return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
            }
            return (T) Float.valueOf(num1.floatValue() + num2.floatValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported data type");
        }
    }
    public static <T extends Number> T subtract(T num1, T num2) {
        if (num1 instanceof Integer) {
            if(num2 instanceof Float){
                return (T) Float.valueOf(num1.floatValue() - num2.floatValue());
            } else if (num2 instanceof Double) {
                return (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
            } else
                return (T) Integer.valueOf(num1.intValue() - num2.intValue());
        } else if (num1 instanceof Float) {
            if(num2 instanceof Double){
                return (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
            }
            return (T) Float.valueOf(num1.floatValue() - num2.floatValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() - num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported data type");
        }
    }
    public static <T extends Number> T multiply(T num1, T num2) {
        if (num1 instanceof Integer) {
            if(num2 instanceof Float){
                return (T) Float.valueOf(num1.floatValue() * num2.floatValue());
            } else if (num2 instanceof Double) {
                return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
            } else
                return (T) Integer.valueOf(num1.intValue() * num2.intValue());
        } else if (num1 instanceof Float) {
            if(num2 instanceof Double){
                return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
            }
            return (T) Float.valueOf(num1.floatValue() * num2.floatValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported data type");
        }
    }
    public static <T extends Number> T divide(T num1, T num2) {
        if (num1 instanceof Integer) {
            if(num2 instanceof Float){
                return (T) Float.valueOf(num1.floatValue() / num2.floatValue());
            } else if (num2 instanceof Double) {
                return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
            } else
                return (T) Integer.valueOf(num1.intValue() / num2.intValue());
        } else if (num1 instanceof Float) {
            if(num2 instanceof Double){
                return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
            }
            return (T) Float.valueOf(num1.floatValue() / num2.floatValue());
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() / num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported data type");
        }
    }
}
