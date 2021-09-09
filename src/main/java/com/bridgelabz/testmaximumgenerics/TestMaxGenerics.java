package com.bridgelabz.testmaximumgenerics;

public class TestMaxGenerics<T extends Comparable<T>>{

    T x,y,z,a;

    public TestMaxGenerics(T x, T y, T z,T a) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.a=  a;
    }

    public T maximum(){
        return TestMaxGenerics.maximum(x,y,z,a);
    }

    public static <T extends Comparable<T>> T maximum(T x,T y,T z,T a)
    {

        T max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        if (a.compareTo(max)>0)
            max = a;

        printMax(x,y,z,max);

        return max;


    }


    public static <T> void printMax(T x,T y,T z,T max){
        System.out.println("Max is: "+max);
    }

    public static void main(String args[]){
        Integer xInt = 13,yInt = 30,zInt = 24,aInt = 22;
        Float xF1 = 3.4f,yF1 = 1.1F,zF1 = 7.3F,aF1 = 6.9f;
        String xStr = "Saurabh",yStr = "Swati",zStr = "Sonali",aStr = "Tushar";

        new TestMaxGenerics(xInt,yInt,zInt,aInt).maximum();
        new TestMaxGenerics(xF1,yF1,zF1,aF1).maximum();
        new TestMaxGenerics(xStr,yStr,zStr,aStr).maximum();

    }

}