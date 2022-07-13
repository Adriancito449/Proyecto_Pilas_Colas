/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas_colas;

/**
 *
 * @author yulie
 */
public class nodoP {
    
    String bola;
    nodoP sig;

    nodoP() {
    }

    nodoP(String b, nodoP x) {
        this.bola = b;
        this.sig = x;
    }
    
}
