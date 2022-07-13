/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas_colas;



public class Nodo {
    

    
    Helados bb; // Para cada cliente tiene una varquilla en la cola 
    Cliente kk; // Para cargar los clientes desde el fichero
    Nodo sig;   // Para hacerlo tipo cola

    public Nodo(Cliente kk, Nodo sig) { // lo optimizo pasandolo mas rapido cuando lo llamo desde un fichero
        this.kk = kk;
        this.sig = sig;
    }

    
    


}
