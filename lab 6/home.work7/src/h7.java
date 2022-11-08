import java.util.Scanner;
public class h7
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int number;
        int binary;

        System.out.println("Enter The number :");
        number=in.nextInt();


    for (;;)
    {
        if (number == 0) break;

        binary = (number % 2 == 1) ? 1 : 0;
        number = number / 2;

        System.out.println( binary);
    }}}
