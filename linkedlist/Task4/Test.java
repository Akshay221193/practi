import java.util.Scanner;
import java.util.*;
public class Test
{
public static void main(String[] args)
{
List <Student>al=new  ArrayList<>();
Scanner sc=new  Scanner(System.in);
for(int i=1;i<=3;i++)
{
 Student si= new Student();
 System.out.println("Enter Student Details "+i);
 
 System.out.println("Enter Student Rollno :- ");
  si.setRollno(sc.nextInt());
 
 System.out.println("Enter Student name :- ");
  si.setName(sc.next());
 
System.out.println("Enter Student Address :- ");
  si.setAddr(sc.next());

System.out.println("Enter Student Mobile no :- ");
  si.setMobileno(sc.nextLong());
  
 System.out.println("Enter Student College fees :- ");
  si.setClgfees(sc.nextDouble());

System.out.println("Enter Student Marks :- ");
  si.setMarks(sc.nextFloat());

System.out.println("Enter Student College name :- ");
  si.setClgname(sc.next());




           
       al.add(si);
     
    }    
    System.out.println(al);
 Iterator<Student> itr=al.iterator();

 while(itr.hasNext())
{
  Student a=itr.next();
  System.out.println(a.getRollno());
  System.out.println(a.getName());
  System.out.println(a.getAddr());
  System.out.println(a.getMobileno());
  System.out.println(a.getClgfees());
  System.out.println(a.getMarks());
  System.out.println(a.getClgname());

}
}

}