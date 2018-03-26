/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author Mamed
 */
public class BuahhAksi {
    public static void main(String[] args) {
        Buahh R = new Buahh();
        Buahh G = new Buahh();
        Buahh Q = new Buahh();
        
       
       R.jenis_buah="Durian Monthong";
       R.nama_buah="Durian";
       R.warna_buah="Hijau";
       R.harga_buah="100.000/biji";
       R.bentuk_buah="Bulat Lonjong";
       
       G.jenis_buah="Semangka New Dragon";
       G.nama_buah="Semangka";
       G.warna_buah="Hijau";
       G.harga_buah="200.000/kg";
       G.bentuk_buah="Bulat lonjong";

       
       Q.jenis_buah="Mangga Arumanis";
       Q.nama_buah="Mangga";
       Q.warna_buah="Hijau Tua";
       Q.harga_buah="50.000/biji";
       Q.bentuk_buah="Lonjong";
       
       
       
       R.cetakInfo();
       System.out.println();
       G.cetakInfo();
       System.out.println();
       Q.cetakInfo();
            
    }
        
}
