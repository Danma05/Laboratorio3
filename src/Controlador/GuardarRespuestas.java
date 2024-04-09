package Controlador;

import java.io.FileWriter;
import java.io.IOException;

public class GuardarRespuestas {
    
    public static void guardarRespuestas(String[][] respuestas) {
        String nombreArchivo = "Archivo.csv";
        String ruta = "C:\\Users\\user\\Documents\\NetBeansProjects\\Laboratorio_3\\" + nombreArchivo;

        try (FileWriter writer = new FileWriter(ruta)) {
            // Escribir las respuestas en el archivo CSV
            for (String[] fila : respuestas) {
                for (String respuesta : fila) {
                    writer.append(respuesta);
                    writer.append(",");
                }
                writer.append("\n");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
