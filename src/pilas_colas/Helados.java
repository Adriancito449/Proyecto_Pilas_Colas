/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas_colas;

import javax.swing.JOptionPane;

/**
 *
 * @author yulie
 */
public class Helados {

    pila sabores = new pila(); // pila para capturar los sabores
    pila Toping= new pila();    // pila para capturar los sabores

    int opcion = 0, opcionHelado = 0, opcionTopping = 0;    // Variables globales para el RellenarVarquilla() 
    int cantidadPorciones = 0, cantidadTopping = 0;     // Variables globales para calcular presios
    int cantidadPorcionesExtras = 0, cantidadToppingExtras = 0; // Variables globales para calcular presios
    int totalPagar = 0; // Variables globales para calcular presios

    void agregarSabor() {   // Funcion para agregar porsiones extras

        int op = 0, opHelado = 0, opTopping = 0; // variables locales de esta funcion 

        do {    // Menu Control de sabores extras
            op = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Desea algo mas? \n"
                    + "1. Agregar porcion de helado \n"
                    + "2. Agregar Topping \n"
                    + "3. Vista y Cierre"
            ));

            switch (op) {
                case 1: //Agregar porcion de helado 
                    if (cantidadPorciones >= 3) {
                        JOptionPane.showMessageDialog(null, "No puede agregar mas porciones");
                    } else {
                        do { // Mecanismo de control
                            opHelado = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Indique que sabor de helado desea \n"
                                    + "1. Chocolate \n"
                                    + "2. Mantecado \n"
                                    + "3. Fresa \n"
                                    + "4. Mora \n"
                                    + "5. Kiwi\n"
                                    + "6. Parchita"));

                        } while (opHelado != 1 && opHelado != 2 && opHelado != 3
                                && opHelado != 4 && opHelado != 5 && opHelado != 6);
                        sabores.push(saberSabor(opHelado)); // agregando sabores extras
                        cantidadPorcionesExtras++; // costancia de porsiones extras
                    }

                    break;
                case 2:     // Agregar toping del helado
                    if (cantidadTopping >= 2) {
                        JOptionPane.showMessageDialog(null, "No puede agregar mas toppings");

                    } else {
                        do {    //Mecanismo de control
                            opTopping = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Indique el Topping que quiera \n"
                                    + "1. Sirope Chocolate \n"
                                    + "2. Sirope de fresa \n"
                                    + "3. Sirope de caramelo \n"
                                    + "4. Arequipe \n"
                                    + "5. Nutella\n"
                                    + "6. Cereales \n"
                                    + "7.Galletas"));
                        } while (opTopping != 1 && opTopping != 2 && opTopping != 3
                                && opTopping != 4 && opTopping != 5 && opTopping != 6
                                && opTopping != 7);
                        Toping.push(saberTopping(opTopping)); // Agregando a la pila de Toping
                        cantidadToppingExtras++;    // Sumando topins extras
                    }

                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "El total a pagar es: "
                            + PrecioFinal(totalPagar) + "$"
                    );
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Gracias por comprar aqui");
                    break;
            }
        } while (op != 3);

    }

    void RellenarVarquilla() {
        // motor Principal para las varquillas 
        JOptionPane.showMessageDialog(null, "Bienvenido a la heladeria nice cream");
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Bienvenido, que desea? \n\n"
                + "1. Comprar una barquilla \n\n"
                + "2. salir\n"
        ));

        switch (opcion) {
            case 1:     //Comprar varquilla
                do {    // Mecanismo de control
                    opcionHelado = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Indique que sabor de helado que desea \n"
                            + "1. Chocolate \n"
                            + "2. Mantecado \n"
                            + "3. Fresa \n"
                            + "4. Mora \n"
                            + "5. Kiwi\n"
                            + "6. Parchita"));

                } while (opcionHelado != 1 && opcionHelado != 2 && opcionHelado != 3
                        && opcionHelado != 4 && opcionHelado != 5 && opcionHelado != 6);

                sabores.push(saberSabor(opcionHelado)); //Agrego los sabores 
                cantidadPorciones++;    // para el calculo total
                do {    // Mecanismo de Control del Toping
                    opcionTopping = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Indique el Topping que quiera \n"
                            + "1. Sirope Chocolate \n"
                            + "2. Sirope de fresa \n"
                            + "3. Sirope de caramelo \n"
                            + "4. Arequipe \n"
                            + "5. Nutella\n"
                            + "6. Cereales \n"
                            + "7.Galletas"));
                } while (opcionTopping != 1 && opcionTopping != 2 && opcionTopping != 3
                        && opcionTopping != 4 && opcionTopping != 5 && opcionTopping != 6
                        && opcionTopping != 7);
                Toping.push(saberTopping(opcionTopping));   //Agrepo el topin a la pila 
                cantidadTopping++;  // para el caluculo Final
                agregarSabor();     // para agregar los sabores o toping extras
                break;
            case 2:
                opcion = 2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Vuelva pronto");
                break;
        }

    }

    String saberSabor(int numero) {
        String saborHelado = "";
        if (numero == 1) {
            saborHelado = "Chocolate";
        } else if (numero == 2) {
            saborHelado = "Mantecado";
        } else if (numero == 3) {
            saborHelado = "Fresa";
        } else if (numero == 4) {
            saborHelado = "Mora";
        } else if (numero == 5) {
            saborHelado = "Kiwi";
        } else if (numero == 6) {
            saborHelado = "Parchita";
        }
        return saborHelado;
    }

    String saberTopping(int numero) {
        String saborTopping = "";
        if (numero == 1) {
            saborTopping = "Sirope de chocolate";
        } else if (numero == 2) {
            saborTopping = "Sirope de fresa";
        } else if (numero == 3) {
            saborTopping = "Sirope de caramelo";
        } else if (numero == 4) {
            saborTopping = "Arequipe";
        } else if (numero == 5) {
            saborTopping = "Nutella";
        } else if (numero == 6) {
            saborTopping = "Cereales";
        } else if (numero == 7) {
            saborTopping = "Galletas";
        }
        return saborTopping;
    }

    int PrecioFinal(int a) {

        a = cantidadPorciones + cantidadTopping + cantidadPorcionesExtras + cantidadToppingExtras;
        return a;
    }

}
