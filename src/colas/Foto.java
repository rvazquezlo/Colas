/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author Carlos
 */
public class Foto extends Archivo{
    private double resolucion;

    public Foto() {
    }

    public Foto(double resolucion, double size, String name, String owner, String date) {
        super(size, name, owner, date);
        this.resolucion = resolucion;
    }

    public double getResolucion() {
        return resolucion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFoto" + "\n\tresolucion = " + resolucion;
    }
    
    
}
