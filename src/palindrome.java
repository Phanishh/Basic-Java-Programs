import java.util.Scanner;

public class palindrome
{
    public static void main(String[] args) {
        int number;
        int remainder ;
        int reversed =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        number=scanner.nextInt();
        int orignal=number;
        while(number>0)
        {
            remainder=number%10;
            reversed=reversed*10+remainder;
            number=number/10;
        }
        if(orignal==reversed)
        {
            System.out.println(orignal+" pali");
        }else{
            System.out.println(orignal+"not");
        }
    }
}
