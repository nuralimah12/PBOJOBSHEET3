/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorencapsulation;
public class Motor {
    private int kecepatan = 0;
    private boolean kontak0n = false;
    
    public void nyalakanMesin(){
        kontak0n = true;
    }
    
    public void matikanMesin(){
        kontak0n = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan(){
        if(kecepatan <= 100){
            System.out.println("Kecepatan Maksimal");
            return;
        }  
        if(kontak0n == true){
            kecepatan += 5;
        }
        else{
          System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off!\n");  
        }
    }
    
    public void kurangiKecepatan(){
         if(kontak0n == true){
            kecepatan -= 5;
        }
         else{
             System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off!\n");
         }
    }
    
    public void printStatus(){
        if (kontak0n == true){
           System.out.println("Kontak 0n");
        } else {
            System.out.println("Kontak Off");
        }
       System.out.println("Kecepatan "+kecepatan+"\n");
    }

        }
        
