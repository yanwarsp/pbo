package com.pboreg;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PesanController {
    public TextField textPesan;
    public Label labelPesan;
    private Koneksi koneksi = new Koneksi();
    public void buttonPesanOnClick(ActionEvent actionEvent) {
        String teks = textPesan.getText();
        labelPesan.setText(teks);

        //input data ke tabel pesan pada database pbo-reguler
        String query = "INSERT INTO pesan(isipesan) VALUES('" + teks + "')";
        int hasil = koneksi.manipulasiData(query);
        if (hasil == 1) {
            System.out.println("Data berhasil diinput ke dalam tabel");
        }
    }
}
