package com.zenteno.laberinto;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.robot.Robot;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Sphere;

import java.util.Observable;
import java.util.Observer;

public class HelloController implements Observer {



    @FXML
    private Rectangle bord1;

    @FXML
    private Rectangle bord10;

    @FXML
    private Rectangle bord11;

    @FXML
    private Rectangle bord12;

    @FXML
    private Rectangle bord13;

    @FXML
    private Rectangle bord14;

    @FXML
    private Rectangle bord15;

    @FXML
    private Rectangle bord16;

    @FXML
    private Rectangle bord17;

    @FXML
    private Rectangle bord18;

    @FXML
    private Rectangle bord2;

    @FXML
    private Rectangle bord3;

    @FXML
    private Rectangle bord4;

    @FXML
    private Rectangle bord5;

    @FXML
    private Rectangle bord6;

    @FXML
    private Rectangle bord7;

    @FXML
    private Rectangle bord8;

    @FXML
    private Rectangle bord9;
    @FXML
    private Label welcomeText;

    private Line linea;

    private Sphere esfera;

    @FXML
    private AnchorPane root;
    @FXML
    Circle character;

    @FXML
    void ball(KeyEvent event) {
        if (event.getCode() == KeyCode.D)
            character.setLayoutX(character.getLayoutX() + 15);

        if (event.getCode() == KeyCode.A)
            character.setLayoutX(character.getLayoutX() - 15);
        if (event.getCode() == KeyCode.S)
            character.setLayoutY(character.getLayoutY() + 15);
        if (event.getCode() == KeyCode.W)
            character.setLayoutY(character.getLayoutY() - 15);

        if(character.getBoundsInParent().intersects(bord1.getBoundsInParent())){
            System.out.printf("hola");
        }
    }

    @FXML
    public void initialize (){
        linea = new Line();
        linea.setStroke(Color.RED);
        root.getChildren().add(linea);
            }

   @FXML
    void btnSalirOnMouse(MouseEvent event) {
        System.exit(1);
    }




    @Override
    public void update(Observable o, Object arg) {


    }
}