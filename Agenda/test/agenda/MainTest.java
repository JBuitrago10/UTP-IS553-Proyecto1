/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USER
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarNombre method, of class Main.
     */
    @Test
    public void testBuscarNombre() {
        System.out.println("buscarNombre");
        String nombre = "";
        Contacto expResult = null;
        Contacto result = Main.buscarNombre(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarContacto method, of class Main.
     */
    @Test
    public void testAgregarContacto() {
        System.out.println("agregarContacto");
        String nombre = "";
        ArrayList<String> numeros = null;
        String correo = "";
        String direccion = "";
        String alias = "";
        int index = 0;
        Main.agregarContacto(nombre, numeros, correo, direccion, alias, index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarIndex method, of class Main.
     */
    @Test
    public void testBuscarIndex() {
        System.out.println("buscarIndex");
        int indice = 0;
        Contacto expResult = null;
        Contacto result = Main.buscarIndex(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarTelefono method, of class Main.
     */
    @Test
    public void testBuscarTelefono_String() {
        System.out.println("buscarTelefono");
        String telefono = "";
        Contacto expResult = null;
        Contacto result = Main.buscarTelefono(telefono);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarTelefono method, of class Main.
     */
    @Test
    public void testBuscarTelefono_ArrayList() {
        System.out.println("buscarTelefono");
        ArrayList<String> telefono = null;
        Contacto expResult = null;
        Contacto result = Main.buscarTelefono(telefono);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCorreo method, of class Main.
     */
    @Test
    public void testBuscarCorreo() {
        System.out.println("buscarCorreo");
        String correo = "";
        Contacto expResult = null;
        Contacto result = Main.buscarCorreo(correo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarDireccion method, of class Main.
     */
    @Test
    public void testBuscarDireccion() {
        System.out.println("buscarDireccion");
        String direccion = "";
        Contacto expResult = null;
        Contacto result = Main.buscarDireccion(direccion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarAlias method, of class Main.
     */
    @Test
    public void testBuscarAlias() {
        System.out.println("buscarAlias");
        String alias = "";
        Contacto expResult = null;
        Contacto result = Main.buscarAlias(alias);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of separar method, of class Main.
     */
    @Test
    public void testSeparar() {
        System.out.println("separar");
        String cadena = "";
        ArrayList<String> expResult = null;
        ArrayList<String> result = Main.separar(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerContacto method, of class Main.
     */
    @Test
    public void testObtenerContacto() {
        System.out.println("obtenerContacto");
        Contacto c = null;
        String expResult = "";
        String result = Main.obtenerContacto(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarTxt method, of class Main.
     */
    @Test
    public void testGuardarTxt() {
        System.out.println("guardarTxt");
        Main.guardarTxt();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ListtoString method, of class Main.
     */
    @Test
    public void testListtoString() {
        System.out.println("ListtoString");
        ArrayList<String> telefonos = null;
        String expResult = "";
        String result = Main.ListtoString(telefonos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarUsuario method, of class Main.
     */
    @Test
    public void testEliminarUsuario() {
        System.out.println("eliminarUsuario");
        int index = 0;
        Main.eliminarUsuario(index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
