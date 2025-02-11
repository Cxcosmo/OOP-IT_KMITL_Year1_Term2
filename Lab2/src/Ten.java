import java.util.*;
public class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter money : ");
        double money = sc.nextDouble(), tex ;
        if (money > 50000.00){tex = money * 0.10 ;}
        else {tex = money * 0.05 ;}
        System.out.println("Your Tex : " + tex);
    }
}
