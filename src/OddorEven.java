import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args)
    {
        int number;
        System.out.print("Enter the number :");
        Scanner scanner = new Scanner(System.in);
        number=scanner.nextInt();
        scanner.close();

        if(number%2==0)
        {
            System.out.println("Even number");
        }else{
            System.out.println("odd number");
        }

    }
}