/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jarkom
 */
public class Dokter {
    private String nomorPegawai;
    private String nama;

    public Dokter() {
    }

    public Dokter(String nomorPegawai, String nama) {
        this.nomorPegawai = nomorPegawai;
        this.nama = nama;
    }
    

    public String getNomorPegawai() {
        return nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
