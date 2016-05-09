
package socketsobjectsstreams;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author dordonez@ute.edu.ec
 */
public class MainServer {

    public static void main(String[] args) {
        try {
            System.out.println("Server esperando clientes");
            
            ServerSocket server = new ServerSocket(8888);
            Socket socket = server.accept();
            
            System.out.println("Cliente conectado");
            
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());            
            
            Mensaje msg = new Mensaje(1, "Hola desde el Server", 0.001);
            
            out.writeObject(msg);

            msg = (Mensaje) in.readObject();

            System.out.println("Mensaje recibido desde el Client:");
            System.out.println(msg);

        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
    
}
