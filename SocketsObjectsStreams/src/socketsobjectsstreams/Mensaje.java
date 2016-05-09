
package socketsobjectsstreams;

import java.io.Serializable;

/**
 * 
 * @author dordonez@ute.edu.ec
 */
public class Mensaje implements Serializable {
    private int id;
    private String msg;
    private double codigo;

    public Mensaje() {}
    
    public Mensaje(int id, String msg, double codigo) {
        this.id = id;
        this.msg = msg;
        this.codigo = codigo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString() {
        return String.format("Id: %d\nMsg: %s\nCod: %f", getId(), getMsg(), getCodigo());
    }
    
}
