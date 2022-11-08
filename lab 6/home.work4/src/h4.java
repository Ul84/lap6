import java.util.Scanner;
public class h4
{
    public static void main(String[] args)
    {

    Scanner input=new Scanner(System.in);
    String name;

    System.out.println("please enter your name");
    name=input.next();
    StringBuilder s=new StringBuilder(name);
    s.reverse();

    System.out.println("Your name in revers: "+ s);








}
}
