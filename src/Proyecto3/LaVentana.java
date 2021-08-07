/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * La herencia sirve para extender la definicion de una clase. Por medio de ella
 * nos apropiamos de todos los métodos y programación de la clase padre (en este caso
 * JFrame) y la "heredamos" a la clase hija (MiVentana)
 */
public class LaVentana extends JFrame{
  
  private JFileChooser jFileChooser = new JFileChooser(System.getProperty("user.dir"));
  
 
  private JPanel panelIzquierda = new JPanel();
  private Dibujo panelCentral = new Dibujo();
  
  private JButton abrirBoton = new JButton("Abrir");
  private JButton salirBoton = new JButton("Salir");
  
  
  private LaVentana este = this;
  
  public LaVentana(String titulo){
    super(titulo);
    
    this.setLayout(new BorderLayout());
    
    panelIzquierda.setLayout(new GridLayout(2,1));
    
    abrirBoton.addActionListener(new EscuchadorDeEventos());
    salirBoton.addActionListener(new EscuchadorDeEventos());
    
    panelIzquierda.add(abrirBoton);
    panelIzquierda.add(salirBoton);
    
    
    this.add(panelIzquierda, BorderLayout.WEST);
    this.add(panelCentral, BorderLayout.CENTER);

    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    this.setSize(1000,900);
    
    this.setVisible(true);
    
  }
  
  private class EscuchadorDeEventos implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent evento){
      if (evento.getSource() == abrirBoton){
        JOptionPane.showMessageDialog(este,
                                          "No hace nada", 
                                          "PanelDibujo", 
                                          JOptionPane.ERROR_MESSAGE);
         
      } else if (evento.getSource() == salirBoton){
        este.setVisible(false);
      }
    }
  }
  

}