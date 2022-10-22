import java.util.*;
class Multiplication {
    public  static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose multiplication table has to be printed");
        int n;
        n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
