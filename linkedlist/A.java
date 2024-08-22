import java.util.*;
public class A
{
public static void main(String[] args)
{
 List<Integer> al=new  ArrayList<>();

            al.add(10);
            al.add(20);
            al.add(30);
            al.add(40);
         int x=al.get(0);
    System.out.println(x);
    int y=al.get(2);
    System.out.println(y);
    System.out.println(al);
 Iterator<Integer> itr=al.iterator();

 while(itr.hasNext())
{
  int a=itr.next();
  System.out.println(a);
}
} 

}