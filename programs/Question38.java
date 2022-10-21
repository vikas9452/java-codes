//How to replace string with another string in java Program

public class rep1 {
    public static void main(String args[])
    {
  
        // Initialising String
        String Str = new String("Welcome to geeksforgeeks");
  
        // Using replace to replace characters
        System.out.print("After replacing all o with T : ");
        System.out.println(Str.replace('o', 'T'));
  
        // Using replace to replace characters
        System.out.print("After replacing all e with D : ");
        System.out.println(Str.replace('e', 'D'));
    }
}
