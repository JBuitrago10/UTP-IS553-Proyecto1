/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author 
 */ 
public class Main {
    
     public static ArrayList<Contacto> AgendaContactos = new ArrayList<>();
     
     public static void main(String[] args) {
        // TODO code application logic here
        Directorio grafico = new Directorio();
        grafico.setVisible(true);
        
    }
    
     public static Contacto buscarNombre(String nombre){  
         for(Contacto c: AgendaContactos){
             if (c.getNombre().equals(nombre)){   
                 return c;
             }
         }
         
         return null;
     }
     
     public static void agregarContacto(String nombre, ArrayList<String> numeros,
                                            String correo, String direccion, String alias, int index){
         
         Contacto c = new Contacto(nombre,numeros,correo,direccion,alias);
         c.setIndice(index);
         AgendaContactos.add(c);
     }
     
     public static Contacto buscarIndex(int indice){
         for(Contacto a : AgendaContactos){
             if(a.getIndice() == indice){
                 return a;
             }
         }
         return null;
     }
     
     public static Contacto buscarTelefono(String telefono){
         for(Contacto c : AgendaContactos){
             for(String numero : c.getTelefonos()){
                 if(numero.equals(telefono)){
                     return c;
                 }
             }
         }
         return null;
     }
     
     public static Contacto buscarTelefono(ArrayList<String> telefono){
         Contacto c;
         for(String tel : telefono){
             c = buscarTelefono(tel);
             if(c != null){
                 return c;
             }
         }
         return null;
     }
   
    public static Contacto buscarCorreo(String correo){  
         for(Contacto c: AgendaContactos){
             if (c.getCorreo().equals(correo)){   
                 return c;
             }
         }
         
         return null;
     }
    
    public static Contacto buscarDireccion(String direccion){  
         for(Contacto c: AgendaContactos){
             if (c.getDireccion().equals(direccion)){   
                 return c;
             }
         }
         return null;
     }
    
    public static Contacto buscarAlias(String alias){  
         for(Contacto c: AgendaContactos){
             if (c.getAlias().equals(alias)){   
                 return c;
             }
         }
         return null;
     }
    
    public static ArrayList<String> separar(String cadena){
        ArrayList<String> telefono = new ArrayList<>();
        cadena = cadena + ",";
        String newCadena="";
        for(int i=0; i < cadena.length(); i++){  
            if(cadena.charAt(i)!=','){
                newCadena = newCadena + cadena.charAt(i);
            }else{
                telefono.add(newCadena);
                newCadena = "";
            }
        }
        return telefono;
    }
    
    public static String obtenerContacto(Contacto c){
        String guardar="";
        
        guardar =guardar + c.getNombre() +";";
        
        for(String tel : c.getTelefonos()){
            guardar = guardar + tel + ",";
        }
        guardar = guardar.substring(0, guardar.length()-1);
        guardar = guardar + ";" + c.getCorreo() + ";";
        guardar = guardar + c.getDireccion() + ";";
        guardar = guardar + c.getAlias() + "\n";
        
        return guardar;
    }
    
    public static void guardarTxt(){
        try {
            String ruta = "agenda.txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(Contacto c : AgendaContactos){
                bw.write(obtenerContacto(c));
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static String ListtoString(ArrayList<String> telefonos){
        String resultado = "";
        for(String s : telefonos){
            resultado = resultado + s + ",";
        }
        
        resultado = resultado.substring(0, resultado.length()-1);
        
        return resultado;
    }
    
    public static void eliminarUsuario(int index){
        System.out.println(index);
        for(Contacto c : AgendaContactos){
            if(c.getIndice() == index){
                AgendaContactos.remove(c);   
            }
        }
    }
}
