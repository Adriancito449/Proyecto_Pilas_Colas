/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas_colas;

/**
 *
 * @author yulie
 */
public class Imprimir {
    
    
    

    cola todito = new cola();


    Nodo Copia = new Nodo(null,null);
    Helados Loshelados = new Helados();

    public Imprimir(cola a ) {
        todito = a ; 
        Copia = a.Principio;
        Loshelados = a.Principio.bb;
    }
    
    

    void Impresion() {
        
        System.out.println(" ");
        System.out.println(" ");
        int contadorHelados = 0;

        nodoP LosSabores = todito.Principio.bb.sabores.cima;
        nodoP LosToping = todito.Principio.bb.Toping.cima;
        nodoP aux1 = LosSabores;
        nodoP aux2 = LosToping;
        while (aux2 != null) {
            System.out.println("Sabores registrados: ");
            System.out.println(aux2.TopinHelado);
            aux2 = aux2.sig;
        }
        while (aux1 != null) {
            System.out.println("Sabores registrados: ");
            System.out.println(aux1.SaborHelado);
            aux1 = aux1.sig;
        }

        System.out.println("La cantidad de porsiones: " + Loshelados.cantidadPorciones);
        System.out.println("La cantidad de topping: " + Loshelados.cantidadTopping);
        System.out.println("La cantidad de porsiones extras: " + Loshelados.cantidadPorcionesExtras);
        System.out.println("La cantidad de topping extras: " + Loshelados.cantidadToppingExtras);
        System.out.println("El total a pagar: " + Loshelados.totalPagar);

    }

    void facturaCliente() {

        while (Copia != null) {

            Impresion();

            Copia = Copia.sig;
        }

    }

}
