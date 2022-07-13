/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas_colas;

import java.io.IOException;


public class Pilas_colas {


    
    
    public static void main(String[] args) throws IOException {

        Archivos oo = new Archivos();
        cola ll = new cola();

        oo.LeerCliente("Clientes.in", ll);

        ll.Mostrar();
    }

}
