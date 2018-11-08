package com.company;

import java.util.Scanner;

public class Main {

    static int menuPrincipal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1- Añadir Producto");
        System.out.println("2- Pasar por caja");
        System.out.println("3- Mostrar Carrito");
        System.out.println("0- Salir");
        System.out.print("Que quieres hacer?: ");
        int op = sc.nextInt();
        sc.nextLine();
        return op;
    }

    static int menuProducte(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1- Añadir Alimento");
        System.out.println("2- Añadir Electronico");
        System.out.println("3- Añadir Textil");
        System.out.println("0- Salir");
        System.out.print("Que quieres hacer?: ");
        int OP = sc.nextInt();
        sc.nextLine();
        return OP;
    }

    public static void main(String[] args) {

        final String NOM_SUPERMERCAT = "NdeNayan";


        int op,OP;
        System.out.println("BENVINGUT AL " + NOM_SUPERMERCAT);
        do {
            op = menuPrincipal();
            switch(op) {
                case 1:
                    do {
                        OP = menuProducte();
                        switch (OP) {
                            case 1:
                                System.out.println("Afegir Aliment"); break;
                            case 2:
                                System.out.println("Afegir electronic"); break;
                            case 3:
                                System.out.println("Afegir Textil"); break;
                                default: break;
                        }
                    } while (OP!=0);
                    break;
                case 2:
                    System.out.println("Pasar por caja");break;
                case 3:
                    System.out.println("Carrito");break;
                case 0:
                    System.out.println("Gracias por tu visita");break;
                default:break;
            }
        }while (op!= 0);
    }
}
