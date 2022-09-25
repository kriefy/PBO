package PRAKTIK.w3;
import java.util.*;

public class soal2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("======================");
        for (int i = 0; i < 3; i++) {
            String a1 = a.next();
            int a2 = a.nextInt();
            System.out.printf("%-14s%03d\n", a1, a2);
        }
        System.out.println("======================");
    }
}
