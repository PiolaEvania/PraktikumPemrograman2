package org.example.praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tabel extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TableView tabel = new TableView();
        TableColumn<Mahasiswa, String> kolom1 = new TableColumn<>("ID");
        TableColumn<Mahasiswa, String> kolom2 = new TableColumn<>("NIM");
        TableColumn<Mahasiswa, String> kolom3 = new TableColumn<>("NAMA");
        kolom1.setCellValueFactory(new PropertyValueFactory<>("id"));
        kolom2.setCellValueFactory(new PropertyValueFactory<>("nim"));
        kolom3.setCellValueFactory(new PropertyValueFactory<>("nama"));
        tabel.getColumns().add(kolom1);
        tabel.getColumns().add(kolom2);
        tabel.getColumns().add(kolom3);
        tabel.getItems().add(new Mahasiswa(1, "123456", "Piola"));
        tabel.getItems().add(new Mahasiswa(2, "234567", "Satrio"));
        tabel.getItems().add(new Mahasiswa(3, "345678", "Evania"));
        tabel.getItems().add(new Mahasiswa(4, "456789", "Andhika"));
        tabel.getItems().add(new Mahasiswa(5, "567890", "Mega"));
        tabel.getItems().add(new Mahasiswa(6, "678901", "Evelin"));
        tabel.getItems().add(new Mahasiswa(7, "789012", "Evgenia"));
        tabel.getItems().add(new Mahasiswa(8, "890123", "Tiara"));
        tabel.getItems().add(new Mahasiswa(9, "901234", "Dhea"));
        tabel.getItems().add(new Mahasiswa(10, "102938", "Margaretha"));

        VBox vbox = new VBox(tabel);
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}