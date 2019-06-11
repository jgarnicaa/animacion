
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;

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
    public Loop(GraphicsContext lapiz){
        this.lapiz=lapiz;
        this.carro= new Carro(5,180);
    }

    @Override
    public void handle(long l) {
    lapiz.clearRect(0, 0, 300, 300);
    lapiz.strokeLine(0, 250, 300, 250);
    lapiz.strokeRect(this.carro.getX(),this.carro.getY(),180, 20);
    lapiz.strokeLine(this.carro.getX()+15 ,this.carro.getY() , this.carro.getX()+45, this.carro.getY()-50);
    lapiz.strokeLine(this.carro.getX()+45, this.carro.getY()-50, this.carro.getX()+135,this.carro.getY()-50);
    lapiz.strokeLine(this.carro.getX()+135, this.carro.getY()-50, this.carro.getX()+165,this.carro.getY());
    lapiz.strokeOval(this.carro.getX()+15, this.carro.getY()+20, 50, 50);
    lapiz.strokeOval(this.carro.getX()+135,this.carro.getY()+20, 50, 50);
    
    this.carro.mover();
    }
    
    
    
}
