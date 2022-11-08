import java.util.Scanner;

public class h8
{
    public static void main(String[] args)
    {

        Scanner in=new Scanner(System.in);
        int number;

        System.out.println("Enter a number :");
        number=in.nextInt();


     for (int i=0;i<=number;i++)
     {
         if (i%2==1)
             System.out.println(i);
     }
        if (number%2!=1)
        System.out.println(number);


    }
}