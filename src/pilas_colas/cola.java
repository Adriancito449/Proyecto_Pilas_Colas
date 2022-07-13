/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    package pilas_colas;

/**
 *
 * @author yulie
 */
public class cola {
    
    



    Nodo Principio; // marca el inicion de la cola 
    Nodo Resto; // marca el resto 
    Nodo aux;   // Para hacer una copia del Nodo Principio
    cola tem;   // Para invertir la cola 

    boolean ChequeoVacia() {    // si esta vacia 
        return Principio == null;

    }

    void Insertar(Cliente a) {  

        Nodo Nuevo = new Nodo(a, null);

        if (ChequeoVacia()) {
            Principio = Nuevo;
            Resto = Principio;
        } else {
            Resto.sig = Nuevo;
            Resto = Resto.sig;
        }
    }

    Nodo Eliminar() {

        aux = Principio;

        if (ChequeoVacia()) {

            System.out.println("Cola vacia");
            return null;
        }
        Principio = Principio.sig;
        return aux;
    }

    void Mostrar() {

        aux = Principio;

        while (aux != null) {
            System.out.println("El dato es " + aux.kk.Nombre);
            aux = aux.sig;
        }
    }

    void RevertirCola() {
        aux = Principio;
        while (aux.sig != null) {
             tem.Insertar(aux.kk);
        }

    }


    
}
