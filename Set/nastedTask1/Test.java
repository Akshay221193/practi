import java.util.*;

public class Test
 
{

Set<Person>ps=new HashSet<>();
Set<Account>as=new HashSet<>();
Set<Bank>bs=new HashSet<>();

public void setDetails()

{

Person p=new Person();
p.setPname("Satyam");
p.setPaddr("Nagpur");
p.setPmobno(9421969953l);

Account a=new Account();
a.setAccno(60205050);
a.setAcctype("Saving Account");
a.setP(p);

Bank b=new Bank();
b.setBname("SBI");
b.setBranch("Mumbai");
b.setAddr("New Delhi");
b.setAcc(a);

ps.add(p);
as.add(a);
bs.add(b);

}

public void getDetails()

{

Iterator<Bank>itr=bs.iterator();

while(itr.hasNext())

{

Bank bk=itr.next();
System.out.println(bk.getBname());
System.out.println(bk.getBranch());
System.out.println(bk.getAddr());
System.out.println(bk.getAcc());

Iterator<Account>itr1=as.iterator();

while(itr1.hasNext())

{

Account ak=itr1.next();
System.out.println(ak.getAccno());
System.out.println(ak.getAcctype());
System.out.println(ak.getP());

Iterator<Person>itr2=ps.iterator();

while(itr2.hasNext())

{

Person pk=itr2.next();
System.out.println(pk.getPname());
System.out.println(pk.getPaddr());
System.out.println(pk.getPmobno());

}
}

}
}

public static void main(String args[])

{

Test t=new Test();
t.setDetails();
t.getDetails();


}


}