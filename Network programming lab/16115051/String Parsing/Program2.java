public class Program2
{
	public static void main(String args[])
	{
		String s = "My name is Lalit Naren.";
		String []arr = s.split(" ");
		for(String w : arr)
		{
			System.out.println(w);
		}
	}
}