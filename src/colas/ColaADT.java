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
public interface ColaADT<T> {
    void add(T dato);
    T remove();
    boolean isEmpty();
    T showPrimero();
    
}
