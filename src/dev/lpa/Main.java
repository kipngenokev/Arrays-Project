package dev.lpa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray= new int[10];
        myIntArray[5]=20;
        myIntArray[3]=56;
        myIntArray[5]=9;
        System.out.println(myIntArray[5]);

        int [] firstTen ={1,2,3,4,5,6,7,8,9,10};
        System.out.println(firstTen[9]);
        int arrayLength = firstTen.length;
        System.out.println("Length of the array ="+arrayLength);
        System.out.println("Last element of the array ="+firstTen[arrayLength-1]);

        int[] newArray ;
        newArray =new int [5];
        for(int i=0;i<newArray.length;i++){
            newArray[i]=newArray.length-i;
        }
        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+" ");
        }

        System.out.println();
        for(int element:newArray){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.print(Arrays.toString(newArray));
        System.out.println();
        Object objectVariable = newArray;
        if(objectVariable instanceof int[]){
            System.out.println("ObjectVariable is really an int array");
        }

        Object[] objectArray= new Object[3];
        objectArray[0]="hello";
        objectArray[1]=new StringBuilder("World");
        objectArray[2]=newArray;
    }
}
