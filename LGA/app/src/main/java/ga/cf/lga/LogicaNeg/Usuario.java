package ga.cf.lga.LogicaNeg;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String nombreUsuario;
    private String pass;


    public Usuario() {
        this.pass = "none";
        this.nombreUsuario = "none";
    }

    public Usuario(String nombre, String pass) {
        this.nombreUsuario=nombre;
        this.pass = pass;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


}
