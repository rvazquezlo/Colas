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
        ColaADT<T> auxiliar;
        T elementoPasado, elemento;
        
        try{
            if(!cola.isEmpty()){
                auxiliar = new ColaA<>();
                elementoPasado = cola.remove();
                auxiliar.add(elementoPasado);
                while(!cola.isEmpty()){
                    elemento = cola.remove();
                    if(!elemento.equals(elementoPasado)){
                        elementoPasado = elemento                                                                                                                                         ;
                        auxiliar.add(elementoPasado);
                    }
                }
                while(!auxiliar.isEmpty())
                    cola.add(auxiliar.remove());
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
        ColaADT<T> auxiliar;
        T elementoEvaluado;
        
        try{
            if(!cola.isEmpty()){
                auxiliar = new ColaA<>();
                while(!cola.isEmpty()){
                    elementoEvaluado = cola.remove();
                    if(!elementoEvaluado.equals(elemento))
                        auxiliar.add(elementoEvaluado);
                }
                while(!auxiliar.isEmpty())
                    cola.add(auxiliar.remove());
            }
            
        }catch(NullPointerException e){
            
        }
    }
    
    public static<T> String toString(ColaADT<T> cola){
        ColaADT<T> auxiliar;
        StringBuilder sb;
        T elemento;
        String cadena;

        auxiliar = new ColaA<>();
        sb = new StringBuilder();
        try{
            while(!cola.isEmpty()){
                elemento = cola.remove();
                sb.append(elemento + "   ");
                auxiliar.add(elemento);
            }
            while(!auxiliar.isEmpty())
                cola.add(auxiliar.remove());
            cadena = sb.toString();
        }catch(NullPointerException e){
            cadena = null;
        }
        return cadena;    
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColaA<Integer> cola;
        
        cola = new ColaA<>();
        
        cola.add(3);
        for(int i = 0; i < 21; i++){
            cola.add(i);
        }
        cola.add(20);
        cola.add(20);
        cola.add(20);
        cola.add(3);
        
        System.out.println("cola original: " + toString(cola));
        invierteElementos(cola);
        System.out.println("cola invertida: " + toString(cola));
        quitaRepetidos(cola);
        System.out.println("cola sin repetidos: " + toString(cola));
        eliminaRecurrenciasDe(3, cola);
        System.out.println("cola sin recurrencias de 3: " + toString(cola));
        
        
  
    }
    
}
