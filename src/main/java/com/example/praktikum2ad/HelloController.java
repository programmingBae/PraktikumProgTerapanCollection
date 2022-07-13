package com.example.praktikum2ad;

import com.example.praktikum2ad.model.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class HelloController {

    @FXML
    public TextField txtNRP;
    @FXML
    public TextField txtNama;
    @FXML
    public TextField txtIPA;
    @FXML
    public TextField txtIPS;
    @FXML
    public TableView<Student> tableStudent;
    @FXML
    public TableColumn colNRP;
    @FXML
    public TableColumn colNama;
    @FXML
    public TableColumn colIPA;
    @FXML
    public TableColumn colIPS;
    public Button btnTambah;
    public Button btnUpdate;
    public Button btnHapus;

    private ObservableList<Student> studentList;

    public void initialize(){

    }

    public void addStudent(ActionEvent actionEvent) {

    }

    public void reset(){
        txtNama.clear();
        txtNRP.clear();
        txtIPA.clear();
        txtIPS.clear();
    }



    public void deleteStudent(ActionEvent actionEvent) {

    }


    public void getSelectedItem(MouseEvent mouseEvent) {
        if (!tableStudent.getSelectionModel().getSelectedCells().isEmpty()){
            btnTambah.setDisable(true);
            btnUpdate.setDisable(false);
            btnHapus.setDisable(false);
        }
        txtNRP.setText(tableStudent.getSelectionModel().getSelectedItem().getNRP());
        txtNama.setText(tableStudent.getSelectionModel().getSelectedItem().getNama());
        txtIPA.setText(String.valueOf(tableStudent.getSelectionModel().getSelectedItem().getNilaiIPA()));
        txtIPS.setText(String.valueOf(tableStudent.getSelectionModel().getSelectedItem().getNilaiIPS()));
    }



    public void updateStudent(ActionEvent actionEvent) {

    }
}