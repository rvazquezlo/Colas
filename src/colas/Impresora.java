/*
 * Inicialmente se leen de un archivo un conjunto de archivos que deben ser
 * impresos. Pueden ser documentos o fotos. Los archivos se encolan en el orden 
 * en el cual se leen.
 * 2) Llega un nuevo archivo para ser impreso. Debe agregarse a la cola.
 * 3) La impresora se desocupó, debe imprimir el siguiente archivo.
 * 4) Eliminar todas las fotos de la cola de impresión.
 * 5) Eliminar todos los documentos cuyo tamaño sea mayor a 500 (KB).
 */
package colas;

/**
 *
 * @author Carlos
 */
public class Impresora {
    private String marca;
    private ColaA<Archivo> pendientes;

    public Impresora(String marca) {
        this.marca = marca;
        pendientes = new ColaA<>();   
    }
    
    public void nuevoArchivo(Archivo nuevoArchivo){
        pendientes.add(nuevoArchivo);
    }
    
    public String imprime(){
        String operacion;
        
        if(!pendientes.isEmpty())
            operacion = pendientes.remove().getName() + " impreso.";
        else
            operacion = "Ya no hay archivos por imprimir";
        return operacion;
    }
    
    public void eliminaFotos(){
        ColaA<Archivo> pendientesSinFotos;
        Archivo siguienteArchivo;
        
        pendientesSinFotos =  new ColaA<>();
        while(!pendientes.isEmpty()){
            siguienteArchivo = pendientes.remove();
            if(!(siguienteArchivo instanceof Foto))
                pendientesSinFotos.add(siguienteArchivo); 
        }
        pendientes = pendientesSinFotos;
        
    }
    
    public void eliminaArchivosMayores500KB(){
        ColaA<Archivo> pendientesNuevos;
        Archivo siguienteArchivo;
        
        pendientesNuevos =  new ColaA<>();
        while(!pendientes.isEmpty()){
            siguienteArchivo = pendientes.remove();
            if(siguienteArchivo.getSize() <= 500){
                pendientesNuevos.add(siguienteArchivo); 
            }       
        }
        pendientes = pendientesNuevos;   
    }
    
    
    
}
