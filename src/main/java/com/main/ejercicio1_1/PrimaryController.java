package com.main.ejercicio1_1;

import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML
    private TextField txtFecha;
    @FXML
    private Button btnCalcular;
    @FXML
    private Button btnLimpiar;
    @FXML
    private Label lblResultado;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void btnCalcularOnAction(ActionEvent event) {
        try {
            String textoFecha = txtFecha.getText();
            DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            LocalDate fechaNacimiento = LocalDate.parse(textoFecha, formateador);
            LocalDate fechaActual = LocalDate.now();
            
            Period periodo = Period.between(fechaNacimiento, fechaActual);
            int anios = periodo.getYears();
            int meses = periodo.getMonths();
            
            lblResultado.setText("Tiene " + anios + " años con " + meses + " meses");
        } catch (Exception e) {
            lblResultado.setText("Formato incorrecto (use dd/mm/aaaa)");
        }
    }

    @FXML
    private void btnLimpiarOnAction(ActionEvent event) {
        txtFecha.setText("");
        lblResultado.setText("");
    }
}