package PRAKTIK.w2.no5;
import java.util.*;

public class no5 {
    public static void main(String[] args){
        String A, B;
        int x, y;
        
        Scanner userinput = new Scanner(System.in);
        System.out.println(userinput.nextLine());
        
        A = userinput.nextLine();
        B = userinput.nextLine();
        
        x = A.length() + B.length();
        
        System.out.println(x);
        
        y = A.compareTo(B);
        if(y>0){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
        String firstWordCapA = A.substring(0,1).toUpperCase();
        String capA = firstWordCapA + A.substring(1);
        String firstWordCapB = B.substring(0,1).toUpperCase();
        String capB = firstWordCapB + B.substring(1);
        System.out.println(capA+" "+capB);
    }
    
}