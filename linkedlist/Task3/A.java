import java.util.*;
public class A
{
public static void main(String[] args)
{
 List <Object>al=new  ArrayList();

            Character c='c';
            Boolean b= true;
            Integer i=12;
            Double d=12.0d;
            Short s=34;
            Float f=55.0f;
            Byte by=8;
            Long l=1222l;
           String st= "Akshay";
           Object o = new Object();
           al.add(c);
           al.add(s);
          al.add(by);
           al.add(f);
          al.add(d);
          al.add(l);
          al.add(b);
          al.add(i);
          al.add(st);
          al.add(0);
        
    System.out.println(al);
 Iterator<Object> itr=al.iterator();

 while(itr.hasNext())
{
  Object a=itr.next();
  System.out.println(a);
}
} 

}