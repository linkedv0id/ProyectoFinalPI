package modelo;

import java.awt.event.ActionEvent;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ServidorDAO {

    Servidor obj = new Servidor();

    public void ejecutarServidor(JTextArea txt) {
        try // establece el servidor para que reciba conexiones; procesa las conexiones
        {
            obj.setServidor(new ServerSocket(12345, 100)); // crea objeto ServerSocket
            while (true) {
                try {
                    esperarConexion(txt); // espera una conexión
                    obtenerFlujos(txt); // obtiene los flujos de entrada y salida
                    procesarConexion(txt); // procesa la conexión
                } catch (EOFException excepcionEOF) {
                    JOptionPane.showMessageDialog(null, "\nServidor termino la conexion");
                } // fin de catch
                finally {
                    cerrarConexion(txt); // cierra la conexión
                    obj.setContador(obj.getContador() + 1);
                } // fin de finally
            } // fin de while
        } catch (IOException exepcionES) {
            exepcionES.printStackTrace();
        } // fin de catch
    } // fin del método ejecutarServidor

    // espera a que llegue una conexión, después muestra información sobre ésta
    public void esperarConexion(JTextArea txt) throws IOException {
        txt.append("Esperando una conexion\n");
        System.out.println("Esperando una conexion\n");
        obj.setConexion(obj.getServidor().accept()); // permite al servidor aceptar la conexión
        System.out.println("salio de la espera");
        txt.append("Conexion " + obj.getContador() + " recibida de: " + obj.getConexion().getInetAddress().getHostName());
        System.out.println("Conexion " + obj.getContador() + " recibida de: " + obj.getConexion().getInetAddress().getHostName());
    } // fin del método esperarConexion

    // obtiene flujos para enviar y recibir datos
    public void obtenerFlujos(JTextArea txt) throws IOException {
        // establece el flujo de salida para los objetos
        obj.setSalida(new ObjectOutputStream(obj.getConexion().getOutputStream()));
        obj.getSalida().flush(); // vacía el búfer de salida para enviar información del encabezado

        // establece el flujo de entrada para los objetos
        obj.setEntrada(new ObjectInputStream(obj.getConexion().getInputStream()));
        System.out.println("\nSe obtuvieron los flujos de E/S\n");
        txt.append("\nSe obtuvieron los flujos de E/S\n");
    } // fin del método obtenerFlujos

    // procesa la conexión con el cliente
    public void procesarConexion(JTextArea txt) throws IOException {
        String mensaje = "Conexion exitosa";
        enviarDatos(mensaje, txt); // envía mensaje de conexión exitosa
        do // procesa los mensajes enviados desde el cliente
        {
            try // lee el mensaje y lo muestra en pantalla
            {
                mensaje = (String) obj.getEntrada().readObject(); // lee el nuevo mensaje
                txt.append("\n" + mensaje); // muestra el mensaje
                if (!mensaje.equals("CLIENTE>>> TERMINAR")) {
                    System.out.println(mensaje);
                    Scanner entrada = new Scanner(System.in);
                    String respuesta = "";
                    respuesta = entrada.nextLine();
                    obj.getSalida().writeObject("SERVIDOR>>> " + respuesta);
                }
            } catch (ClassNotFoundException excepcionClaseNoEncontrada) {
                txt.append("\nSe recibio un tipo de objeto desconocido");

            } // fin de catch
        } while (!mensaje.equals("CLIENTE>>> TERMINAR"));
    } // fin del método procesarConexion

    // cierra flujos y socket
    public void cerrarConexion(JTextArea txt) {
        txt.append("\nTerminando conexion\n");
        System.out.println("\nTerminando conexion\n");
        try {
            obj.getSalida().close(); // cierra flujo de salida
            obj.getEntrada().close(); // cierra flujo de entrada
            obj.getConexion().close(); // cierra el socket

        } catch (IOException exepcionES) {
            exepcionES.printStackTrace();
        }
// fin de catch
    } // fin del método cerrarConexion// fin de try

    // envía el mensaje al cliente
    public void enviarDatos(String mensaje, JTextArea txt) {
        try {
            obj.getSalida().writeObject("SERVIDOR>>> " + mensaje);
            txt.append("\nSERVIDOR>>> " + mensaje);
            obj.getSalida().flush(); // envía toda la salida al cliente

        } catch (IOException exepcionES) {
            txt.append("\nError al escribir objeto");
        } // fin de catch
    } // fin del método enviarDatos

}
