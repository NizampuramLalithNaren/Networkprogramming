import java.util.StringTokenizer;
public class Program1
{
	public static void main (String args[])
	{
		StringTokenizer st = new StringTokenizer("My-name-is-lalith","-");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}