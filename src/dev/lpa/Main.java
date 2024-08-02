package dev.lpa;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray=new int[10];
        myIntArray[5]=50;
        myIntArray[2]=45;
        myIntArray[0]=1;

        double[] myDoubleArray= new double[10];
        myDoubleArray[2]=3;
        System.out.println(myDoubleArray[2]);

        int[] myFirstFivePositives =  {1,2,3,4,5,6,90,0};
        System.out.println(myFirstFivePositives[0]);
        int arrayLength = myFirstFivePositives.length;
        System.out.println("Length of array ="+arrayLength);
        System.out.println("last element ="+myFirstFivePositives[arrayLength-1]);

        int[] newArray;
        //newArray=new int[] {5,4,3,2,1};
        newArray= new int[5];
        System.out.println("Length of new array="+newArray.length);

        for(int i=0;i<newArray.length;i++){
            newArray[i] =newArray.length-i;
            
        }
        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i] +" ");
        }
    }
}
