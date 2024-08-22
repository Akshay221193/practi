package com.cjc.ims.app.serviceimpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cjc.ims.app.model.Batch;
import com.cjc.ims.app.model.Course;
import com.cjc.ims.app.model.Faculty;
import com.cjc.ims.app.model.Student;
import com.cjc.ims.app.servicei.*;

public class Karvenagar implements Cjc{
	
	Scanner sc=new Scanner(System.in);
	
	List<Course> clist=new ArrayList<>();
	List<Faculty> flist=new ArrayList<>();
	List<Batch> blist=new ArrayList<>();
	List<Student> slist=new ArrayList<>();

	public void addCourse()
	{
		 Course  c=new Course();
		System.out.println("enter course id:-");
		c.setCid(sc.nextInt());
		System.out.println("enter course name:-");
		c.setCname(sc.next());
		clist.add(c);
	}
	
	public void viewCourse()
	{
	
		for(Course cr:clist)
		{
			System.out.println(cr.getCid());
			System.out.println(cr.getCname());
		}
	}
	
	public void addFaculty()
	{
 		Faculty f=new Faculty();
		
		System.out.println("enter faculty id:-");
                 f.setFid(sc.nextInt());
		
		System.out.println("enter faculty name:-");
		f.setFname(sc.next());

		Course c = clist.get(0);
		if(f.getFid()==c.getCid())
		{
                f.setCourse(c);
		}else{
			System.out.println("No Able to set course because Fid Cid are not same");
		}
		flist.add(f);
	}
	
	public void viewFaculty()
	{
		
		for(Faculty ft:flist)
		{
			System.out.println(ft.getFid());
			System.out.println(ft.getFname());
			
			System.out.println(ft.getCourse().getCid());
			System.out.println(ft.getCourse().getCname());
		}
	}
	
	public void addBatch()
	{
 		Batch b=new Batch();
		
		System.out.println("enter Batch id:-");
                 b.setBid(sc.nextInt());
		
                    
		
		System.out.println("enter batch name:-");
		b.setBname(sc.next());
                Faculty f = flist.get(0);
		if(b.getBid()==f.getFid())
		{
                b.setFaculty(f);
		}else{
			System.out.println("No Able to set course because Bid Fid are not same");
		}
		blist.add(b);
	}
	
	public void viewBatch()
	{
		
		for(Batch bt:blist)
		{
			System.out.println(bt.getBid());
			System.out.println(bt.getBname());
			System.out.println(bt.getFaculty().getFid());
			System.out.println(bt.getFaculty().getFname());
			System.out.println(bt.getFaculty().getCourse().getCid());
			System.out.println(bt.getFaculty().getCourse().getCname());  
		}
	}
	
	public void addStudent()
	{
		 Student s=new Student();
		
		
		System.out.println("enter Student id:-");
                 s.setSid(sc.nextInt());
		
                    
		System.out.println("enter student name:-");
		s.setSname(sc.next());

               Batch b = blist.get(0);
		if(s.getSid()==b.getBid())
		{
                s.setBatch(b);
		}else{
			System.out.println("No Able to set course because  Fid sid are not same");
		}
		slist.add(s);
	}
	
	public void viewStudent()
	{
		
		for(Student st:slist)
		{
			System.out.println(st.getSid());
			System.out.println(st.getSname());
			System.out.println(st.getBatch().getBid());
			System.out.println(st.getBatch().getBname());
			System.out.println(st.getBatch().getFaculty().getFid());
			System.out.println(st.getBatch().getFaculty().getFname());
			System.out.println(st.getBatch().getFaculty().getCourse().getCid());
			System.out.println(st.getBatch().getFaculty().getCourse().getCname());
		}
	}

}