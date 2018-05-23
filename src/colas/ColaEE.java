/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import estructurasenlzadas.LinkedList;
import java.util.Iterator;

/**
 *
 * @author Regina Vazquez
 */
public class ColaEE <T> implements ColaADT<T>{
    LinkedList<T> cola;
    
    public ColaEE(){
        cola = new LinkedList();
    }
    
    public boolean isEmpty(){
        return cola.isEmpty();
    }
    
    public void add(T dato){
        if(dato != null)
            cola.addHead(dato);
    }
    
    public T remove(){
        return cola.removeLast();
    }
    
    public T showNext(){
        Iterator <T> iterador;
        T next;
        
        iterador = cola.iterator();
        next = null;
        while(iterador.hasNext())
            next = iterador.next();
        return next;
    }
}
