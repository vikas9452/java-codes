import java.util.*;
import java.io.*;

public class InsertionSort{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        //for taking the input
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Insertion sort
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j=i-1;        //the ending of the array
            while((j>=0) && (arr[j]>key)){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        //for printing the sorted array
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}