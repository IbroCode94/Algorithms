package org.example;

public class selectionSort {
    public void selectionSort(int []arr){
         for(int j =0;  j< arr.length; j++){
             //for everyloop minimum value is set to be j, so for second iteration, minimum value will be 1;
            int minimumValue = j;
            //
            for(int i = j+1; i < arr.length; i++){
                if(arr[i] < arr[minimumValue]){
                    minimumValue = i;
                }
            }
            if(minimumValue != j){
                int temp = arr[j];
                arr[minimumValue] = temp;
            }
        }
    }




    public static void printArray(int [] array){
        for(int i =0; i< array.length; i++){
            System.out.println(array[i] + " ");
        }
    }
}
