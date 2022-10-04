//4 How to get Using input using Scanner Program in java
import java.util.Scanner;

class Question4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    System.out.println(name);
    sc.close();
  }
}
