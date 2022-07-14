/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas_colas;

/**
 *
 * @author yulie
 */
public class pila {

    nodoP cima;
    
    int size;

    boolean isEmpty() {
        return cima == null;
    }

    nodoP pop() {
        if (!isEmpty()) {
            nodoP temporal = new nodoP();
            temporal.bola = this.cima.bola;
            this.cima = this.cima.sig;
            return temporal;
        }
        System.out.println("No hay bolas de helado");
        return null;
    }

    void vaciarPila() {// vaciar pila
        while (!isEmpty()) {
            pop();
        }
    }

    void push(String b) {
        if (this.isEmpty()) {
            cima = new nodoP(b, cima);
            size++;
        }
    }
    
    void pushHelado(String saborH, int numSabor, int muntop, String toph) {
        if (this.isEmpty()) {
            cima = new nodoP(saborH, numSabor,muntop,toph, cima);
            size++;
        }
    }
    

    void Mostrar_pila() {

        nodoP clone = new nodoP();
        clone = cima;
        while (clone.sig != null) {

            System.out.println(clone.bola);
            clone = clone.sig;
        }

    }
    
    

}
