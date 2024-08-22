import java.util.*;
public class MapDemo
{
public  final  static void main(String... args)
{
  Map<Character,String> m=new HashMap<>();
          m.put('a',"abc");
          m.put('b',"pqr");
          m.put('c',"xyz");
          

   Set<Character> s=m.keySet();
    
 Iterator<Character> itr=s.iterator();

    while(itr.hasNext())
  {
    char key=itr.next();
    String value= m.get(key);
    System.out.println("key :"+key+" value : "+value);

}
 for( Character key :s)
   {
     String value= m.get(key);
    System.out.println("key :"+key+" value : "+value);
   }
}
}