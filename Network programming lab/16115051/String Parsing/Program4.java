import java.util.Scanner;
public class Program4
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String name;
		int roll;
		double cgpa;
		System.out.println("Enter Your name ");
		name = s.nextLine();

		System.out.println("Enter your roll number");
		roll = Integer.parseInt(s.nextLine());

		System.out.println("Enter your cgpa");
		cgpa = Double.parseDouble(s.nextLine());

		System.out.println(cgpa +" "+ roll +" "+name );
	}
}