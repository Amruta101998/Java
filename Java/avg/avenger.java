package com.avg;
import java.util.Scanner;

public class avenger {

    Scanner sc=new Scanner(System.in);
    public String name;
    public int age;
    public String power;
    public String weapon;
    public String planet;

    public void getDetails(){

        System.out.println("Enter the name");
        name=sc.nextLine();
        System.out.println("Enter the age");
        age=sc.nextInt();
        System.out.println("Enter the power");
        power=sc.next();
        System.out.println("Enter the weapon");
        weapon=sc.next();
        System.out.println("Enter the planet");
        planet=sc.next();


    }
    public void displayDetails(){

        System.out.println("The name is "+name+" and the age is "+age+" and the power is "+power+" and the weapon is "+weapon+" and the planet is "+planet);

    }
}
