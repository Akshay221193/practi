package com.cjc.ims.app.client;
import com.cjc.ims.app.serviceimpl.*;
import com.cjc.ims.app.servicei.*;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cjc cjc=new Karvenagar();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.add course");
		System.out.println("2.view course");
		System.out.println("3.add faculty");
		System.out.println("4.view Faculty");
		System.out.println("5.add Batch");
		System.out.println("6.view Batch");
		System.out.println("7.add Student");
		System.out.println("8.view Student");
		System.out.println("9.Exit");
		while(true)
		{
			System.out.println("enter your choice=");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				cjc.addCourse();
			break;
			case 2:
				cjc.viewCourse();
			break;
			case 3:
				cjc.addFaculty();
			break;
			case 4:
				cjc.viewFaculty();
			break;
			case 5:
				cjc.addBatch();
			break;
			case 6:
				cjc.viewBatch();
			break;
			case 7:
				cjc.addStudent();
			break;
			case 8:
				cjc.viewStudent();
			break;
                        case 9:System.exit(0);
			default:
				System.out.println("Please enter valid choice!");
				
				
			}
		}
	}
}