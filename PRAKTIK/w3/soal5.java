package PRAKTIK.w3;
import java.util.*;

public class soal5 {
    public static void main (String[] args){
        Scanner a = new Scanner(System.in);
        String mobil1 = a.next();
        String mobil2 = a.next();
        String mobil3 = a.next();
        String mobil4 = a.next();
        a.close();
        
        String mobil5 = (mobil1 + "" + mobil2 + "" + mobil3 + "" + mobil4);
        double num = ((Double.parseDouble(mobil5) - 999999999) % 5);
        
        if(num == 0) {
            System.out.println("Jalan");
        } else {
            System.out.println("Berhenti");
        }
    }
}
