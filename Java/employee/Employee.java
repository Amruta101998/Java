package com.employee;

import java.util.Scanner;

public class Employee {

    Scanner sc=new Scanner(System.in);
    String name,designation;
    int age;
    double salary;

public void getDetails(){
    System.out.println("enter name age salary and designation");
    name=sc.next();
    age=sc.nextInt();
    salary=sc.nextDouble();
    designation=sc.next();
}

public void displayDetails(){
    System.out.println(name+" "+age+" "+salary+" "+designation);
}


}
