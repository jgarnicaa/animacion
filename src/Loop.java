
import com.sun.javafx.geom.RectangularShape;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Loop extends AnimationTimer {
    private GraphicsContext lapiz;
    private Carro carro;
    double vida=200;
    public Loop(GraphicsContext lapiz){
        this.lapiz=lapiz;
        this.carro= new Carro(5,180);
    }

    @Override
    public void handle(long l) {
    lapiz.clearRect(0, 0, 500, 500);
    lapiz.strokeLine(0, 250, 500, 250);
    lapiz.strokeRect(this.carro.getX(),this.carro.getY(),180, 20);
    lapiz.strokeLine(this.carro.getX()+15 ,this.carro.getY() , this.carro.getX()+45, this.carro.getY()-50);
    lapiz.strokeLine(this.carro.getX()+45, this.carro.getY()-50, this.carro.getX()+135,this.carro.getY()-50);
    lapiz.strokeLine(this.carro.getX()+135, this.carro.getY()-50, this.carro.getX()+165,this.carro.getY());
    lapiz.strokeOval(this.carro.getX()+15, this.carro.getY()+20, 50, 50);
    lapiz.strokeOval(this.carro.getX()+135,this.carro.getY()+20, 50, 50);
    lapiz.fillRect(200,150,10,100);
    lapiz.fillRect (450, 150, 10, 100);
    lapiz.strokeRect(0,0, 200, 50);
    lapiz.fillRect(0,0,vida,50);
    
    lapiz.strokeRect(this.carro.getX(),this.carro.getY()-50,185,120);
    this.carro.mover();
    Shape carro = new Rectangle(this.carro.getX(),this.carro.getY()-50,185,120);
    
    
    
    this.lapiz.setFill(Color.BURLYWOOD);
    
    obstaculo statusobstaculo=new obstaculo(true, 200, 150);
    obstaculo statusobstaculo1=new obstaculo(true, 450, 150);
    Shape obstaculo = new Rectangle(200,150,10,100);
    Shape obstaculo1 = new Rectangle(450, 150, 10, 100);
    Shape interseccion=SVGPath.intersect(carro, obstaculo);
    Shape interseccion1=SVGPath.intersect(carro, obstaculo1);
    
   double limites= interseccion.getLayoutBounds().getWidth();
   double limites1=interseccion1.getLayoutBounds().getWidth();
   
   
   
   if(limites !=-1 || limites1!=-1){
  boolean s=statusobstaculo.isActivo();
   boolean s1=statusobstaculo1.isActivo();
   this.lapiz.fillText("Choque", 50, 100);
   
       System.out.println(s);
   if((s==true)&&(s1==true)){
   vida=vida/2;
      statusobstaculo.setActivo(false);
   statusobstaculo1.setActivo(false);
   }
   stop();
   }
   else{
   this.lapiz.fillText("andando", 50, 100);
      statusobstaculo.setActivo(true);
   statusobstaculo1.setActivo(true);
   }
   
    }
    
    
    
}
