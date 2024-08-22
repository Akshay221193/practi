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
List<String> state1=new ArrayList<>();
       state1.add("city1");
       state1.add("city2");
   List<String> state2=new ArrayList<>();
       state2.add("city3");
       state2.add("city4");

List<List<String>> japan=new ArrayList<>();
       japan.add(state1);
       japan.add(state2);
 System.out.println(japan);
 List<List<List<String>>> world=new ArrayList<>();
       world.add(india);
       world.add(japan);
 System.out.println(world);

Iterator<List<List<String>>>it=world.iterator();
  while(it.hasNext())
{
   List<List<String>> wl=it.next();
Iterator<List<String>>itr=wl.iterator();
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
}