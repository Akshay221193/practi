import java.util.*;
public class Test
{
 public static void main(String[] args)
{
 Set<Company> s=null;

Scanner sc=new Scanner(System.in);
 System.out.println("1 for Id Sorting "+"\n"+
                      "2 for Cname Sorting"+"\n"+
                          "3 for Mobile Sorting");
 int ch=sc.nextInt();
 if(ch==1)
{
 Comparator<Company>cmr=(o1,o2)->o1.getId()-o2.getId();

   s=new TreeSet<Company>(cmr);
}
if(ch==2)
{
 Comparator<Company>cmnm=(o1,o2)->o1.getCname().compareTo(o2.getCname());

   s=new TreeSet<Company>(cmnm);
}
  if(ch==3)
{
 Comparator<Company>cmmo=(o1,o2)->(int)o1.getCmobno()-(int)o2.getCmobno();

   s=new TreeSet<Company>(cmmo);
}
 Company com=new Company();
          com.setId(2);
          com.setCname("ccc");
          com.setCmobno(12345);
         
 Company com1=new Company();
          com1.setId(3);
          com1.setCname("aaa");
           com1.setCmobno(23456);

   Company com2=new Company();
          com2.setId(1);
          com2.setCname("bbb");
          com2.setCmobno(34567);

     s.add(com);
      s.add(com1);
       s.add(com2);

  for(Company a:s)
{
      System.out.println(a.getId()+" "+a.getCname()+" "+a.getCmobno());
      
     }

}
}