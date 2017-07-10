import java.util.*;
import java.io.*;
public class Countdigit
{
    public static void main(String[] args)throws IOException
    {
      
    BufferedReader vc=new BufferedReader(new InputStreamReader(System.in));
  
    int n, reversedNumber = 0, remainder;

 System.out.println("Enter an integer");
 n=Integer.parseInt(vc.readLine());

    while(n != 0)
    {
        remainder = n%10;
        reversedNumber = reversedNumber*10 + remainder;
        n /= 10;
    }

    System.out.println("Reversed Number="+reversedNumber);
}
}
