import java.util.Scanner;
class Question25{
    public static void main(String[] args){
        System.out.println("Enter number for which you need multiplication table");
        Scanner scanner=new Scanner(System.in);
        int tableNumber=scanner.nextInt();
        for(int i=1;i<=20;i++){
            System.out.println(i+" X "+tableNumber+" = "+i*tableNumber);
        }
    }
}