class Question20 {
    public static int reverse(int n){
      int reverse = 0; 
      int remaining; 
       
      while(n>0){  
        remaining = n%10;
        reverse = (reverse*10) + remaining;
        n = n/10;
      }
      return reverse;
    }
