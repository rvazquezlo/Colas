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
public class Documento extends Archivo{
    private String tipoProcesador;

    public Documento() {
    }

    public Documento(String tipoProcesador, double size, String name, String owner, String date) {
        super(size, name, owner, date);
        this.tipoProcesador = tipoProcesador;
    }

    public String getTipoProcesador() {
        return tipoProcesador;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDocumento" + "\n\ttipoProcesador = " + tipoProcesador;
    }
    
    
}
