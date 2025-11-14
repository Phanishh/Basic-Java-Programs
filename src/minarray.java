public class minarray
{
    public static void main(String[] args)
    {
        int a[]={80,30,50,70,20};
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
