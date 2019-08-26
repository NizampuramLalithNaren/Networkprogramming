import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
import java.util.Scanner;

public class StringPatternReplacement
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = null;
        if(sc.hasNextLine())
        {
            s = sc.nextLine();
        }
        System.out.println("Enter pattrn");
         String p = null;
        if(sc.hasNextLine())
        {
            p = sc.nextLine();
        }
        String r = null;
        System.out.println("Enter replacestring");
        if(sc.hasNextLine())
        {
            r = sc.nextLine();
        }
        Pattern pattern = Pattern.compile(p);
        Matcher m = pattern.matcher(s);
        String output = m.replaceAll(r);
        System.out.println(output);
    }
}
