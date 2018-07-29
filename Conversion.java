import java.util.Scanner;
import java.util.*;
public class Conversion 
{
	public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  String First_Integer = sc.next();
  String Second_Integer = sc.next();
  Integer First = Integer.valueOf(First_Integer);
  Integer Second = Integer.valueOf(Second_Integer);
  if(First>Second)
	  System.out.println("The largest of the two integers is : "+First);
  else
      System.out.println("The largest of the two integers is : "+Second);
  }
}