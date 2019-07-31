import java.util.Scanner;
public class Program3
{
	public static void main(String args[])
	{
		Scanner s = new Scanner("This is a test string false true 1 2 3 8.90");
		int ci=0,cb=0,cs=0,cd=0;
		while(s.hasNext())
		{
			if(s.hasNextInt())
			{
				System.out.println("int:" + s.nextInt());
				ci++;
			}
			else if(s.hasNextDouble())
			{
				System.out.println("double:" + s.nextDouble());
				cd++;
			}
			
			else if(s.hasNextBoolean())
			{
				System.out.println("Boolean:" +s.nextBoolean());
				cb++;
			}
			else
			{
				System.out.println("String:" + s.next());
				cs++;
			}
		}
		System.out.println("int: "+ci+" double: "+cd+" string: "+cs+" Boolean: "+cb);
	}
}