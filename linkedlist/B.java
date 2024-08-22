
import java.util.*;
public class B
{
public static void main(String[] args)
{
 List<String> al=new  ArrayList<>();

            al.add("AAA");
            al.add("BBB");
            al.add("CCC");
            al.add("DDD");
         String x=al.get(0);
    System.out.println(x);
    String y=al.get(2);
    System.out.println(y);
    System.out.println(al);
 Iterator<String> itr=al.iterator();

 while(itr.hasNext())
{
  String a=itr.next();
  System.out.println(a);
}
} 

}