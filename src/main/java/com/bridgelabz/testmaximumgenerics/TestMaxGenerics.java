package com.bridgelabz.testmaximumgenerics;

public class TestMaxGenerics<T extends Comparable<T>>{

    T x,y,z;

    public TestMaxGenerics(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum(){
        return TestMaxGenerics.maximum(x,y,z);
    }

    public static <T extends Comparable<T>> T maximum(T x,T y,T z)
    {
        T max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        printMax(x,y,z,max);

        return max;
    }

    public static <T> void printMax(T x,T y,T z,T max){
        System.out.println("Max is: "+max);
    }

    public static void main(String args[]){
        Integer xInt = 3,yInt = 8,zInt = 7;
        Float xF1 = 6.3f,yF1 = 3.1F,zF1 = 9.1F;
        String xStr = "Saurabh",yStr = "Swati",zStr = "Sonali";

        new TestMaxGenerics(xInt,yInt,zInt).maximum();
        new TestMaxGenerics(xF1,yF1,zF1).maximum();
        new TestMaxGenerics(xStr,yStr,zStr).maximum();
    }
}