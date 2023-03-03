
package Compras;

import java.util.Scanner;

public class principal {
   public static int indiceCocheMbarato(vehiculo coches[]){
       float precio;
       int indice = 0;
       
               
      precio = coches [0].getprecio(); 
      for(int i=0;i<coches.length;i++){
          if(coches[i].getprecio () < precio){
              precio = coches[i].getprecio();
              indice = i;
              
          }
      }
      
      return indice;
      
      
      
   }
           
           
    public static void main(string [] args){
        Scanner entrada = new Scanner (System.in);
        String maraca,modelo;
        float precio;
        int numerovehiculos,indiceBarato;
        
        
        System.out.print("Digite la cantidad de vehiculos");
        numeroVehiculos = entrada.nextInt();
        
        
        Vehiculo coches [] = new Vehiculo[numeroVehiculo];
        
        
        for(int i=0;i<coches.length;i++){
            entrada.NextLine();
            System.out.println("\nDigite las caracteristicas del coche"+(i+1)+":");
            System.out.print("Introduzca Marca: ");
            marca = entrada.NextLine();
            System.out.print("Introduzca Modelo: ");
            modelo = entrada.NextLine();
            System.out.print("Introduzca Precio: ");
            precio = entrada.NextFloat();
            
            
            choches[i] = new Vehiculo(marca, modelo, precio);
            
            
         }
        
        indicebarato = indiceCocheMBarato(coches);
        System.out.println("\nEl coche mas barato es: ");
        System.out.println(coches[indiceBarato].MostarDatos);
        
    }
            
}
