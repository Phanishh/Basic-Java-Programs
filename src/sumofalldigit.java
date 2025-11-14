import java.util.Scanner;

public class sumofalldigit
{
    public static void main(String[] args)
    {
        int number=123;
        int sum=0;
        int remainder;

        while(number>0)
        {
            remainder=number%10;
            sum+=remainder;
            number=number/10;
        }
        System.out.print(sum);
    }
    /*
    it is similar to reversing of number but here we add numbers using sum
     */
}
