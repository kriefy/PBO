package PRAKTIK.w3;
import java.util.*;
import java.math.*;

public class soal6 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String numOne = sc.nextLine();
            String numTwo = sc.nextLine();
            BigInteger bigNumOne = new BigInteger(numOne);
            BigInteger bigNumTwo = new BigInteger(numTwo);
            System.out.println(bigNumOne.add(bigNumTwo));
            System.out.println(bigNumOne.multiply(bigNumTwo));
        }
    }
}