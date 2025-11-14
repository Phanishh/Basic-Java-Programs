import java.util.Arrays;

public class secondLargest {
    public static void main(String[] args)
    {
        int arr[]={1,2,3,6};
        int n =arr.length;
        // Sort the array
        Arrays.sort(arr);

        // Find the second largest (ignoring duplicates)
        int largest = arr[n - 1];
        int secondLargest = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                secondLargest = arr[i];
                break;
            }
        }
        if (secondLargest == -1)
            System.out.println("No second largest element (all elements are equal)");
        else
            System.out.println("Second largest element: " + secondLargest);
    }
}
