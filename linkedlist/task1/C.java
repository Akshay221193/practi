import java.util.*;
public class C
{
public static void main(String[] args)
{
 List<Character> al=new  ArrayList<>();

            al.add('A');
            al.add('K');
            al.add('S');
            al.add('H');
            al.add('A');
            al.add('Y');
         
    System.out.println(al);
 Iterator<Character> itr=al.iterator();

 while(itr.hasNext())
{
  char a=itr.next();
  System.out.println(a);
}
} 

}