import java.util.*;
import java.io.*;

public class BubbleSort{

    public static void main(String[] args){

        //Taking the input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Bubble Sort Algorithm
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        //Printing the output
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}