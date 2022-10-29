
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ramse
 */
public class Ejercicio2 {
    private int tamano;
    private int pos;
    private int leerarreglo;
    private int arreglo[];
    
    public Ejercicio2(int tamano){
        this.tamano=tamano;
        this.pos= pos;
        this.leerarreglo=leerarreglo;
        this.arreglo= new int [this.tamano];
        
    }
    public void rellenarArreglo(){
        for (int i=0;i<arreglo.length; i++){
            arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(""+ 
                    "Digite la edad"));
        }
    }
    
    public void imprimirArreglo(){
        for (int i = 0; i<arreglo.length; i++){
            System.out.println("Posicion: " + i + " valor: "+ arreglo [i]);
        }
    }
    public void buscarArreglo(){
        
        leerarreglo = Integer.parseInt(JOptionPane.showInputDialog(""+
                "Digite la edad que desea buscar: "));
    }    
    public void imprimirbusqueda(){
       int pos = -1;
       for (int i = 0; i<arreglo.length; i++){
            if (arreglo[i]==leerarreglo){
                pos=i;
            }
        }
        if (pos==-1){
            System.err.println ("No se encontro la edad");
            
        }else{
            System.out.println("La posicion de " + leerarreglo+" es:"+ pos);
        } 
    }   
}
