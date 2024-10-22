import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("////////////////////////////1th ex///////////////////");
        System.out.println("please enter how you r? 1.Admin, 2.superuser, 3.use");
        String check=input.nextLine();
        if(check.equalsIgnoreCase("Admin")){
            System.out.println("welcome admin");}
        else if (check.equalsIgnoreCase("superuser")) {
            System.out.println("welcome superuser");
        }
        else  System.out.println("welcome user");
        System.out.println("///////////////////////////2th ex///////////////////");
        System.out.println("please enter three number");

        System.out.println("please Input the 1st number: 25");
        int num1=input.nextInt();
        System.out.println("please Input the 2nd number: 78");
        int num2=input.nextInt();
        System.out.println("please  Input the 3rd number: 87");
        int num3=input.nextInt();

       if(num1>num2&&num1>num3){
           System.out.println("the greatest is the first number");
       } else if (num2>num1&&num2>num3) {
           System.out.println("the greatest is the secund number");

       } else  System.out.println("the greatest is the therd number");
        System.out.println("////////////////////////////3th ex///////////////////");
//        Write a Java program that generates an integer between 1 and 7
//        and displays the name of the weekday.
        System.out.println("well the program will chose here any number of days between 1-7");
        Random rn=new Random();
        int answer =rn.nextInt(7);
        switch (answer){
            case 1:
                System.out.println("saterday");
            break;
            case 2:
                System.out.println("sunday");
            case 3:
                System.out.println("monday");
              break;
            case 4:
                System.out.println("tuesday");
                break;
            case 5:
                System.out.println("wednesday");
                break;
            case 6:
                System.out.println("thursday");
                break;
            case 7:
                System.out.println("friday");
                break;
            default:
                System.out.println("the number is nt corect");
        }
        System.out.println(" ////////////////////////////4th ex///////////////////");
//        Write a program that takes a numeric score as input and prints
//        the corresponding letter grade using the following grading scale:
        System.out.println("please enter your score");
        int score=input.nextInt();
        if(score>=90&&score==100){
            System.out.println("A");
        } else if(score<=89&&score>=80){
            System.out.println("B");}
        else if (score<=79&&score>=70){
            System.out.println("C"); 
        } else if (score<=69&&score>=60) {
            System.out.println("D");
        } else if (score<=59&&score>0) {
            System.out.println("F");
        }else  System.out.println("put the score corctly");

        System.out.println("////////////////////////////5th ex///////////////////");
//        Write a Java program that takes a person's age as input and
//        categorizes them into one of three age categories: "Child,"
//        "Teenager," or "Adult" using an if statement.
        System.out.println("please enter your age");
        int age=input.nextInt();
        if(age<13){
            System.out.println("you are child");
        } else if (age<=19&&age==13) {System.out.println("you are Teenager");}
        else if (age>=20) {System.out.println("you are Adult");}

        else System.out.println("pleas enter just numbers");


    }
}