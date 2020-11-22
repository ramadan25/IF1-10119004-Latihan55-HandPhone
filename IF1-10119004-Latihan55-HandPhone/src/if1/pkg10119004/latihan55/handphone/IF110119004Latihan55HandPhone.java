/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan55.handphone;

/**
 *
 * @author ENDOG
 * Nama         : Muhamad Ramadan
 * Nim          : 10119004
 * Kelas        : IF1
 * Deskripsi    : Program ini menampilkan produk HandPhone
 */
public class IF110119004Latihan55HandPhone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android android;
        BlackBerry blackBerry;
        WindowsPhone windowsPhone;
        
        android = new Android("Samsung", "Android", "Grand", 3000000, "234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android Key Store : " + android.getKeyStore());
        System.out.println();
        
        blackBerry = new BlackBerry("BlackB", "RIM", "Curve", 2000000, "BHS249");
        blackBerry.displayProduct();
        System.out.println("PIN : " + blackBerry.getPinBB());
        System.out.println();
        
        windowsPhone = new WindowsPhone("Nokia", "Win8", "Model", 1000000, "UUUQIJWORJ");
        windowsPhone.displayProduct();
        System.out.println("WP Key Store : " + windowsPhone.getWpKeyStore());
    }
    
}
