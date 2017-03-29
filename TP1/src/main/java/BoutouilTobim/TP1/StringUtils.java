package BoutouilTobim.TP1;

public class StringUtils
{
	public StringUtils()
	{
		
	}
	
	void reverseString(String s)
	{
		int l = s.length();
		String res;
		char c[] = new char[l];
		int j = 0;
		System.out.println("Longueur de la chaine = "+l);
		for(int i = (l - 1); i >= 0 ; i--)
		{
			c[j] = s.charAt(i);
			j++;
		}
		res = new String(c);
		System.out.println("Chaine inversee = "+res);
	}
}
