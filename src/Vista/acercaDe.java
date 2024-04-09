/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author user
 */

public class acercaDe extends JDialog {
    
    JLabel acercade;
    
    public acercaDe(Frame D, boolean modal) {
        super(D, modal);
        setTitle("Acerca De");
        Container c = getContentPane();
        c.setLayout(null);
        
        String programadores = "<html><body>2155210-2724 <br> "
                + "Daniel A. Martinez E. <br> "
                + "daniel.escandon@correounivalle.edu.co </body></html>";
        acercade = new JLabel(programadores);
        acercade.setBounds(10, 0, 250, 80);
        
        c.add(acercade);
        
        setSize(300, 120);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

