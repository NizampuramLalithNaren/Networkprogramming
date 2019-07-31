import java.util.Scanner;
public class Program5
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String name;
		int roll;
		int sub[] = new int[5];
		int i=0;
		double total=0;
		System.out.println("Enter Your name ");
		name = s.nextLine();

		System.out.println("Enter your roll number");
		roll = Integer.parseInt(s.nextLine());

		System.out.println("Enter your marks");
		for(i = 0 ; i< 5;i++)
		{
			System.out.println("Subject "+(i+1));
			sub[i]=Integer.parseInt(s.nextLine());
			total+=sub[i];
		}
		total/=5;

		System.out.println(total +" "+ roll +" "+name );
	}
}


