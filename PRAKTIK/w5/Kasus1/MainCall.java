package PRAKTIK.w5.Kasus1;
import java.util.*;

public class MainCall {
    public static void main(String args[]) {
        
        //Memanggil Constructor
        Restaurant menu = new Restaurant();
        
        //Memanggil method tambah menu
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 2_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_500, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 2_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Pisang", 2_000, 20);
        
        //Pesan makanan
        System.out.println("~Menu~");
        menu.tampilMenuMakanan();
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("");
            System.out.println("~User Input");
            System.out.print("Input Food Name : ");
            String nama = scan.nextLine();
            System.out.print("Input Qty : ");
            Integer jumlah = scan.nextInt();
            System.out.println("");
            menu.pesanMakanan(nama,jumlah);
        }
        
        //Menampilkan stok terbaru
        System.out.println("");
        System.out.println("~Newest Stock~");
        menu.tampilMenuMakanan();
    }
}