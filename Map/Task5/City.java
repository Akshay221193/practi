import java.util.*;
public class City
{
public static void main(String[] agrs)
{
 Set<String>  mh=new HashSet<>();
       mh.add("pune");
       mh.add("Mumbai");
   Set<String> mp=new HashSet<>();
       mp.add("Bhopal");
       mp.add("Indoor");

Map<Integer, Set<String>> india=new HashMap<>();
       india.put(1,mh);
       india.put(2,mp);
 System.out.println(india);

 Set<Integer> s=india.keySet();

Iterator<Integer> itr=s.iterator();
 while(itr.hasNext())
{
   int key=itr.next();
   System.out.println(key);
    Set<String> value=india.get(key);
  Iterator<String> itr1=value.iterator();
  while(itr1.hasNext())
 {
  String a=itr1.next();
   System.out.println(a);
}
   
}
 india.forEach((k,v)->{System.out.println(k+""+v);
  v.forEach((ss)->System.out.println(ss));});
 
}
}