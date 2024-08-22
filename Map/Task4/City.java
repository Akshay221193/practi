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

Map< String,List<String>> india=new HashMap<>();
       india.put("Maharastra",mh);
       india.put("Madhypradesh",mp);
 System.out.println(india);
List<String> state1=new ArrayList<>();
       state1.add("city1");
       state1.add("city2");
   List<String> state2=new ArrayList<>();
       state2.add("city3");
       state2.add("city4");

Map<String,List<String>> japan=new HashMap<>();
       japan.put("State1",state1);
       japan.put("State2",state2);
 System.out.println(japan);
 Map<String,Map<String,List<String>>> world=new HashMap<>();
       world.put("INDIA",india);
       world.put("JAPAN",japan);
 System.out.println(world);

 Set<String> keys =world.keySet();

  for(String key:keys)
 {
   System.out.println(key);
   Map<String,List<String>> value=world.get(key);
  // System.out.println(value);
     Set<String> st=value.keySet();
	//System.out.println(st);
     for(String s:st){
	System.out.println(s);
	List<String> li=value.get(s);
	System.out.println(li);
		for(String s1:li){
	System.out.println(s1);
	}
	}

  }
}
}