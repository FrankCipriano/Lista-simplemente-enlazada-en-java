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
public class Lista {
    //PUNTEROS PARA UBICAR EL INICIO Y EL FIN DE LA LISTA
    protected Nodo inicio,fin;
    
    //CONSTRUCTOR PARA INICIALIZAR LOS PUNTEROS
    public Lista(){
        inicio=null;
        fin=null;
    }
    
    //METODO PARA AGREGAR AL INICIO DE LA LISTA
    public void agregarAlInicio(int edad){
        //CREAR UN NUEVO NODO AL INICIO DE LA LISTA
        inicio = new Nodo(edad,inicio);
        if(fin==null){
            fin=inicio;
        }
    }
    
    //METODO PARA MOSTRAR LA LISTA ENLAZADA
    public void mostrarLista(){
        Nodo recorrer = inicio;
        while(recorrer!=null){
            System.out.print("["+recorrer.edad+"]-->");
            recorrer=recorrer.siguiente;
        }
        System.out.println(recorrer);
    }
    
    //METODO PARA REVISAR SI LA LISTA ESTA VACIA
    public boolean estaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    
    //METODO PARA AGREGAR AL FINAL DE LA LISTA
    public void agregarAlFinal(int edad){
        if(!estaVacia()){
            fin.siguiente = new Nodo(edad);
            fin=fin.siguiente;
        }else{
            fin=inicio = new Nodo(edad);
        }
    }
    
    //METODO PARA ELIMINAR UN NODO AL INICIO DE LA LISTA
    public int elimiarAlInicio(){
        int edad = inicio.edad;
        if(inicio==fin){
            inicio=fin=null;
        }else{
            inicio=inicio.siguiente;
        }
        return edad;
    }
    
    //METODO PARA ELIMINAR UN NODO AL FINAL DE LA LISTA
    public int eliminarAlFinal(){
        int edad = fin.edad;
        if(fin==inicio){
            inicio=fin=null;
        }else{
            Nodo auxiliar=inicio;
            while(auxiliar.siguiente!=fin){
                auxiliar=auxiliar.siguiente;
            }
            fin=auxiliar;
            fin.siguiente=null;
        }
        return edad;
    }
    //METODO PARA ELIMINAR UN NODO EN ESPECIFICO
    public boolean eliminarNodo(int edad){
        if(!estaVacia()){
           if(fin==inicio && edad==inicio.edad){
               inicio=fin=null;
           }else if(edad==inicio.edad){
               inicio=inicio.siguiente;
           }else{
               Nodo anterior,temporal;
               anterior=inicio;
               temporal=inicio.siguiente;
               while(temporal!=null && temporal.edad!=edad){
                   anterior=anterior.siguiente;
                   temporal=temporal.siguiente;
               }
               if(temporal!=null){
                   anterior.siguiente=temporal.siguiente;
                   if(temporal==fin){
                       fin=anterior;
                   }
               }else{
                   return false;
               }
           }
           return true;
        }else{
            return false;
        }
    }
}
