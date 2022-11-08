public class h2
{
    private static int sum=0,sum1=0;
    public int sumOfAllEvenNumber()
    {
        for (int i = 1; i <= 100; i++)
        {
            if (i % 2 == 0)
            {
                sum += i;
            }
        }
            return sum;
        }


public int sumOfAllOddNumber(int a,int b)
{
        for (int i=a;i<=b;i++)
        {
            if (i%2==1)
            {
                sum1+=i;
            }
        }
        return sum1;
}
}