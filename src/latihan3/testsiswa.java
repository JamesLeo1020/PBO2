/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author USER
 */
public class testsiswa {
    public static void main(String[] args) {
        encapsiswa siswa = new encapsiswa();
        siswa.setName("Ciemeng");
        siswa.setAge(15);
        siswa.setAddress("Malang");
        
        System.out.println("Name: "+ siswa.getName());
        System.out.println("Age: "+ siswa.getAge());
        System.out.println("Address: "+ siswa.getAddress());
    }
}
