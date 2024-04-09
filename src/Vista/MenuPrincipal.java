/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import Modelo.ArchivoCSV;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MenuPrincipal extends JFrame {
    
    JButton responderEncuestaBtn, estadisticaBtn, acercaDeBtn;

    public MenuPrincipal() {
        super("Menu Principal");
        setTitle("Detalle Ingreso");
        Container c = getContentPane();
        c.setLayout(null);
        
        responderEncuestaBtn = new JButton("Responder Encuesta");
        responderEncuestaBtn.setBounds(60, 25, 160, 25);
        responderEncuestaBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                responderEncuesta obj = new responderEncuesta(null, true);
            }
        });
        
        estadisticaBtn = new JButton("Estadistica");
        estadisticaBtn.setBounds(90, 85, 100, 25);

        acercaDeBtn = new JButton("Acerca de");
        acercaDeBtn.setBounds(90, 145, 100, 25);
        acercaDeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                acercaDe obj = new acercaDe(null, true);
            }
        });
        
        c.add(responderEncuestaBtn);
        c.add(estadisticaBtn);
        c.add(acercaDeBtn);
        
        setSize(300, 250);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
