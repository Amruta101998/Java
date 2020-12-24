package com.subject;

import java.util.Scanner;

public class Marks {

    int eng,chem,computer,physics,maths;
    public float total,percentage;
    Scanner sc=new Scanner(System.in);

    public void getDetails() {

        System.out.println("Enter the 5 Subjects Marks:");
        eng = sc.nextInt();
        chem = sc.nextInt();
        computer = sc.nextInt();
        physics = sc.nextInt();
        maths = sc.nextInt();

        total = eng + chem + computer + physics + maths;
        percentage = (total / 500) * 100;

        if (percentage >= 80) {
            System.out.println("Grade A");
        } else if (percentage >= 60 && percentage < 80) {
            System.out.println("Grade B");
        } else if (percentage >= 40 && percentage < 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Failed");
        }

        System.out.println("The student grade is:"+percentage);
    }

    public void displayDetails() {

        System.out.println("total marks=" + total);
        System.out.println("Percentage=" + percentage);
    }
}
