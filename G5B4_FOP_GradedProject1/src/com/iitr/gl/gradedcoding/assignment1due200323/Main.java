package com.iitr.gl.gradedcoding.assignment1due200323;

public class Main {

	public static void main(String[] args) {
		
		SuperDepartment adminDept = new AdminDepartment();
		
		SuperDepartment hrDept = new HrDepartment();
		HrDepartment hrDeptt = new HrDepartment();
		
		SuperDepartment techDept = new TechDepartment();
		TechDepartment techDeptt = new TechDepartment();
		
		
    System.out.println("Welcome to " + adminDept.departmentName() );
    System.out.println(adminDept.getTodaysWork() );
    System.out.println(adminDept.getWorkDeadline());
    System.out.println(adminDept.isTodayAHoliday());
    
    System.out.println();
    
    System.out.println("Welcome to " + hrDept.departmentName() );
    System.out.println(hrDeptt.doActivity());
    System.out.println(hrDept.getTodaysWork() );
    System.out.println(hrDept.getWorkDeadline());
    System.out.println(hrDept.isTodayAHoliday());
    
    System.out.println();
    
    System.out.println("Welcome to " + techDept.departmentName() );
    System.out.println(techDept.getTodaysWork() );
    System.out.println(techDept.getWorkDeadline());
    System.out.println(techDept.getTechStackInformation());
    System.out.println(techDept.isTodayAHoliday());
    

	}

}
