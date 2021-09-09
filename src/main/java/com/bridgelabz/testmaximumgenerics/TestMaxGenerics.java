package com.bridgelabz.testmaximumgenerics;

public class TestMaxGenerics {

	public static <T extends Comparable<T>> T findmax(T[] array)
    {
        T max = array[0];

        if (array[1].compareTo(max) > 0)
            max = array[1];

        if (array[2].compareTo(max) > 0)
            max = array[2];

        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {3,7,2};
        Float[] floatArray = {2.5f,6.0f,9.7f};
        String[] stringArray={"Saurabh","Swati","Sonali"};

        System.out.println(findmax(intArray));
        System.out.println(findmax(floatArray));
        System.out.println(findmax(stringArray));
    }
}