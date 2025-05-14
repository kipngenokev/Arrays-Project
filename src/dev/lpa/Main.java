package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[1] = 45;
        myIntArray[3] =3;
        myIntArray[5] = 50;

        System.out.println(myIntArray[5]);

        double[] myDoubleArray = new double[5];
        myDoubleArray[2] = 3.3;
        System.out.println(myDoubleArray[0]);
        String[] twoNames = new String[] {"John","Mark","Kim"};

        int[] firstTen = {7,3,2,4,6,22,34,22,1,88};
        System.out.println("First :"+firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Array length = "+arrayLength);
        System.out.println("Last element :"+firstTen[arrayLength-1]);

        int[] newArray ;
//        newArray = new int[]{1,2,3,4,5};
        newArray = new int[5];
        for(int i=0;i < newArray.length;i++) {
            newArray[i] = newArray.length-i;
        }

        for(int i = 0;i< newArray.length;i++) {
            System.out.print(newArray[i] + " ");
        }

        System.out.println();

        for(int element : newArray) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(newArray));

        Object objectArray = newArray;
        if(objectArray instanceof int[]) {
            System.out.println("ObjectArray is really an int Array");
        }

        Object[] newObjArray = new Object[3];
        newObjArray[0] = "Hello";
        newObjArray[1] = new StringBuilder("World");
        newObjArray[2] = newArray;

    }
}
