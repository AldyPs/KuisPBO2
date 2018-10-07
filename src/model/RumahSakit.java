/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

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
        daftarKlinik.add(klinik);
    }

    public void tambahDokter(Dokter dokter) {
        daftarDokter.add(dokter);
    }

    public int cariDokter(String nama) {
        for (int i = 0; i < daftarDokter.size(); i++) {
            if (daftarDokter.get(i).getNama().equalsIgnoreCase(nama)) {
                return i;
            }
        }
        return -1;
    }

    public int cariKLinik(String nama) {
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if (daftarKlinik.get(i).getNamaKlinik().equalsIgnoreCase(nama)) {
                return i;
            }
        }
        return -1;
    }
}
