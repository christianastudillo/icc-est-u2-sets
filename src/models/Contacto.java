package models;

import java.util.Objects;

public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;

    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false; 
                
        Contacto other = (Contacto) obj;
        return nombre.equals(other.nombre) && apellido.equals(other.apellido);
        
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, telefono);
    }

    @Override
    public String toString() {
        return nombre+" "+apellido+" -> ("+telefono+")";
    }

    

    
}
