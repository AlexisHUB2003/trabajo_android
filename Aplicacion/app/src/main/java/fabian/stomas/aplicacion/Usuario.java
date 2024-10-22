package fabian.stomas.aplicacion;

import java.util.ArrayList;

public class Usuario {
    int ID;
    String Nombre;
    String Apellido;
    String Telefono;
    String Correo;
    String Pass;
    ArrayList<Integer> amigos;
    ArrayList<Integer> canales;

    public Usuario(){

    }

    public Usuario(int ID, String Nombre, String Apellido, String Telefono, String Correo, String Pass) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Pass = Pass;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public ArrayList<Integer> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Integer> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Integer> getCanales() {
        return canales;
    }

    public void setCanales(ArrayList<Integer> canales) {
        this.canales = canales;
    }
}











