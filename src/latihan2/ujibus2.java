/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author USER
 */
public class ujibus2 {
    public static void main(String[] args) {
        bus2 busBesar = new bus2(40);
        busBesar.cetak();
        
        busBesar.addpenumpang(15);
        busBesar.cetak();
        
        busBesar.addpenumpang(5);
        busBesar.cetak();
        
        busBesar.addpenumpang(26);
        busBesar.cetak();
    }
    
}
