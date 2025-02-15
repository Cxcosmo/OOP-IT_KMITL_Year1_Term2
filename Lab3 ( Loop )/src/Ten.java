import java.util.*;
public class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count_odd = 0, count_even = 0;
        while(true) {
            int num = sc.nextInt();
            if (num == -1) {
                System.out.print("Odd number = " + count_odd + " and Even number = " + count_even);
                break;
            }
            if (num % 2 == 0) {
                count_even += 1;
            }
            else {
                count_odd += 1;
            }
        }
    }
}
