import java.util.Scanner;
public class h3
{
    public static void main(String[] args)
    {
        String name;
        Scanner input=new Scanner(System.in);

        System.out.println("enter your name");
        name=input.next();

        for (int i=0;i<name.length();i++)
        {
        System.out.println(name.charAt(i));
        }

    }
}
