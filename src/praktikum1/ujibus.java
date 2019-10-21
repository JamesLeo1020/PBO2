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
public class ujibus {
    public static void main(String[] args) {
        bus Bus = new bus(200);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        
        Bus.addpenumpang(49);
        Bus.getAverage();
        Bus.cetakpenumpang();
        
        Bus.addpenumpang(50);
        Bus.getAverage();
        Bus.cetakpenumpang();
        
        Bus.addpenumpang(68);
        Bus.getAverage();
        Bus.cetakpenumpang();
        
        Bus.addpenumpang(86);
        Bus.getAverage();
        Bus.cetakpenumpang();
        
        Bus.addpenumpang(75);
        Bus.getAverage();
        Bus.cetakpenumpang();
    }
}
