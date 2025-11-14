public class maxarray
{
    public static void main(String[] args) {
        int a[]={10,30,45,67,98,43,101};
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
