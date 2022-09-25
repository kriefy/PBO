import java.util.Scanner;

class latihan1{
    public static void main(String[] args){
        int nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai tugas : ");
        nilaiTugas = sc.nextInt();
        System.out.print("Masukan nilai UTS : ");
        nilaiUTS = sc.nextInt();
        System.out.print("Masukan nilai UAS : ");
        nilaiUAS = sc.nextInt();
        //untuk menghitung nilai akhir
        nilaiAkhir = (nilaiTugas*20/100) + (nilaiUTS*35/100) + (nilaiUAS*45/100);
        //masukan terlebih dahulu nama var nya baru 20%nya karena jika 20%nya terlebih dahulu hasilnya akan 0. Hal itu disebabkan karena 20/100 = 0.2 sedangkan integer tidak bisa desimal
        System.out.println("Nilai akhir = "+ nilaiAkhir);
        
        //untuk menentukan grade nilai
        if (nilaiAkhir >= 85 && nilaiAkhir == 100){
            System.out.print("Grade nilai akhir = A");
        }
        else if (nilaiAkhir >= 75 && nilaiAkhir <= 84){
            System.out.print("Grade nilai akhir = B");
        }
        else if (nilaiAkhir >= 65 && nilaiAkhir <= 74){
            System.out.print("Grade nilai akhir = C");
        }
        else if (nilaiAkhir >= 49 && nilaiAkhir <= 64){
            System.out.print("Grade nilai akhir = D");
        }
        else if (nilaiAkhir < 50 ){
            System.out.print("Grade nilai akhir = E");
        }
        else{
            System.out.println("Nilai yang dimasukan salah !");
        }
    }
}