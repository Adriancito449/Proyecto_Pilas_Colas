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

    public nodoP(String SaborHelado, int CantidadSabor, int CantidadToping, String TopinHelado, nodoP sig) {
        this.SaborHelado = SaborHelado;
        this.CantidadSabor = CantidadSabor;
        this.CantidadToping = CantidadToping;
        this.TopinHelado = TopinHelado;
        this.sig = sig;
    }
    
    String bola;
    String SaborHelado;
    int CantidadSabor; 
    int CantidadToping; 
    String TopinHelado; 
    nodoP sig;


    nodoP(String b, nodoP x) {
        this.bola = b;
        this.sig = x;
    }
    
    nodoP(){}
    
}
