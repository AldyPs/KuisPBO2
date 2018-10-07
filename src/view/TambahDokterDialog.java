/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import model.Dokter;

/**
 *
 * @author jarkom
 */
public class TambahDokterDialog extends JDialog implements ActionListener {

    private JLabel namaLabel, nomorPegawaiLabel, tambahDokterLabel;
    private JTextField namaText, nomorPegawaiText;
    private JToggleButton tambahBotton;

    public TambahDokterDialog() {
        initComponents();
    }

    public TambahDokterDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void initComponents() {
        this.setLayout(null);

        tambahDokterLabel = new JLabel("Formulir Penambahan Dokter");
        tambahDokterLabel.setBounds(120, 30, 250, 30);
        this.add(tambahDokterLabel);

        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(20, 50, 60, 30);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(140, 60, 200, 30);
        this.add(namaText);

        nomorPegawaiLabel = new JLabel("Nomor Pegawai");
        nomorPegawaiLabel.setBounds(20, 100, 150, 30);
        this.add(nomorPegawaiLabel);

        nomorPegawaiText = new JTextField();
        nomorPegawaiText.setBounds(140, 100, 200, 30);
        this.add(nomorPegawaiText);

        tambahBotton = new JToggleButton("Tambah");
        tambahBotton.setBounds(120, 150, 90, 30);
        this.add(tambahBotton);
        tambahBotton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tambahBotton) {
            Dokter dok = new Dokter();
            dok.setNama(namaText.getText());
            dok.setNomorPegawai(nomorPegawaiText.getText());
            JOptionPane.showMessageDialog(null, "Data Telah Ditambahkan");
            FrameUtama.rumahSakit.tambahDokter(dok);
            DokterTableModel dokterModel = new DokterTableModel(FrameUtama.rumahSakit.getDaftarDokter());
            FrameUtama.lihatDokter.setDokterTableModel(dokterModel);
            FrameUtama.lihatDokter.updateTable();
            this.dispose();
        }
    }

    public static void main(String[] args) {
        TambahDokterDialog test = new TambahDokterDialog();
        test.setSize(400, 400);
        test.setVisible(true);
    }

}
