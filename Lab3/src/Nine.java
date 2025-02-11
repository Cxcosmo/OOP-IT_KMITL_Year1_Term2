import java.util.*;
public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("กรุณาระบุความสูงคึก : ");
        int height = sc.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("#");
                if (j < 5) {
                    System.out.print("-");
                }
            }
            if (i < height) {
                System.out.println();
            }
        }
    }
}
