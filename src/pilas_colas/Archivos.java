/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas_colas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author yulie
 */
public class Archivos {
    


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
            Cliente jj = new Cliente(datos[0], datos[1], Integer.parseInt(datos[2]), Integer.parseInt(datos[3]));
            plis.Insertar(jj);
        }
    }


}

    
    

