/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;
import java.util.Scanner;
/**
 *
 * @author pipel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int seleccion=200;
        while(seleccion!=0){
        System.out.println("BIENVENIDO A TU SELECTOR DE CAMPO");
        System.out.println("selecciona una opcion para continuar");
        System.out.println("1. iniciar una nueva siembra");
        System.out.println("0. salir");
        Scanner scanner = new Scanner(System.in);
        seleccion=scanner.nextInt();
        
        if (seleccion==1){
            System.out.println("empecemos con el proceso");
            System.out.println("");
            System.out.println("el lote en el que hara siembra sera suyo o es arrendado");
            System.out.println("");
            System.out.println("1. propio");
            System.out.println("2. arrendado");
            int lote= scanner.nextInt();
            if (lote==1){
                System.out.println("cual es la region del terreno");
                String region= scanner.next();
                LotePropio milote=new LotePropio();
                milote.setRegion(region);
            
                
                System.out.println("cual es el estado del terreno");
                System.out.println("");
                System.out.println("1. tratado ");
                System.out.println("2.sin tratar");
                int estado= scanner.nextInt();
                milote.setEstadoterreno(estado);
                
                System.out.println("cual es la antiguedad del terreno en años");
                int antiguedad= scanner.nextInt();
                int puntaje;
                if (antiguedad<20){
                    puntaje=1;
                }
                else{
                    puntaje=2;
                }
                milote.setAntiguedad(puntaje);
                
                antiguedad=milote.getAntiguedad();
                int estadoterreno=milote.getEstadoterreno();
                
                int puntajetotal=milote.puntaje(estadoterreno, antiguedad);
                
                if(puntajetotal<3){
                
                   System.out.println("siembra tradicional");
                }
                else{
                    System.out.println("siembra directa");
                }
                
                
                
            }
            
            else if (lote==2){
                
                System.out.println("cual es la region del terreno");
                String region= scanner.next();
                LoteAlquilado milote=new LoteAlquilado();
                milote.setRegion(region);
                
                System.out.println("cual es el estado del terreno");
                System.out.println("");
                System.out.println("1. tratado ");
                System.out.println("2.sin tratar");
                int estado= scanner.nextInt();
                milote.setEstadoterreno(estado);
                
                System.out.println("cual es la antiguedad del terreno en años");
                int antiguedad= scanner.nextInt();
                int puntaje;
                if (antiguedad<20){
                    puntaje=1;
                }
                else{
                    puntaje=2;
                }
                milote.setAntiguedad(puntaje);
                
                antiguedad=milote.getAntiguedad();
                int estadoterreno=milote.getEstadoterreno();
                
                int puntajetotal=milote.puntaje(estadoterreno, antiguedad);
                
                if(puntajetotal<3){
                
                    System.out.println("siembra tradicional");
                }
                else{
                    System.out.println("siembra directa");
                }
                

            
            }
            
            else{
                System.out.println("opcion incorrecta saliendo del programa");
                break;
            }
            int flat=1;
            while ( flat !=2){
                for (int i=20;i>0;i--){
                    
                    System.out.println("este es el dia"+ i+"antes de la siembra");
                if (i==15){
                    System.out.println("se realizara la fumigacion");
                }
                else if(i==1){
                
                    System.out.println("se debe empezar la siembra");
                    flat=2;
                }
                
                }
            
            }
            
            System.out.println("de donde saldra la semilla");
            System.out.println("");
            System.out.println("1. compra");
            System.out.println("2. siembra anterior");
            int siembra= scanner.nextInt();
            
            if (siembra==1){
                
            Semilla misemilla= new Semilla();
            misemilla.setDecompra(1);
            misemilla.setDerecoleccion(0);
            
            
            
            }
            
            else if(siembra==2){
            
            Semilla misemilla= new Semilla();
            misemilla.setDecompra(0);
            misemilla.setDerecoleccion(1);
            }
        }
        
        
        else if (seleccion==0){
        break;
        }
        
        
        
        
        
        }
        

        System.out.println("gracias por usar nuestro programa vuelva pronto");
    }
    
}
