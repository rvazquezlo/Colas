/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import estructurasenlzadas.Nodo;

/**
 *
 * @author Regina
 */
public class ColaEE2 <T> implements ColaADT<T>{
    Nodo<T> primero;
    Nodo<T> ultimo;
    
    public ColaEE2(){
        primero = null;
        ultimo = null;
    }
    
    public boolean isEmpty(){
        return primero == null;
    }

    @Override
    public void add(T dato) {
        Nodo<T> nuevo;
        
        nuevo = new Nodo(dato);
        if(!isEmpty())
            ultimo.setDireccion(nuevo);
        else{
            primero = nuevo;
        }
        ultimo = nuevo;
    }

    @Override
    public T remove() {
        T removed;
        Nodo<T> auxiliar;
        
        removed = null;
        if(!isEmpty()){
            removed = primero.getDato();
            if(primero.getDireccion() == null){
                ultimo = null;
                primero = null;
            }
            else{
                auxiliar = primero;
                primero.setDireccion(primero.getDireccion());
                auxiliar.setDireccion(null);
            }
        }
        return removed;
    }

    @Override
    public T showNext() {
        T next;
        
        next = null;
        if(!isEmpty())
            next = primero.getDato();
        return next;
    }
    
    
}
