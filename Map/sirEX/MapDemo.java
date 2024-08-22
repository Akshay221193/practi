import java.util.*;
public class MapDemo
{
public  final  static void main(String... args)
{
  Map<Integer,String> m=new HashMap<>();
          m.put(1,"aaa");
          m.put(2,"bbb");
          m.put(3,"ccc");
          m.put(4,"ddd");
          m.put(5,"eee");

   Set<Integer> s=m.keySet();
    
 Iterator<Integer> itr=s.iterator();

    while(itr.hasNext())
  {
    int key=itr.next();
    String value= m.get(key);
    System.out.println("key :"+key+" value : "+value);

}
 for( Integer key :s)
   {
     String value= m.get(key);
    System.out.println("key :"+key+" value : "+value);
   }
}
}