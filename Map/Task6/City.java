import java.util.*;
public class City
{
public static void main(String[] agrs)
{
 List<String> Maharastra=new ArrayList<>();
       Maharastra.add("pune");
       Maharastra.add("Mumbai");
   List<String> Madhypradesh=new ArrayList<>();
       Madhypradesh.add("Bhopal");
       Madhypradesh.add("Indoor");

Set<List<String>> india=new HashSet<>();
       india.add(Maharastra);
       india.add(Madhypradesh);
 System.out.println(india);
List<String> state1=new ArrayList<>();
       state1.add("city1");
       state1.add("city2");
   List<String> state2=new ArrayList<>();
       state2.add("city3");
       state2.add("city4");

Set<List<String>> japan=new HashSet<>();
       japan.add(state1);
       japan.add(state2);
 System.out.println(japan);
 Map<String,Set<List<String>>> world=new HashMap<>();
       world.put("INDIA",india);
       world.put("JAPAN",japan);
 System.out.println(world);

 Set<String> keys =world.keySet();

  for(String key:keys)
 {
   System.out.println(key);
   Set<List<String>> value=world.get(key);
   System.out.println(value);
   for(List<String> list: value) 
{     
     System.out.println(list); 
     for(String city:list)
    {
       System.out.println(city);
       }                   
     }
  }
}
}