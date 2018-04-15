/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import pilas.PilaA;

/**
 *
 * @author hca
 */
public class Colas {

    /**
     * Metodo que invierte elementos de una estructura tipo cola 
     * @param <T>
     * @param cola: cola generica 
     */
    public static<T> void invierteElementos(ColaADT<T> cola){
        PilaA<T> auxiliar;
        
        try{
            auxiliar = new PilaA<>();
            while(!cola.isEmpty())
                auxiliar.push(cola.remove());
            while(!auxiliar.isEmpty())
                cola.add(auxiliar.pop());
        }catch(NullPointerException e){
            
        }   
    }
    
    /**
     *Quita todos los elementos repetidos de una estructura tipo cola 
     *(si la cola tiene elementos repetidos, estos se encuentran en posiciones 
     * consecutivas)
     * @param <T>
     * @param cola: generica 
     */
    public static<T> void quitaRepetidos(ColaADT<T> cola){
        ColaADT<T> nuevaCola;
        T elementoPasado;
        
        try{
            if(!cola.isEmpty()){
                nuevaCola = new ColaA<>();
                nuevaCola.add(cola.remove());
                elementoPasado = nuevaCola.showPrimero();
                while(!cola.isEmpty()){
                    if(!cola.showPrimero().equals(elementoPasado)){
                        elementoPasado = cola.remove();
                        nuevaCola.add(elementoPasado);
                    }
                }
                cola = nuevaCola;
            }   
        }catch(NullPointerException e){
            
        }
    }
    
    /**
     * Metodo estetico que quita todas las ocurrencias de un cierto objeto de 
     * una estructura tipo cola. Es decir, dado un objeto, si se encuentra en la 
     * cola, se eliminan todas sus ocurrencias.
     * @param <T>: tipo de la cola
     * @param elemento: del que quiere que se eliminen todas las ocurrencias
     * @param cola 
     */
    public static<T> void eliminaRecurrenciasDe(T elemento, ColaADT<T> cola){
        ColaADT<T> nuevaCola;
        
        try{
            if(!cola.isEmpty()){
                nuevaCola = new ColaA<>();
                while(!cola.isEmpty()){
                    if(!cola.showPrimero().equals(elemento))
                        nuevaCola.add(cola.remove());
                }
                cola = nuevaCola;
            }
            
        }catch(NullPointerException e){
            
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
