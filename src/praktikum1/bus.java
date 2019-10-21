/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author USER
 */
public class bus {
    public double penumpang;
    public double maxpenumpang;
    public int counter = 0;
    public double penumpangbaru;
    public double ratarata;
    
    public bus(double maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    public void addpenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if(temp > maxpenumpang){
            System.out.println("melebihi kuota berat");
        }else{
            this.penumpang=temp;
        }
        counter++;
    }
    public void getpenumpang(int pass){
        if (pass==24){
            System.out.println("password benar");
        }else{
            System.out.println("password salah brader");
        }
    }
    public void getAverage(){
    ratarata = this.penumpang/counter;
    }
    public void cetakpenumpang(){
        System.out.println("Berat penumpang sekarang: " + penumpang);
        System.out.println("Berat maksimum: " + maxpenumpang);
        System.out.println("Rata-rata berat penumpang: "+ratarata);
    }
}
