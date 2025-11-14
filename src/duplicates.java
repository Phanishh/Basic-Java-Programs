public class duplicates
{
    public static void main(String[] args) {
        int a[]={10,12,10,23,12,45};
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
