package stringsPrograms;

public class Panagram 
{
	public static void main(String[] args) 
	{
		String s="a quick brown fox jumps over the lazy dog";
		
		if(isPanagram(s)) System.out.println(true);
		else
			System.out.println(false);
	}
		public static boolean isPanagram(String s)
		{
			if(s.length()<26)
				return false;
			for(char ch='a';ch<='z';ch++)
			{
				if(s.indexOf(ch)==-1)
					return false;
			}
			return true;
		}
}

