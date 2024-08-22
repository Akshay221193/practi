import java.util.*;
public class Test
{
public static void main(String[] args)
{
List<Integer> al=new ArrayList<>();
       al.add(10);
       al.add(20);
       al.add(5);
       al.add(1);
       al.add(12);
       al.add(3); 
       al.add(3);
       al.add(5);
    System.out.println(al);

Set<Integer> hs=new HashSet<>(al);
 System.out.println(hs);
 
Set<Integer> ls=new LinkedHashSet<>(al);
 System.out.println(ls);
 
Set<Integer> ts=new TreeSet<>(al);
 System.out.println(ts);

Collections.sort(al);
System.out.println(al);
     
}   
}