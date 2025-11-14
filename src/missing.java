public class missing
{
    public static void main(String[] args) {
        int a[]={1,2,4,5,6,7,8,9};
        int sum1=0;
        for(int i=0;i<a.length;i++)
        {
            sum1=sum1+a[i];
        }
        int sum2=0;
        for(int i=1;i<=9;i++)
        {
            sum2=sum2+i;
        }
        int result=sum2-sum1;
        System.out.println(result);
    }
}
/*
first calculate total sum of array i.e sum1
now calculate total array i.e sum2
then subtract sum2 and sum1 to get answer
*/
