package com.pboreg;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BiodataMhsController {
    public TextField textNIM;
    public TextField textNama;
    public TextField textUmur;
    public TextField textJurusan;
    public Label labelNotif;
    private KoneksiDB konekdb = new KoneksiDB();

    public void buttonDaftarOnClick(ActionEvent actionEvent) {
        String nim = textNIM.getText();
        String nama = textNama.getText();
        String umur = textUmur.getText();
        String jurusan = textJurusan.getText();

        String query = "INSERT INTO mahasiswa(nim,nama,umur,jurusan) VALUES('" + nim + "','" + nama + "','" + umur + "','" + jurusan + "')";
        int hasil = konekdb.manipulasiData(query);
        if (hasil == 1) {
            System.out.println("Data berhasil didaftarkan \n" + nim + " " + nama + " " + umur + " " + jurusan);
            labelNotif.setText("Data berhasil didaftarkan");

        }
    }
}
