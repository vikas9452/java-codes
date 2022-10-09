public class Question9 {
    public static void main(String [] args){
        int [] a = {4,5,8,5,2,7,9};
        int largest=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        System.out.println("largest no present is : "+largest);
    }
}
