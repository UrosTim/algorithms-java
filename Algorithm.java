import java.util.*;
public class Algorithm {
    public static void main(String[] args){
        //maxNumber();
        //searchIndex();
    }
    /*___________________________________________________________________________________________________________*/
    public static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }
    public static int gcd(int x, int y){
        if(y == 0) {
            return x;
        }
        else {
            return gcd(y, x % y);
        }
    }
    public static double[] generateDoubleArray(int arraySize, int range){
        double[] array = new double[arraySize];
        for(int i = 0; i < array.length; i++)
            array[i] = new Random().nextDouble() * range;
        return array;
    }
    public static int[] generateIntegerArray(int arraySize, int range){
        int[] array = new int[arraySize];
        for(int i = 0; i < array.length; i++)
            array[i] = new Random().nextInt(range);
        return array;
    }
    /*___________________________________________________________________________________________________________*/
    static void maxNumber() {
        double [] array = generateDoubleArray(10,100);
        System.out.println("Generated array:\n" + Arrays.toString(array));
        double maxNumb = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > maxNumb)
                maxNumb = array[i];
        System.out.println("Max number in an array is: " + maxNumb);
    }
    /*___________________________________________________________________________________________________________*/
    static int linearSearch(int [] array, int key){
        for (int i = 0; i < array.length; i++)
            if (array[i] == key)
                return i;
        return -1;
    }
    static void searchIndex(){
        int [] array = generateIntegerArray(10, 100);
        System.out.println("Generated array:\n" + Arrays.toString(array));
        System.out.println("Enter the number you are looking for: ");
        int key = new Scanner(System.in).nextInt();
        int index = linearSearch(array, key);
        if (index != -1)
            System.out.println("Number " + key + " is index " + (index + 1) + " of an array.");
        else
            System.out.println("Number " + key + " was not found.");
    }
}
