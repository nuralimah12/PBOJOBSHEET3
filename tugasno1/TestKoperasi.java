/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasno1;

/**
 *
 * @author ASUS
 */
 import java.util.Scanner;
public class TestKoperasi {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        AnggotaKoperasi donny = new AnggotaKoperasi("1113333444","Donny",5000000);
        System.out.println("Nama Anggota: " + donny.getNama());   
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman()); 
        
        
        
        
        System.out.println("Masukkan Jumlah Pinjaman: ");   
        int pinjam = input.nextInt();
        donny.pinjam(pinjam);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("Masukkan Jumlah Angsuran: ");   
        int angsur = input.nextInt();
        donny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
       
        
 
    }
    
}
