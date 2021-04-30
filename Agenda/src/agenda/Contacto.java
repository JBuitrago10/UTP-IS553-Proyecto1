/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Contacto {
    private String nombre;
    private ArrayList<String> telefonos;
    private String correo;
    private String direccion;
    private String alias;
    private int indice;

    public Contacto(String nombre, ArrayList<String> telefonos, String correo, String direccion, String alias) {
        this.nombre = nombre;
        this.telefonos = telefonos;
        this.correo = correo;
        this.direccion = direccion;
        this.alias = alias;
        indice = -1;
    }

    

    public Contacto() {
        telefonos = new ArrayList<>();
        nombre = null;
        correo = null;
        direccion = null;
        alias = null;
        indice = -1;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setTelefonos(String tel){
        telefonos = Main.separar(tel);
    }
    
    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    public int getIndice() {
        return indice;
    }

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getAlias() {
        return alias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarTelefono(String tel) {
        telefonos.add(tel);
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
}
