//java program for while loop using break statement


public class Main {
  public static void main(String[] args) {
    int i = 0;
    while (i < 10) {
      System.out.println(i);
      i++;
      if (i == 7) {
        break;
      }
    }  
  }
}