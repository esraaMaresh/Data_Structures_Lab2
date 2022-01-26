//write a java method that clone an array to another array
public class Backup {
    public static void main(String[] args) {
        int []array ={10 , 20 , 30 , 40 , 50};
        int clone_array[]=array.clone();
        System.out.println("Before cloning");
        for (int i=0; i<array.length ; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Cloned array");
        for (int i=0; i<clone_array.length ; i++)
        {
            System.out.print(clone_array[i]+" ");
        }


    }
}
