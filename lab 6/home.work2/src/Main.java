import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        h2 in=new h2();
        in.sumOfAllEvenNumber();

        System.out.println(in.sumOfAllOddNumber(0,10));

        Scanner yu=new Scanner(System.in);

        String input=yu.nextLine();
        int length=input.length();
        int sum=0;
        int dig=0;
        for (int i=0;i<length;i++) {
            if (length % 2 == 1) {
                sum += i;
                System.out.println(sum);
            }

        }

    }

}
