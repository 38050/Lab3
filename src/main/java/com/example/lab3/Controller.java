package com.example.lab3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
   public Button btnMain;
   public TextField wysokosc;
   public TextField grubosc;
   public TextField promien;
   public TextField wynik;
   public TextField wynik2;
   public TextField koszt;
   public TextField koszt2;
   double pi = 3.14;
   double s1 = 0;
   double s2 = 0;
   double cena1 = 0;
   double cena2 = 0;


    public void onBtnAction(ActionEvent actionEvent) {
        Double h = Double.valueOf(wysokosc.getText());
        Double g = Double.valueOf(grubosc.getText());
        Double r = Double.valueOf(promien.getText());
            Double s1 = ((pi * h * (r * r - g * g))) * 10.1 / 100;
            Double s2 = ((pi * h * (r * r - g * g))) * 13.1 / 100;
            wynik.setText(s1.toString());
            wynik2.setText(s2.toString());

            Double cena1 = s1 * 6;
            Double cena2= s2 * 11.5;

            koszt.setText(cena1.toString());
            koszt2.setText(cena2.toString());
    }


    }
