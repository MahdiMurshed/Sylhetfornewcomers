package com.Sylhet;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class ShowingCost extends Application {
    public int i;
    public int j;
    static  Place[] x;


    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Welcome to Sylhet");
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(0, 10, 0, 10));
        Label source = new Label("Current location: ");
        root.add(source, 2, 1);
        Label sourced = new Label("Destination: ");
        Database.initDatabase();

        final ChoiceBox<Place> cb = new ChoiceBox<Place>();
        cb.getItems().addAll(Database.getAll());
        final ChoiceBox<Place> cd = new ChoiceBox<Place>();
        cd.getItems().addAll(Database.getAll());
        root.add(sourced, 2, 2);
        root.add(cd,3,2);
        cb.setTooltip(new Tooltip("Current location"));
        cd.setTooltip(new Tooltip("Destination"));
        root.add(cb, 3, 1);
        Button bt=new Button("Calculate");
        bt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                i=cb.getSelectionModel().getSelectedIndex();
                j=cd.getSelectionModel().getSelectedIndex();
                choosingPath.calculate(Database.getAllPlaces().get(i),Database.getAllPlaces().get(j));

            }
        });
        root.add(bt,2,5,10,10);
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {


        launch(args);
    }
}
