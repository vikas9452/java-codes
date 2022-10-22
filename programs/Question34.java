public class Question34 {
    public static void main(String[] args) {
        int n=3;
    int arr[][]={   {1,2,3}, 
                    {1,2,3}, 
                    {1,2,3}
                };
    System.out.println("Before Transpose");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
    }
    System.out.println("After Transpose");
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    }
    
}
