
package socketsobjectsstreams;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * 
 * @author dordonez@ute.edu.ec
 */
public class MainClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8888);
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
                        
            Mensaje msg = (Mensaje) in.readObject();
            System.out.println("Mensaje recibido desde el Server:");
            System.out.println(msg);
            
            msg = new Mensaje(222, "Respuesta desde el cliente", 2.333);
            
            out.writeObject(msg);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
