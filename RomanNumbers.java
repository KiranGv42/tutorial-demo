package arrays;
import java.util.*;

public class RomanNumbers 
{
	public static void main(String[] args) 
	{
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a Roman number: ");
	        String romanNumeral = sc.nextLine();

	        int result = romanToInt(romanNumeral);
	        System.out.println("Integer Num: " + result);
	    }

	    public static int romanToInt(String s)
	    {
	        Map<Character, Integer> romanToInt = new HashMap<>();
	        romanToInt.put('I', 1);
	        romanToInt.put('V', 5);
	        romanToInt.put('X', 10);
	        romanToInt.put('L', 50);
	        romanToInt.put('C', 100);
	        romanToInt.put('D', 500);
	        romanToInt.put('M', 1000);

	        int result = 0;
	        int prevValue = 0;

	        for (int i = s.length() - 1; i >= 0; i--) 
	        {
	            int curValue = romanToInt.get(s.charAt(i));
	            if (curValue >= prevValue) 
	            {
	                result += curValue;
	            }
	            else
	            {
	                result -= curValue;
	            }
	            prevValue = curValue;
	        }

	        return result;
	    }
	}
