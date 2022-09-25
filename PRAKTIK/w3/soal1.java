package PRAKTIK.w3;
import java.util.*;

public class soal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNext()){
            System.out.println("0");
            return;
        }
        String s = scan.nextLine();
        scan.close();
        
        String[] tokens = s.split("[^a-zA-Z]+");
        int size = tokens.length;
        System.out.println(size);
        for(int i=0; i<size; i++){
            System.out.println(tokens[i]);
        }
    }
}
