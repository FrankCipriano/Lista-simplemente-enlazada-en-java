/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listasimplementeenlazadas;

/**
 *
 * @author frankdev
 */
public class Nodo {
    public int edad;
    public Nodo siguiente;//NODO PUNTERO
    
    //CONSTRUCTOR PARA INSERTAR AL FINAL DE LA LISTA
    public Nodo(int edad){
        this.edad=edad;
        this.siguiente=null;
    }
    
    //CONSTRUCTOR PARA INSERTAR AL INICIO DE LA LISTA
    public Nodo(int edad,Nodo inicio){
        this.edad=edad;
        this.siguiente=inicio;
    }
}
