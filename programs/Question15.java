//How to complete 2 string in Java program
//concatenation of strings
class stringConcat{
    public static void main(String[] args){
        String str1="Hello";
        String str2="World!!";
        
        System.out.println(str1+str2);   //using + operator

        System.out.println(str1.concat(str2)); //using concate method
    }
}