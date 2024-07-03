/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen;


import java.util.Scanner;

/**
 *
 * @author Paloma Lobo
 */
public class Examen {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GestionClientes gc=new GestionClientes();
           
        int opcion;
        do{
        System.out.println("Seleccione la opcion que desee:");
        System.out.println("1. Agregar Cliente");
        System.out.println("2. Mostrar cliente en espera");
        System.out.println("3. Mostrar clientes atendidos");
        System.out.println("4. Atender Cliente");
        System.out.println("5. Salir");
        opcion=sc.nextInt();
        sc.nextLine();
        
        switch (opcion) {
            case 1: 
                String nombre;
                System.out.println("Dime el nombre del cliente que quieres añadir");
                nombre=sc.nextLine();
                gc.agregarCliente(new Cliente(nombre, null));
                break;
            case 2:
                gc.mostrarClientesEspera();
                break;
            case 3:
                    gc.mostrarAtendidos();
                break;
            case 4:
                gc.atenderCliente();
                break;
            case 5:
                System.out.println("Hasta pronto!");
                break;    
        }
        
       }while(opcion!=5);
        
    }
}
