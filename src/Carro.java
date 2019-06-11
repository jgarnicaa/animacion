/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Carro extends Objeto {

    public Carro(int x, int y) {
        super(x, y);
    }

    @Override
    public void mover() {
       this.x++;
    }
    
    
}
