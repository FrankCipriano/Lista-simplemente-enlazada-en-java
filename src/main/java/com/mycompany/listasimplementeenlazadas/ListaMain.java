/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listasimplementeenlazadas;
import javax.swing.JOptionPane;

/**
 *
 * @author frankdev
 */
public class ListaMain {
    public static void main(String args[]){
        int opcion,edad;
        Lista lista = new Lista();
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"-------LISTA DOBLEMENTE ENLAZADA--------\n"
                    + "1. Ingresar al inicio de la lista\n2. Agregar al final de la lista"
                    + "\n3. Mostrar la lista\n4. Eliminar un elemento al inicio de la lista"
                    + "\n5. Salir del programa\nSeleccione una opcion!.."));
            switch(opcion){
                case 1:
                    try{
                    edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese edad: "));
                    lista.agregarAlInicio(edad);
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"El dato ingresado no es numerico\n "+e.getMessage()
                                +"\nDato no registrado, Regresar al menu principal");
                    }
                    break;
                case 2:
                    try{
                    edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese edad: "));
                    lista.agregarAlFinal(edad);
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"El dato ingresado no es numerico\n "+e.getMessage()
                                +"\nDato no registrado, Regresar al menu principal");
                    }
                    break;
                case 3:
                    lista.mostrarLista();
                    break;
                case 4:
                    edad=lista.elimiarAlInicio();
                    JOptionPane.showMessageDialog(null,"El siguiente Dato: "+edad+" fue eliminado de la lista");
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }while(opcion!=5);
    }
}
