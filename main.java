
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ramse
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamano = Integer.parseInt(JOptionPane.showInputDialog(""+
                "Digite el tamaño del arreglo"));
        
       Ejercicio2 Ejercicio2 =new Ejercicio2(tamano);
       Ejercicio2.rellenarArreglo();
       Ejercicio2.imprimirArreglo();
       Ejercicio2.buscarArreglo();
       Ejercicio2.imprimirbusqueda();
    }
    
}
