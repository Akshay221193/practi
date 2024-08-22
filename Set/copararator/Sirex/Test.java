import java.util.*;
public class Test
{
 public static void main(String[] args)
{
 Set<Student> s=null;

Scanner sc=new Scanner(System.in);
 System.out.println("1 for Rollno Sorting "+"\n"+
                      "2 for Name Sorting");
 int ch=sc.nextInt();
 if(ch==1)
{
 Comparator<Student>cmr=(o1,o2)->o1.getRollno()-o2.getRollno();

   s=new TreeSet<Student>(cmr);
}
if(ch==2)
{
 Comparator<Student>cmnm=(o1,o2)->o1.getName().compareTo(o2.getName());

   s=new TreeSet<Student>(cmnm);
}
 Student stu=new Student();
          stu.setRollno(2);
          stu.setName("ccc");
         
 Student stu1=new Student();
          stu1.setRollno(3);
          stu1.setName("aaa");

   Student stu2=new Student();
          stu2.setRollno(1);
          stu2.setName("bbb");

     s.add(stu);
      s.add(stu1);
       s.add(stu2);

  for(Student a:s)
{
      System.out.println(a.getRollno());
      System.out.println(a.getName());
}

}
}