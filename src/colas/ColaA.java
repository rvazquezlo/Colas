/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author hca
 */
public class ColaA<T> implements ColaADT<T> {
    private int inicio;
    private int fin;
    private T coleccion[];
    private final int MAX_COLA = 20;
    
    public ColaA(){
        coleccion = (T[])new Object[MAX_COLA];
        inicio = -1;//porquer no tengo nada
        fin = -1;
    }
    
    public ColaA(int longitud){
        coleccion = (T[])new Object[longitud];
        inicio = -1;
        fin = -1;
    }

    @Override
    public void add(T dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T revome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        return inicio == -1;
    }

    @Override
    public T showPrimero() {
        T object;
        if(!isEmpty())
            object = coleccion[inicio];
        else
            object = null;
        return object;
    }
    
    
}
