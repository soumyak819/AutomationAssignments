package com.creatio.crm.language.basics;

public class Assignment3_empgroup {

	public static void main(String[] args) 
		
	{
		
		// two arrays created to store employee names and employee ids
		String[] names = new String[3];
		int[] ids = new int[3];
		
		Employees obj = new Employees();
		names[0]=obj.emp_name1;
		names[1]=obj.emp_name2;
		names[2]=obj.emp_name3;
		
		ids[0]=obj.emp_id1;
		ids[1]=obj.emp_id2;
		ids[2]=obj.emp_id3;
		
		
		//Printing employee name with ID
		System.out.println("Employee name:" + names[0] + "," + "Employee ID:" + ids[0]);
		System.out.println("Employee name:" + names[1] + "," + "Employee ID:" + ids[1]);
		System.out.println("Employee name:" + names[2] + "," + "Employee ID:" + ids[2]);
	}

}
