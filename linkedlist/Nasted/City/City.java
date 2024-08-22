import java.util.*;
public class City
{
public static void main(String[] agrs)
{
 List<String> mh=new ArrayList<>();
       mh.add("pune");
       mh.add("Mumbai");
   List<String> mp=new ArrayList<>();
       mp.add("Bhopal");
       mp.add("Indoor");

List<List<String>> india=new ArrayList<>();
       india.add(mh);
       india.add(mp);
 System.out.println(india);
Iterator<List<String>>itr=india.iterator();
  while(itr.hasNext())
{
 List<String> l=itr.next();
Iterator<String>itr1=l.iterator();
 System.out.println(l);
while(itr1.hasNext())
{
  String city=itr1.next();
 System.out.println(city);
}
}
}
}