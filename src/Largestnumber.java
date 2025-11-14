import java.util.Scanner;

public class Largestnumber
{
    public static void main(String[] args)
    {
        long number;
        long remainder;
        System.out.print("Enter the number :");
        Scanner scanner = new Scanner(System.in);
        number=scanner.nextLong();
        scanner.close();
        long maxsum=0;
        while(number>0)
        {
            remainder=number%10;
            if(remainder>maxsum)
            {
                maxsum=remainder;
            }
            number=number/10;
        }
        System.out.print(maxsum);

    }
}
