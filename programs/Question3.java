//3 Command Line Argument

class Question3{
  public static void main(String[] args){
    for(int i=0; i<args.length; i++){
      System.out.printf("Argument %d: %s" + (i+1) + args[i]);
    }
  }
}
