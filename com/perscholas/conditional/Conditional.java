package com.perscholas.conditional;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        //1.if less than 10
        System.out.println("1. Less than");
        int x =7;
        if(x<10){
            System.out.println(x+" is Less than 10");
        }
        x=15;
        if(x<10){
            System.out.println(x+" is Less than 10");
        }
        //2.less and greater than 10
        System.out.println("\n2. Less than Greater than");
        x = 7;
        if(x<10)
        {
            System.out.println(x+" is Less than 10");
        }
        else{
            System.out.println(x+" is Greater than 10");
        }
        x = 15;
        if(x<10)
        {
            System.out.println(x+" is Less than 10");
        }
        else{
            System.out.println(x+" is Greater than 10");
        }
        //3. if else if
        System.out.println("\n3. if-else-if");
        x =15;
        if(x<10)
        {
            System.out.println(x+" is Less than 10");
        }
        else if(x>=10 && x<20){
            System.out.println(x+" is Greater than 10 but Less than 10");
        }
        else{
            System.out.println(x+" is Greater than or equal to 20");
        }
        x = 50;
        if(x<10)
        {
            System.out.println(x+" is Less than 10");
        }
        else if(x>=10 && x<20){
            System.out.println(x+" is Greater than 10 but Less than 10");
        }
        else{
            System.out.println(x+" is Greater than or equal to 20");
        }
        //4.out of range
        System.out.println("\n4. Out of Range");
        x =15;
        if(x<10 || x>20)
        {
            System.out.println(x+" is Out of Range");
        }
        else if(x>=10&& x<=20) {
            System.out.println(x + " In Range");
        }
        x = 5;
        if(x<10 || x>20)
        {
            System.out.println(x+" is Out of Range");
        }
        else if(x>=10 && x<=20) {
            System.out.println(x + " In Range");
        }
        //5.grades
        System.out.println("\n5. Grades");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the score in integer:");
        char grade;
        int mark = in.nextInt();
        if(mark>100 || mark <0){
            System.out.println("Out of Range");
        }
        else if(mark<=100 && mark >=90){
            grade = 'A';
            System.out.println("Grade for score "+mark+" is "+grade);
        }
        else if(mark<=89 && mark >=80){
            grade = 'B';
            System.out.println("Grade for score "+mark+" is "+grade);
        }
        else if(mark<=79 && mark >=70){
            grade = 'C';
            System.out.println("Grade for score "+mark+" is "+grade);
        }
        else if(mark<=69 && mark >=60){
            grade = 'D';
            System.out.println("Grade for score "+mark+" is "+grade);
        }
        else {
            grade = 'F';
            System.out.println("Grade for score "+mark+" is "+grade);
        }
        //6.switch
        System.out.println("\n6. Switch");
        System.out.println("Enter a number between 1 and 7:");
        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
                break;
        }
        //7.income tax
        System.out.println("\n7. Income Tax");
        System.out.println("Choose your filing status:\n1.Single\n2.Married Filing Jointly\n2.Married Filing Separately\n4.Head of HouseHold");
        int num = in.nextInt();
        while(num<1 ||num>3){
            System.out.println("Enter 1 2 3 or 4\nChoose your filing status:\n1.Single\n2.Married Filing Jointly\n3.Head of HouseHold");
            num = in.nextInt();
        }
        System.out.println("Enter your income $ :");
        double salary = in.nextDouble();
        double taxRate, tax;
        if( (num ==1 || num ==3)&&((salary>=0)&&(salary<=8350)) ||
            (num ==2)&&((salary>=0)&&(salary<=16700)) ||
            (num ==4)&&((salary>=0)&&(salary<=11950)) ){
            taxRate = 0.10;
            tax = taxRate * salary;
            System.out.println("Tax rate amount for the salary "+salary+" is "+taxRate);
            System.out.println("Total income tax to be paid:\t"+tax);
        }
        else if( (num ==1 || num ==3)&&((salary>=8351)&&(salary<=33950)) ||
                (num ==2)&&((salary>=16701)&&(salary<=67900)) ||
                (num ==4)&&((salary>=11951)&&(salary<=45500)) ){
            taxRate = 0.15;
            tax = taxRate * salary;
            System.out.println("Tax rate amount for the salary "+salary+" is "+taxRate);
            System.out.println("Total income tax to be paid:\t"+tax);
        }
        else if( (num ==1)&&((salary>=33951)&&(salary<=82250)) ||
                (num ==2)&&((salary>=67901)&&(salary<=137050)) ||
                (num ==3)&&((salary>=33951)&&(salary<=68525)) ||
                (num ==4)&&((salary>=45501)&&(salary<=117450)) ){
            taxRate = 0.25;
            tax = taxRate * salary;
            System.out.println("Tax rate amount for the salary "+salary+" is "+taxRate);
            System.out.println("Total income tax to be paid:\t"+tax);
        }
        else if( (num ==1)&&((salary>=82251)&&(salary<=171550)) ||
                (num ==2)&&((salary>=137051)&&(salary<=208850)) ||
                (num ==3)&&((salary>=68526)&&(salary<=104425)) ||
                (num ==4)&&((salary>=117451)&&(salary<=190200)) ){
            taxRate = 0.28;
            tax = taxRate * salary;
            System.out.println("Tax rate amount for the salary "+salary+" is "+taxRate);
            System.out.println("Total income tax to be paid:\t"+tax);
        }
        else if( (num ==1)&&((salary>=171551)&&(salary<=372950)) ||
                (num ==2)&&((salary>=208851)&&(salary<=372950)) ||
                (num ==3)&&((salary>=104426)&&(salary<=186475)) ||
                (num ==4)&&((salary>=190201)&&(salary<=372950)) ){
            taxRate = 0.33;
            tax = taxRate * salary;
            System.out.println("Tax rate amount for the salary "+salary+" is "+taxRate);
            System.out.println("Total income tax to be paid:\t"+tax);
        }
        else if( (num ==1)&&((salary>=372951)) ||
                (num ==2)&&((salary>=372951)) ||
                (num ==3)&&((salary>=186476)) ||
                (num ==4)&&((salary>=372951)) ){
            taxRate = 0.35;
            tax = taxRate * salary;
            System.out.println("Tax rate amount for the salary "+salary+" is "+taxRate);
            System.out.println("Total income tax to be paid:\t"+tax);
        }
    }
}
