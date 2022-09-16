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
public class AnggotaKoperasi {
    private String ktp,nama;
    private int LimitPinjaman;
    private int JumlahPinjaman;
    
    public AnggotaKoperasi(String ktp, String nama, int LimitPinjaman){
        this.ktp = ktp;
        this.nama = nama;
        this.LimitPinjaman = LimitPinjaman;
        JumlahPinjaman = 0;
    }
    
    public String getNama(){
        return nama;
    }
    public String getktp(){
        return ktp;
    }
   public int getLimitPinjaman(){
        return LimitPinjaman;
    }
   public int getJumlahPinjaman(){
        return JumlahPinjaman;
    }
   public void pinjam(int uang){
       if((JumlahPinjaman+uang) > LimitPinjaman){
           System.out.println("Maaf, jumlah pinjaman memelbihi limit");
       }
       else {
           JumlahPinjaman +=uang;
       }
   }
   
   public void angsur(int uang){
       if(uang > (JumlahPinjaman / 10)){
           JumlahPinjaman -= uang;
       }
       else {
           System.out.println("Maaf tidak bisa mengangsur,angsuran harus lebih 10% dari jumlah pinjaman");
       }
   }
}
