package com.pbo;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class Controller {
    private String nilai1, nilai2;
    public TextField text_nilai1;
    public TextField text_nilai2;
    public Label label_hasil;
    DecimalFormat de = new DecimalFormat("#.##");


    public void buttonKaliClick(ActionEvent actionEvent) {
        nilai1 = text_nilai1.getText();
        nilai2 = text_nilai2.getText();
        double nil1 = Double.parseDouble(nilai1);
        double nil2 = Double.parseDouble(nilai2);
        double hsl = nil1 * nil2;
        String cetak = de.format(nil1) + " x " + de.format(nil2) + " = " + de.format(hsl);
        label_hasil.setText(cetak);
    }

    public void buttonBagiClick(ActionEvent actionEvent) {
        nilai1 = text_nilai1.getText();
        nilai2 = text_nilai2.getText();
        double nil1 = Double.parseDouble(nilai1);
        double nil2 = Double.parseDouble(nilai2);
        double hsl =  nil1 / nil2;
        String cetak = de.format(nil1) + " / " + de.format(nil2) + " = " + de.format(hsl);
        label_hasil.setText(cetak);

    }

    public void buttonKurangClick(ActionEvent actionEvent) {
        nilai1 = text_nilai1.getText();
        nilai2 = text_nilai2.getText();
        double nil1 = Double.parseDouble(nilai1);
        double nil2 = Double.parseDouble(nilai2);
        double hsl =  nil1 - nil2;
        String cetak = de.format(nil1) + " - " + de.format(nil2) + " = " + de.format(hsl);
        label_hasil.setText(cetak);

    }

    public void buttonTambahClick(ActionEvent actionEvent) {
        nilai1 = text_nilai1.getText();
        nilai2 = text_nilai2.getText();
        double nil1 = Double.parseDouble(nilai1);
        double nil2 = Double.parseDouble(nilai2);
        double hsl = nil1 + nil2;
        String cetak = de.format(nil1) + " + " + de.format(nil2) + " = " + de.format(hsl);
        label_hasil.setText(cetak);
    }

    public void buttonClearClick(ActionEvent actionEvent) {
        text_nilai1.clear();
        text_nilai2.clear();
        String cetak ="0";
        label_hasil.setText(cetak);
    }
}
