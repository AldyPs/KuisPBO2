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
public class Klinik {
    private String idKlinik;
    private String namaKlinik;
   private static ArrayList<Dokter> daftarDokter = new ArrayList<Dokter>();

    public Klinik() {
    }

    public Klinik(String idKLinik, String namaKlinik) {
        this.idKlinik = idKLinik;
        this.namaKlinik = namaKlinik;
    }
   

    public String getIdKlinik() {
        return idKlinik;
    }

    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }

    public String getNamaKlinik() {
        return namaKlinik;
    }

    public void setNamaKlinik(String namaKLinik) {
        this.namaKlinik = namaKLinik;
    }

    public static ArrayList<Dokter> getDaftarDokter() {
        return daftarDokter;
    }

    public static void setDaftarDokter(ArrayList<Dokter> daftarDokter) {
        Klinik.daftarDokter = daftarDokter;
    }
    
    public void tambahDokter(Dokter dokter){
        daftarDokter.add(dokter);
    }

}
