import java.util.Scanner;

public class h1
{

    public static void main(String[] args)
    {
       int year=0;
        Scanner in=new Scanner(System.in);
        double balance,rete;

        System.out.println("Enter The Initial Investment Balance");
        balance= in.nextInt();

        System.out.println("Enter The  Interest Rate");
        rete=in.nextInt();

        rete*=0.01;

         for (;;)
         {
        balance+=balance*rete;
        if (balance>=1000000)break;

        else year++;
         }

        System.out.println("you need "+year+" to get 1Mil");

    }


}
