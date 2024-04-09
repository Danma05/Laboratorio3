package Modelo;

import Vista.MenuPrincipal;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoCSV {
    
    public void crearArchivoCSV(String[][] datos) {
        String rutaArchivo = "C:\\Users\\user\\Documents\\NetBeansProjects\\Laboratorio_3\\archivo.csv"; 
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
            // Escribir los datos en el archivo CSV
            for (String[] fila : datos) {
                StringBuilder linea = new StringBuilder();
                for (int i = 0; i < fila.length; i++) {
                    linea.append(fila[i]);
                    if (i < fila.length - 1) {
                        linea.append(","); // Separador de campos CSV
                    }
                }
                writer.write(linea.toString());
                writer.newLine(); // Nueva línea para cada fila
            }
            System.out.println("Archivo CSV creado exitosamente en la ruta: " + rutaArchivo);
        } catch (IOException e) {
            System.err.println("Error al crear el archivo CSV: " + e.getMessage());
        }
    }
    
    public void Menu(){
        MenuPrincipal menu = new MenuPrincipal();
    }
    
    public static void main(String[] args) {
        
        ArchivoCSV arch = new ArchivoCSV();
        arch.Menu();
        String[][] datos = null;
        arch.crearArchivoCSV(datos);
    }
}

