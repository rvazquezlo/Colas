/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Regina Vazquez
 */
public class EjecutableImpresora {
    
    
     public static void main(String[] args) throws IOException {
        Object obj; 
        Impresora printer;
        
        printer = new Impresora("hp");
        try(FileInputStream file = new FileInputStream ("Archivo.obj");
        ObjectInputStream lee = new ObjectInputStream(file);){
            obj = lee.readObject();
            while(obj != null){
                printer.nuevoArchivo((Archivo)obj);
                obj = lee.readObject();
            }
        } catch(IOException | ClassNotFoundException e){
            System.out.println(e.toString());
        }
    }
}
