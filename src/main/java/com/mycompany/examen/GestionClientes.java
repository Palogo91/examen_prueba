/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Paloma Lobo
 */
public class GestionClientes {
    
  
    private LinkedList<Cliente>filaClientes=new LinkedList<>();
    private ArrayList<Cliente>atendidos=new ArrayList<>();
    
    public void agregarCliente(Cliente cliente){
        filaClientes.add(cliente);
    }
    
    public void mostrarClientesEspera(){  
      //Primero miro si hay gente en la cola de clientes en espera, sino me sale un mensaje diciendo que no hay clientes aqui  
       if(!filaClientes.isEmpty()){ 
           System.out.println("CLIENTES EN ESPERA");
        //uso el for each para que me muestre cada cliente en una linea
        for(Cliente cliente:filaClientes){
            System.out.println(cliente.toString());
        }
       }else{
           System.out.println("No hay clientes en la cola de espera");
       } 
    }
    
    public void mostrarAtendidos(){   
     //Primero miro si hay clientes en la cola de atendidos, sino muestro un mensaje diciendo que la cola esta vacia 
      if(!atendidos.isEmpty()){  
           System.out.println("CLIENTES ATENDIDOS");
        for(Cliente cliente:atendidos){
            LocalDateTime fechaatendidos=cliente.getFecha();
            System.out.println(cliente + " fue atendido en la fecha: " + fechaatendidos);
        }
      }else{
          System.out.println("No hay ningun cliente atendido");
      }  
    } 
    
    
    public void mostrarAtendidos(String nombre){
        if(!atendidos.isEmpty()){
            for(Cliente cliente:atendidos){
               if(cliente.getNombre().equalsIgnoreCase(nombre)){
                   LocalDateTime fechaatendidos=cliente.getFecha();
                   System.out.println("CLIENTES ATENDIDOS");
                   System.out.println(cliente+ " fue atendido el dia: " + fechaatendidos);
               }else{
                   System.out.println("Ningun cliente atendido con ese nombre");
               }
            }
        }else{
            System.out.println("No hay clientes");
        }
        
    }
    
    public void atenderCliente(){
        LocalDateTime fechaatendidos;
        if(!filaClientes.isEmpty()){
           fechaatendidos=filaClientes.peek().getFecha();
           atendidos.add(filaClientes.poll()); //con el metodo add añado a la cola de atendidos, y con el poll saco de la fila de clientes
        }else{
            System.out.println("No quedan clientes por atender");
        }
    }
    
    public void atenderCliente(String nombre){
        if(!filaClientes.isEmpty()){
            for(Cliente cliente: filaClientes){
                if(cliente.getNombre().equalsIgnoreCase(nombre)){
                    atendidos.add(filaClientes.poll());
                }
                //le pongo el return para que cuando encuentre al cliente con ese nombre se salga del bucle
                return;
            }
        }
    }
    
    
}
