import java.util.Scanner;
public class Eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Input your money : ");
        double money = sc.nextDouble(), plus = 0;
        int total_money;
        System.out.print("Input your account type (Please type A B C or X in uppercase) : ");
        String account_type = sc.next();
        switch (account_type) {
            case "A" : case "C" : plus += money * 0.015; break;
            case "B" : plus += money * 0.02; break;
            case "X" : plus += money * 0.05; break;
            default: System.out.println("Enter (A, B, C, X) only");
        }
        total_money = (int)(money + plus);
        System.out.print("Your total money in one year = " + total_money);
    }
}
