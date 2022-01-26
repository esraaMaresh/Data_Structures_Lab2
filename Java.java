import java.util.Random;

//write a java method that repeatdly selects and removes a random entry from an array
//until the array holds no more entries
public class Java {
    public static void main(String[] args) {
        int [] array ={1,2,3,4,5,6,7,8,9,0};
        removeElements(array);

    }
    public static void removeElements(int[]array)
    {
        Random r=new Random();
        while (array.length>0)
        {
            int index =r.nextInt(array.length);
            System.out.println("Index= "+index+" Element "+array[index]);
            int array1[]=new int [array.length-1];
            for (int i = 0; i <index ; i++)
            {
             array1[i]=array[i];
            }
            /*for (int i = index; i < array.length-1; i++)
            {
                array[i]=array[i+1];
                array=array1;*/
            }
        }
    }

