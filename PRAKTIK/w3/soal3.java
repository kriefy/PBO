package PRAKTIK.w3;
import java.util.*;

public class soal3 {
    public static void main(String[] args) {
        Scanner count = new Scanner(System.in);
            int nilai = 0;
            int n1 = count.nextInt();
            String a = count.next();
            int n2 = count.nextInt();
            switch(a){
                case "+":
                    nilai = n1 + n2;
                    break;
                    
                case "-":
                    nilai = n1 - n2;
                    break;
                    
                case "*":
                    nilai = n1 * n2;
                    break;
                    
                case "/":
                    nilai = n1 / n2;
                    break;
                            
                default:
                    System.out.println("Tidak ada operasi aritmatika tersebut");
                    break;
            }
            System.out.printf("%d %s %d\n",n1,a,n2);
            System.out.println(nilai);
    }
}
