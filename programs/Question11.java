import java.util.*;
import java.io.*;


public class Question11{

    public static void main(String[] args){

        /* Conditional Statements
             - if(----)
             - else if(----)
             - else(----)
        */

        int marks = 97;

        if(marks >= 90){
            System.out.println("Grade - A");
        }

        else if((marks < 90) && (marks >= 75)){
            System.out.println("Grade - B");
        }     

        else{
            System.out.println("Grade - C");
        }

    }
}