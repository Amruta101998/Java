package com.Date;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int Date;
	int month;
	int year;

        System.out.println("enter birthdate :");
        Date=sc.nextInt();
        System.out.println("enter birthmonth :");
        month=sc.nextInt();
        System.out.println("enter birthyear :");
        year=sc.nextInt();

        System.out.println("enter currdate :");
        Date=sc.nextInt();
        System.out.println("enter currmonth :");
        month=sc.nextInt();
        System.out.println("enter curryear :");
        year=sc.nextInt();


            // function call to print age
            Age(current_date, current_month, current_year,
                    birth_date, birth_month, birth_year);
        }
    }
