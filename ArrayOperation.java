import java.util.Arrays;

public class ArrayOperation {
    public static void main(String[] args) {
        int x[]={1,2,3,4,5,6};
        System.out.println("Array before reserve ");
        System.out.println(Arrays.toString(x));
        System.out.println("Array after reserve");
        System.out.println(Arrays.toString(reverse(x)));
        System.out.println("Shift right an array ");
        System.out.println(Arrays.toString(ShiftRight(x)));
        System.out.println("Shift left an array");
        System.out.println(Arrays.toString(ShiftLeft(x)));

    }
    public  static int[]reverse(int []x)
    {
        int n=x.length-1;
        for (int i = 0; i <x.length/2 ; i++) {
            int temp=x[i];
            x[i]=x[n];
            x[n]=temp;
            n--;
        }
        return x;
    }//reserve
public static int[] ShiftRight(int []x)
{
    int e=x[x.length-1];
    for (int i = x.length-1; i >0; i--) {
        x[i]=x[i-1];
    }
    x[0]=e;
    return x;
}//shift right
    public static int[] ShiftLeft(int x[])
    {
        int e=x[0];
        for (int i = 0; i <x.length-1 ; i++) {
            x[i]=x[i+1];
        }
        x[x.length-1]=e;
        return x;
    }//shift left
}
