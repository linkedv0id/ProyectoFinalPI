
package control;
import javax.swing.JTextArea;
import modelo.ServidorDAO;

public class ControladorServidor {
    
    public static void iniciarServidor(JTextArea txt){
        ServidorDAO servidor = new ServidorDAO();
        servidor.ejecutarServidor(txt);
    }
    
    public static void enviarDatos(String mensaje, JTextArea txt){
        ServidorDAO servidor = new ServidorDAO();
        servidor.enviarDatos(mensaje, txt);
    }
    
    
}
