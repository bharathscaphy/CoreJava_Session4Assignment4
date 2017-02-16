
public class ReverseString {
	public static void main(String[] args)
	{
		String str ="ArrayString";
		StringBuilder str1=new StringBuilder();
		str1.append(str);
		str1=str1.reverse();
		for(int i=0;i<str1.length();i++)
		{
			System.out.print(str1.charAt(i));
		}
	}
}
