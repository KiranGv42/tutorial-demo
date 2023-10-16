package arrays;
import java.util.Arrays;
import java.util.Random;

public class ShuffleArray 
{
	    public static void main(String[] args) 
	    {
	        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
	        shuffleArray(myArray);
	        System.out.println(Arrays.toString(myArray));
	    }
	    public static void shuffleArray(int[] array) 
	    {
	        Random r = new Random();
	        for (int i = array.length - 1; i > 0; i--) 
	        {
	            int index = r.nextInt(i + 1);
	            int temp = array[index];
	            array[index] = array[i];
	            array[i] = temp;
	        }
	    }
	}



