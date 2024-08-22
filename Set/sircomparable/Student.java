public class Student implements Comparable<Student>
{
 private int rollno;
 private String name;

public void setRollno(int rollno)
{
 this.rollno=rollno;
}

 public int getRollno()
{
 return rollno;
}

public void setName(String name)
{
 this.name=name;
}

 public String getName()
{
 return name;
}
 
@Override
public int compareTo(Student st)
{
 // return this.rollno-st.rollno;
return this.name.compareTo(st.name);
}
}