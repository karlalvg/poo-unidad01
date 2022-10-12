/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_if;

/**
 *
 * @author CP-16
 */
public class Auto {
    String placa;
    String marca;
    String nombrePropietario;
    public String mostrarInfo(){
        var retorno="El auto tiene placa: "+this.placa+" es marca: "+this.marca+" el propietario es:  "+this.nombrePropietario;
        
        return retorno;          
    }
    public String getProvincia(){
        var retorno="";
        
        return retorno;          
    }
    public String getPaisMarca(){
        var retorno="";
        if(this.marca.equals("Chevrolet")){
        retorno="EEUU";
        }
        else {
            if (this.marca.equals("Toyota")) {
             retorno="Japon";   
            }
            else {
                if (this.marca.equals("Jettour")) {
             retorno="Chino";   
            }
                else {
                      if (this.marca.equals("Audi")) {
             retorno="Aleman";   
            }
                      
                      else {
                            retorno="ND"; 
                      }
                }
                
            
                     }
          
      
                }
        
        
       
        return retorno;          
    }
    public int getNumerocontinente(){
        var retorno=0;
        
        return retorno;          
    }
    
}
