import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation2 {
    int []x;
    int numOfElements;
    public static void main(String[] args) {
        ArrayOperation2 test= new ArrayOperation2();
        Scanner in = new Scanner(System.in);
        System.out.println("input elements");
        for (int i = 0; i <7 ; i++) {
            if (test.add(in.nextInt())==0)
                System.out.println("added sucessfully");
            else
                System.out.println("array is full");
            System.out.println(Arrays.toString(test.x));
            System.out.println("Add sorted elments ");


        }
    }

    public ArrayOperation2() {
        x= new int[5];
        numOfElements=0;
    }
    public int add(int e)
    {
        if(numOfElements<x.length)
        {
            x[numOfElements]=e;
            numOfElements++;
            return 0;
        }
        return -1;
    }//add

    public int addSorted(int e)
    {
        if(numOfElements<x.length)
        {
            int i=numOfElements;
            while(i>0 && e<x[i-1])
            {
                x[i]=x[i-1];
                i--;
            }
            x[i]=e;
            numOfElements++;
            return 0;
        }
            else
                return -1;
        }//add sorted



}
