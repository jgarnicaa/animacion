

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */

public class Escenario extends Application{
    
    
    
    public static void main(String[] args) {
      Application.launch(args)  ;
        
    }

    @Override
    public void start(Stage stage) throws Exception {
    Pane layout= new Pane();
    Canvas canvas= new Canvas(300,300);
    layout.getChildren().add(canvas);
    Scene escena=new Scene (layout, 300, 300,Color.WHITESMOKE);
    GraphicsContext lapiz= canvas.getGraphicsContext2D();
    stage.setScene(escena);
    stage.setTitle("Escenario");
    stage.show();
    lapiz.setFill(Color.RED);
    lapiz.setStroke(Color.AQUAMARINE);
    int x=5;
    int y=180;
    
    lapiz.strokeLine(0, 250, 300, 250);
    //lapiz.strokeRect(30, 30, 80, 60);
    //lapiz.fillOval(20, 20, 50, 50);
    lapiz.strokeRect(x, y,180, 20);
    lapiz.strokeLine(x+15 ,y , x+45, y-50);
    lapiz.strokeLine(x+45, y-50, x+135,y-50);
    lapiz.strokeLine(x+135, y-50, x+165,y);
    lapiz.strokeOval(x+15, y+20, 50, 50);
    lapiz.strokeOval(x+135,y+20, 50, 50);
    
   
    }
        
    }

