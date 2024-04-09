/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Container;
import java.awt.Frame;
import javax.swing.JDialog;

/**
 *
 * @author user
 */
public class estadistica  extends JDialog{
    
    public estadistica(Frame D, boolean modal) {
        super(D, modal);
        setTitle("Estadistica");
        Container c = getContentPane();
        c.setLayout(null);
        
        setSize(300, 120);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
