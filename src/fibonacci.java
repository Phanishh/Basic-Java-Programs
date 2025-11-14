import java.util.Scanner;

public class fibonacci
{
    public static void main(String[] args)
    {
        int number,t1=0,t2=1,nextterm;
        System.out.print("Enter the number of terms :");
        Scanner scanner = new Scanner(System.in);
        number=scanner.nextInt();
        scanner.close();

        //main logic
        for(int i =1;i<=number;i++)
        {
            System.out.print(t1);
            nextterm=t1+t2;
            t1=t2;
            t2=nextterm;

            /*
            1) first  it prints t1 which is 0.
            2) next it checks for loop if number -5 now it checks
            counter=1,2
            number=5  1<5(T),2<5(T),
            t1=0,1
            t2=1,2
            nextterm=1,3,
             */
        }
    }
}