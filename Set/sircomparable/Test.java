import java.util.*;  
public  class Test
{
 public static void main(String[] args)
{
Set<Student> s=new TreeSet<>();
 Student stu=new Student();
    stu.setRollno(2);
    stu.setName("aaa");
 
Student stu1=new Student();
    stu1.setRollno(1);
    stu1.setName("ccc");

Student stu2=new Student();
    stu2.setRollno(3);
    stu2.setName("bbb");

    s.add(stu);
    s.add(stu1);
    s.add(stu2);
  for( Student x: s)
{
 System.out.println(x.getRollno());
 System.out.println(x.getName());
}
}
}