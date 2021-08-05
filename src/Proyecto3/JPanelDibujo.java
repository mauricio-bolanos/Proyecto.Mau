/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto3;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author maubo
 */
public class JPanelDibujo extends JPanel {
    /* 
   * Constructor del panel para dibujar
   */
  public JPanelDibujo(){
    this.setBackground(Color.RED);
  }
  

  
  // Reimplementa paint
  @Override
  public void paint (Graphics g) { 
        super.paint(g);
            int random = (int) (Math.random()*12);
            
            for (int i = 1; i<= random; i= i+1) {
            int posX = (int) (Math.random() * 600);
            int posY = (int) (Math.random() * 600);
            int ancho = (int) (Math.random() * 600);
            int alto = (int) (Math.random() * 600);
            int posXRect = (int) (Math.random() * 600);
            int posYRect = (int) (Math.random() * 600);
            int anchoRect = (int) (Math.random() * 600);
            int altoRect = (int) (Math.random() * 600);
        
                Ovalo ov = new Ovalo(posX,posY,ancho,alto);

            //OVALOS
            g.drawOval(ov.getPosX(), ov.getPosY(),ov.getAncho(), ov.getAlto()); //dibuja un ovalo sin fondo
            g.setColor(Color.yellow);     
            g.fillOval(ov.getPosX(), ov.getPosY(),ov.getAncho(), ov.getAlto());  //dibuja un ovalo con fondo amarillo

                Rectangulo re = new Rectangulo(posXRect,posYRect,anchoRect,altoRect);
            //RECTANGULOS
            g.setColor(Color.blue);
            g.fillRect(re.getPosX(),re.getPosY(),re.getAncho(),re.getAlto());
            g.setColor(Color.black);
            g.drawRect(re.getPosX(),re.getPosY(),re.getAncho(),re.getAlto());
            }
        


     }
}
