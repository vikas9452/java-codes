import java.util.*;
public class Question32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Matrix A:");
        int [][] a = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter matrix B:");
        int [][] b = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix A + Matrix B =");
        int [][] c = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
