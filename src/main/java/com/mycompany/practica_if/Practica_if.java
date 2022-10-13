/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica_if;

/**
 *
 * @author CP-16
 */
public class Practica_if {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
    
        
         var auto1 = new Auto ();
         var auto2 = new Auto ();
         var auto3 = new Auto ();
         var auto4 = new Auto ();
         var auto5 = new Auto ();
         
        auto1.marca = "Toyota";
        auto1.placa = "ADL-207";
        auto1.nombrePropietario = "Karla";
        
        auto2.marca = "Chevrolet";        
        auto2.placa = "ABL-307";
        auto2.nombrePropietario = "Pedro";
        
         auto3.marca = "Jettour";        
        auto3.placa = "EVL-307";
        auto3.nombrePropietario = "Andres";
        
        auto4.marca = "Audi";        
        auto4.placa = "TUB-847";
        auto4.nombrePropietario = "Juan";
        
        auto5.marca = "Lada";        
        auto5.placa = "DHY-577";
        auto5.nombrePropietario = "Raul";
  
        System.out.println(auto2.mostrarInfo());
        System.out.println("El pais de de origen es "+auto2.getPaisMarca());
        
        System.out.println(auto1.mostrarInfo());
        System.out.println("El pais de de origen es "+auto1.getPaisMarca());
        
        System.out.println(auto3.mostrarInfo());
        System.out.println("El pais de de origen es "+auto3.getPaisMarca());
        
        System.out.println(auto4.mostrarInfo());
        System.out.println("El pais de de origen es "+auto4.getPaisMarca());
        
        System.out.println(auto5.mostrarInfo());
        System.out.println("el pais de de origen es "+auto5.getPaisMarca());
       
    }
        
    }

