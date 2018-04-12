/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.util.ArrayList;

/**
 *
 * @author hca
 */
public class Colas {

    public static<T> void invierteElementos(ColaADT<T> cola){
        ArrayList<T> auxiliar;
        int i;
        
        try{
            auxiliar = new ArrayList();
            while(!cola.isEmpty())
                auxiliar.add(cola.revome());
            for()
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
