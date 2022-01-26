import java.util.Arrays;

//Write a java method that reverse an array using another array
public class Reserve {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6};
        int arr2[]= new int[6];
        System.out.println("Array before reverse");
        System.out.println(Arrays.toString(arr1));
       SwapArrays(arr1);

    }
    public static void SwapArrays(int []First_Array)
    {
        int Second_Array[]= new int[6];
        for (int i = 0; i <First_Array.length ; i++)
        {
            Second_Array[i]=First_Array[i];
        }
        System.out.println("display the elements of the second array ");
        for (int i = 0; i <Second_Array.length ; i++)
        {
            System.out.print(Second_Array[i]+" ");
        }

    }
}
