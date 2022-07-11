/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas_colas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Cliente{

    String Nombre;
    String Apellido;
    int Edad;
    int Monto; 

    public Cliente(String Nombre, String Apellido, int Edad, int Monto) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Monto = Monto;
    }
}




class Nodo {

    Cliente kk; 
    Nodo sig;

    public Nodo(Cliente kk, Nodo sig) {
        this.kk = kk;
        this.sig = sig;
    }

    

}

class cola {

    Nodo Principio;
    Nodo Resto;
    Nodo aux; 

    cola tem;

    boolean ChequeoVacia() {
        return Principio == null;

    }

    void Insertar(Cliente a) {

        Nodo Nuevo = new Nodo(a,null);

        if (ChequeoVacia()) {
            Principio = Nuevo;
            Resto = Principio;
        }else{
            Resto.sig = Nuevo; 
            Resto = Resto.sig;
        }
    }
    
    Nodo Eliminar(){
    
        aux = Principio; 
        
        if (ChequeoVacia()) {
             
            System.out.println("Cola vacia");
            return null;
        }
        Principio = Principio.sig;
        return aux; 
    }
    
    void Mostrar(){
        
        aux = Principio; 
        
        while(aux != null){
            System.out.println("El dato es "+ aux.kk.Nombre);
            aux = aux.sig;
        }
    }
    
    
    void RevertirCola(){
        aux = Principio;
        while(aux.sig != null){
           // tem.Insertar(aux.Dato);
        } 
    
    
    
    }
    
    
    

}

class Archivos {

    PrintWriter pf;
    FileReader fr;
    Nodo pri;

    void crear(String pNombre, String pDatos) throws IOException {
        pf = new PrintWriter(new FileWriter(pNombre, true));
        pf.println(pDatos);
        pf.close();
        System.out.println("Generacion ok");

    }

    void LeerCliente(String pNombre, cola plis) throws IOException {
        fr = new FileReader(pNombre);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split("//");
            Cliente jj = new Cliente(datos[0],datos[1],Integer.parseInt(datos[2]),Integer.parseInt(datos[3]));
            plis.Insertar(jj);
        }
    }

}
class nodoP{
    String bola;
    nodoP sig;
    nodoP(){     
    }
    nodoP(String b,nodoP x){
        this.bola=b;
        this.sig=x;
    }
}
class pila{
    nodoP cima;
    pila aux;
    int size;
    boolean isEmpty(){
        return cima==null;
    }
 
     nodoP pop(){
        if(!isEmpty()){
         nodoP temporal = new nodoP();
         temporal.bola=this.cima.bola;
         this.cima=this.cima.sig;
         return temporal;
     }
         System.out.println("No hay bolas de helado");    
         return null;
    }     
     void vaciarPila(){//vaciar pila
        while(!isEmpty()){
            pop();
        }
    }

    void push(String b) {
    if(this.isEmpty()){
       cima=new nodoP(b,cima);
       size++;
    }
  }
}
public class Pilas_colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        Archivos oo = new Archivos();
        cola ll = new cola();
        
        oo.LeerCliente("Clientes.in", ll);
        
        ll.Mostrar();
        
        int opc=0;
        String sabor=null;
        pila pil=new pila();
        do{
            try{
                System.out.println("Opciones\n 1.Barquilla\n 2.Toppings\n" //Recordar limpiar antes del proximo pedido
                         +" 3.Facturar\n 4.Limpiar\n 5.Salir\n ");
                opc=sc.nextInt();
                switch(opc){
                    case 1:
                        System.out.println("Elija el sabor del helado");
                        System.out.println(" Chocolate\n Mantecado\n Mora\n Fresa\n"
                                +" Kiwi\n Parchita");
                        sabor=sc.next();
                        pil.push(sabor);
                        break;
                    case 2:
                        System.out.println("Elija el topping");
                        System.out.println(" Sirope Chocolate\n Sirope Fresa\n Sirope Caramelo\n"
                                +" Arequipe\n Nutella\n Cereal\n Galletas\n");
                        sabor=sc.next();
                        pil.push(sabor);
                        break;
                    case 3:
                        
                         
                        break;
                    case 4:
                        if(!pil.isEmpty()){
                            pil.vaciarPila();
                        }else{
                            System.out.println("Limpio, ya puede generar otro pedido");
                        }
                        break;
                    default: System.out.println("Ha salido del sistema");
                }
            }catch(NumberFormatException n){
        	
             }    
        }while(opc!=5);
    }
}
