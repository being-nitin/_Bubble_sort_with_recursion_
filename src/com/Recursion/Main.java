package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// bubble sort with recursion.
        int[] arr = {5,6,3,1,7};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));



    }
    public static void bubble(int[] arr,int lastElement,int elements){
        /* as like before we did in the pattern printing with row and columns. in place of rows
           and columns.
         */
        if(lastElement==0){
            return;
        }
        if(elements<lastElement){
            if(arr[elements]>arr[elements+1]){
                int temp = arr[elements];
                arr[elements] = arr[elements+1];
                arr[elements+1] = temp;
            }
            bubble(arr,lastElement,elements+1);
        }
        else{
            bubble(arr,lastElement-1,0);
        }

    }
}
