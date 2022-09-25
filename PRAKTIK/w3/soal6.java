package soal_6_BigNumber;
import java.util.*;
import java.math.BigInteger;

public class soal6 {
    public static void main (String[] args) {
        Scanner x = new Scanner(System.in);
        String a =  x.nextLine();
        String b =  x.nextLine();
        BigInteger n1 = new BigInteger(a);
        BigInteger n2 = new BigInteger(b);
        System.out.println(n1.add(n2));
        System.out.println(n1.multiply(n2));
    }
}
