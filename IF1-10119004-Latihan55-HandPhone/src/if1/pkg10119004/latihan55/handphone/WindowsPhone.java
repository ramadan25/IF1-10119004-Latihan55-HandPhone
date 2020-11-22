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
class WindowsPhone extends HandPhone{
    private String wpKeyStore;
    
    public WindowsPhone(String man, String os, String model, int harga, String wpKeyStore) {
        super(man, os, model, harga);
        this.wpKeyStore = wpKeyStore;
    }
    
    public String getWpKeyStore() {
        return this.wpKeyStore;
    }
    
    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }
    
}
