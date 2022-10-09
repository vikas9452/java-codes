public class NestedIfElse
{

public static void main(String... ar)
{
int marks=99;
if(marks<100)
{
	if(marks<98)
		System.out.println("marks is less than 100 & marks is also less than 98");
	else
		System.out.println("marks is less than 100 but marks is not less than 98");
}

else 
	System.out.println("marks is not less than 100");

}

}