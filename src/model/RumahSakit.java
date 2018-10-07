/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jarkom
 */
public class RumahSakit {

    private String nama;
    private static ArrayList<Dokter> daftarDokter = new ArrayList<Dokter>();
    private static ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();

    public RumahSakit() {
    }

    public RumahSakit(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public static ArrayList<Dokter> getDaftarDokter() {
        return daftarDokter;
    }

    public static void setDaftarDokter(ArrayList<Dokter> daftarDokter) {
        RumahSakit.daftarDokter = daftarDokter;
    }

    public static ArrayList<Klinik> getDaftarKlinik() {
        return daftarKlinik;
    }

    public static void setDaftarKLinik(ArrayList<Klinik> daftarKLinik) {
        RumahSakit.daftarKlinik = daftarKLinik;
    }

    public void tambahKlinik(Klinik klinik) {
        if (cariKLinik(klinik.getNamaKlinik()) == -1) {
            daftarKlinik.add(klinik);
        }else{
            JOptionPane.showMessageDialog(null, "Klinik sudah ada");
        }
        
    }

    public void tambahDokter(Dokter dokter) {
        if (cariDokter(dokter.getNama()) == -1) {
            daftarDokter.add(dokter);
        }else{
            JOptionPane.showMessageDialog(null, "Dokter sudah ada");
        }
        
    }

    public int cariDokter(String nama) {
        for (int i = 0; i < daftarDokter.size(); i++) {
            if (nama.equalsIgnoreCase(daftarDokter.get(i).getNama())) {
                return i;
            }
        }
        return -1;
    }

    public int cariKLinik(String nama) {
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if (nama.equalsIgnoreCase(daftarKlinik.get(i).getNamaKlinik())) {
                return i;
            }
        }
        return -1;
    }
}
