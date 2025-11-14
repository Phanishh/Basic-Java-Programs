import java.util.Scanner;
public class reverse
{
    public static void main(String[] args)
    {
        int number;
        int remainder,rev=0;
        System.out.print("Enter the number :");
        Scanner scanner = new Scanner(System.in);
        number=scanner.nextInt();
        scanner.close();

        while (number>0)
        {
            remainder=number%10;
            System.out.print(remainder);
            number=number/10;

            /*
            here ill divide the whole number by 10 then i get remainder of it
            suppose 123/10=3(remainder) and quotient is 12
            now divide quotient 12/10=2(remainder) and quotient is 1
            so final output is 3,2,1
            now to store quotient and divide again im using number=number/10; fucnction
             */
        }
    }
}
