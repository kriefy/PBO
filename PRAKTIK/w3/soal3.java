package PRAKTIK.w3;
import java.util.*;

public class soal3 {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
            int jmlh = 0;
            int x0=s.nextInt();
            String a = s.next();
            int x1 = s.nextInt();
            switch(a){
                case "+":
                    jmlh = x0 + x1;
                    break;
                
                case "-":
                    jmlh = x0 - x1;
                    break;
                    
                case "/":
                    jmlh = x0 / x1;
                    break;
                
                case "*":
                    jmlh = x0 * x1;
                    break;
                
                default:
                    System.out.println("Tidak ada operasi aritmatika tersebut");
                    break;
            } 
//        System.out.printf("%d %s %d\n",x0,a,x1);
            System.out.println(jmlh);
        }
	}
}
