/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Carlos
 */
public class Archivo implements Serializable{
    private double size;
    private String name;
    private String owner;
    private String date;

    public Archivo(double size, String name, String owner, String date) {
        this.size = size;
        this.name = name;
        this.owner = owner;
        this.date = date;
    }

    public Archivo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public String getOwner() {
        return owner;
    }

    public String getDate() {
        return date;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Archivo other = (Archivo) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.owner, other.owner)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Archivo:\n" + "size = " + size + "\nname = " + name + "\nowner "
                + "= " + owner + "\ndate = " + date;
    }
    
}
