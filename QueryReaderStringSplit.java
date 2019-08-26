import java.util.*; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.*; 
public class QueryReaderStringSplit
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
          String []arr = s1.split("\\?");
          
          String []arr2 = arr[1].split("\\&");
          System.out.println(s1);
            for( String s : arr2)
            {
                System.out.println(s);
            }

          
      }
      System.out.println("Total queries" + count);


  } 
} 