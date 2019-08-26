import java.util.*; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.*; 
public class QueryReader 
{ 
  public static List<String> readFileInList(String fileName) 
  { 
  
    List<String> lines = Collections.emptyList();
    
    try
    { 
      lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
    } 
  
    catch (IOException e) 
    { 
  
      // do something 
      e.printStackTrace(); 
    } 
    return lines; 
  } 
  public static void main(String[] args) 
  { 
    List<String> l = readFileInList("C:\\Users\\CSE\\Desktop\\java\\data.txt"); 
  
    Iterator<String> itr = l.iterator();
    int count = 0; 
    while (itr.hasNext()) 
      {
          String s1 = itr.next();
          count++;
          StringTokenizer st = new StringTokenizer(s1,"?");
          int i = 0;
          while(st.hasMoreTokens())
          {
              i++;
              String s = st.nextToken();
              if(i==2)
              {
                  System.out.println(s1);
                  StringTokenizer st2 = new StringTokenizer(s,"&");
                   while(st2.hasMoreTokens())
                    System.out.println(st2.nextToken());

                   System.out.println(" ");
                   break; 
              }  

          }
      }
      System.out.println("Total queries" + count);


  } 
} 