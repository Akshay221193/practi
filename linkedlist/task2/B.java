
import java.util.*;
public class B
{
public static void main(String[] args)
{
 List<String> al=new  ArrayList<>();

            al.add("aaa");
            al.add("bbb");
            al.add("ccc");
            al.add("ddd");
             al.add("eee");
              al.add("fff");
        
    System.out.println(al);
 Iterator<String> itr=al.iterator();

 while(itr.hasNext())
{
  String a=itr.next();
  System.out.println(a);
}
} 

}