import java.util.*;
public class Twelve {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = sc.next();
        System.out.print("Please insert your age : ");
        int age = sc.nextInt();
        System.out.print("Please insert number of working day : ");
        int numDay1 = sc.nextInt();
        System.out.print("Please insert number of absent day : ");
        int numDay2 = sc.nextInt();
        System.out.print("Please insert your body weight : ");
        double weight = sc.nextDouble();

        //Hi
        System.out.println("Hi, " + name);

        //Salary
        double salary = 0;
        int int_salary;
        if ((21 <= age) && (age <= 30)){
            salary = (numDay1 * 300) - (numDay2 * 50);
        }
        else if ((31 <= age) && (age <= 40)){
            salary = (numDay1 * 500) - (numDay2 * 50);
        }
        else if ((41 <= age) && (age <= 50)){
            salary = (numDay1 * 1000) - (numDay2 * 25);
        }
        else if ((51 <= age) && (age <= 60)){
            salary = (numDay1 * 3000);
        }
        int_salary = (int)salary;
        System.out.println("Your salary is " + int_salary + " Baht");

        //Bonus
        if ((10 <= weight) && (weight <= 60)){
            salary += 5000;
        }
        else if ((61 <= weight) && (weight <= 90)){
            salary += 5000 - ((weight - 60) * 10);
        }
        int_salary = (int)salary;
        System.out.println("Your salary and bonus is " + int_salary + " Baht");
    }
}
