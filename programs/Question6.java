import java.util.Scanner;

public class Question6 {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        c=b;
        b=a;
        a=c;
        System.out.println("a = "+ a+", b = "+b );
    }
}
