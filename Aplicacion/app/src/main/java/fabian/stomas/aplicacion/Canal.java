package fabian.stomas.aplicacion;

import java.util.ArrayList;

public class Canal {
    int Id;
    String Nombre;
    String Descripcion;
    String Tipo_canal;
    ArrayList<Usuario> usuariosCanal;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getTipo_canal() {
        return Tipo_canal;
    }

    public void setTipo_canal(String tipo_canal) {
        Tipo_canal = tipo_canal;
    }

    public ArrayList<Usuario> getUsuariosCanal() {
        return usuariosCanal;
    }

    public void setUsuariosCanal(ArrayList<Usuario> usuariosCanal) {
        this.usuariosCanal = usuariosCanal;
    }
}
