public class Question30 {
    public static void main(String[] args) {
        String input="String to be reversed";
        char[] arr=input.toCharArray();
        int len=arr.length;
        for(int i=0;i<len/2;i++){
            char temp=arr[i];
            arr[i]=arr[len-i-1];
            arr[len-i-1]=temp;
        }
        System.out.println(new String(arr));
    }
}
