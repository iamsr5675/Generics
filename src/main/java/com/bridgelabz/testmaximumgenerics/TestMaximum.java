package com.bridgelabz.testmaximumgenerics;

public class TestMaximum
{
	public static int Findmax(Integer[] intArray){
        int max = intArray[0];
        if(intArray[1].compareTo(max)>0)
        {
            max = intArray[1];
        }
        if (intArray[2].compareTo(max)>0)
        {
            max = intArray[2];
        }
        return max;
    }

    public static float Findmax1(Float[] floatArray){
        float max = floatArray[0];
        if(floatArray[1].compareTo(max)>0)
        {
            max = floatArray[1];
        }
        if (floatArray[2].compareTo(max)>0)
        {
            max = floatArray[2];
        }
        return max;

    }

    public static void main(String[] args) {
        Integer[] intArray = {4,7,1};
        Float[] floatArray = {6.5f,2.0f,9.2f};


        int maxnumint = Findmax(intArray);
        System.out.println("Max Integer is: "+maxnumint);

        float maxnumfloat = Findmax1(floatArray);
        System.out.println("Max Float is: "+maxnumfloat);
    }
}