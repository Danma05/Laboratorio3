/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.GuardarRespuestas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author user
 */
public class responderEncuesta extends JDialog {
    
    JLabel pregunta1Label, pregunta2Label, pregunta3Label, pregunta4Label, pregunta5Label, espacio, espacio2;
    JComboBox<String> respuesta1ComboBox, respuesta2ComboBox, respuesta3ComboBox;
    JRadioButton falsoRadioButton, falsoRadioButton2, verdaderoRadioButton, verdaderoRadioButton2;
    ButtonGroup grupoPregunta4, grupoPregunta5;
    JButton guardar, limpiaer, cancelar;
    
    public responderEncuesta(Frame parent, boolean modal) {
        super(parent, modal);
        setTitle("Responder Encuesta");
        Container container = getContentPane();
        container.setLayout(new GridLayout(10, 4)); // 5 filas y 2 columnas para las preguntas y respuestas
        
        // Pregunta 1: Selección múltiple con única respuesta mediante JComboBox
        JLabel pregunta1Label = new JLabel("¿Cuál es la capital de Francia?");
        JComboBox<String> respuesta1ComboBox = new JComboBox<>(new String[]{"París", "Londres", "Madrid", "Berlín", "Roma"});
        container.add(pregunta1Label);
        container.add(respuesta1ComboBox);

        // Pregunta 2: Selección múltiple con única respuesta mediante JComboBox
        JLabel pregunta2Label = new JLabel("¿Cuál es el río más largo del mundo?");
        JComboBox<String> respuesta2ComboBox = new JComboBox<>(new String[]{"Amazonas", "Nilo", "Misisipi", "Yangtsé", "Ganges"});
        container.add(pregunta2Label);
        container.add(respuesta2ComboBox);

        // Pregunta 3: Selección múltiple con única respuesta mediante JComboBox
        JLabel pregunta3Label = new JLabel("¿Cuál es el océano más grande?");
        JComboBox<String> respuesta3ComboBox = new JComboBox<>(new String[]{"Pacífico", "Atlántico", "Índico", "Ártico", "Antártico"});
        container.add(pregunta3Label);
        container.add(respuesta3ComboBox);

        // Pregunta 4: Falso/Verdadero mediante JRadioButton
        JLabel pregunta4Label = new JLabel("La Tierra es plana.");
        JLabel espacio = new JLabel("       ");
        JRadioButton falsoRadioButton = new JRadioButton("Falso");
        JRadioButton verdaderoRadioButton = new JRadioButton("Verdadero");
        ButtonGroup grupoPregunta4 = new ButtonGroup();
        grupoPregunta4.add(falsoRadioButton);
        grupoPregunta4.add(verdaderoRadioButton);
        container.add(pregunta4Label);
        container.add(espacio);
        container.add(falsoRadioButton);
        container.add(verdaderoRadioButton);

        // Pregunta 5: Falso/Verdadero mediante JRadioButton
        JLabel pregunta5Label = new JLabel("El sol gira alrededor de la Tierra.");
        JLabel espacio2 = new JLabel("       ");
        JRadioButton falsoRadioButton2 = new JRadioButton("Falso");
        JRadioButton verdaderoRadioButton2 = new JRadioButton("Verdadero");
        ButtonGroup grupoPregunta5 = new ButtonGroup();
        grupoPregunta5.add(falsoRadioButton2);
        grupoPregunta5.add(verdaderoRadioButton2);
        container.add(pregunta5Label);
        container.add(espacio2);
        container.add(falsoRadioButton2);
        container.add(verdaderoRadioButton2);
        
        JButton guardar = new JButton("Guardar");
                guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener las respuestas seleccionadas por el usuario
                String respuesta1 = (String) respuesta1ComboBox.getSelectedItem();
                String respuesta2 = (String) respuesta2ComboBox.getSelectedItem();
                String respuesta3 = (String) respuesta3ComboBox.getSelectedItem();
                String respuesta4 = falsoRadioButton.isSelected() ? "Falso" : "Verdadero";
                String respuesta5 = falsoRadioButton2.isSelected() ? "Falso" : "Verdadero";

                // Crear una matriz con las respuestas
                String[][] respuestas = {
                    {"Pregunta 1", respuesta1},
                    {"Pregunta 2", respuesta2},
                    {"Pregunta 3", respuesta3},
                    {"Pregunta 4", respuesta4},
                    {"Pregunta 5", respuesta5}
                };

                // Llamar al método para guardar las respuestas en el archivo CSV
                GuardarRespuestas.guardarRespuestas(respuestas);
            }
        });
        container.add(guardar);
        
        JButton limpiar = new JButton("Limpiar");
        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpiar selecciones
                respuesta1ComboBox.setSelectedIndex(-1);
                respuesta2ComboBox.setSelectedIndex(-1);
                respuesta3ComboBox.setSelectedIndex(-1);
                // Limpiar selecciones de los JRadioButtons
                grupoPregunta4.clearSelection();
                grupoPregunta5.clearSelection();
            }
        });
        container.add(limpiar);
        container.add(limpiar);
        
        JButton cancelar = new JButton("Cancelar");
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        container.add(cancelar);

        pack(); // Ajusta automáticamente el tamaño del diálogo según su contenido
        setSize(450, 250);
        setLocationRelativeTo(parent);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Cierra el diálogo sin salir de la aplicación
        setVisible(true); // Muestra el diálogo
    }
}
