//5 How to convert Fahrenheit to Celsius Program in java

import java.util.Scanner;

class FahrenheitToCelsius{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperture in Fahrenheit: ");
        int f = sc.nextInt();

        float c = (f-32)*5/9;
        System.out.println("Temperture in Celsius is: "+c);
            
        sc.close();
    }
}
