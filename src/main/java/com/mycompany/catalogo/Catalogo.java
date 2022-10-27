package com.mycompany.catalogo;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Catalogo {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Cd prod;
        Mp3 prod1;
        Stack <Producto> catalogo= new Stack<>();
        Stack <Cd> inventario= new Stack<>();
        
        do{
            int opcion;
            String p;
            System.out.println("---------------------------------");
            System.out.println("A que apartado desea ingresar:"
                    + "\n---------------------------------"
                    + "\n1. Central"
                    + "\n2. Sucursal");
            System.out.println("---------------------------------");
            opcion=in.nextInt();
            in.nextLine();
            switch(opcion){
                //central
                case 1:
                    int t=0;
                    System.out.println("Bienvenido a la central!");
                    do{
                        System.out.println(" Que opcion desea realizar:"
                                + "\n  1. Registrar Catalogo."
                                + "\n  2. Salir.");
                        opcion=in.nextInt();in.nextLine();

                        switch (opcion){
                            case 1:
                                String tit;
                                String it;
                                int cod;
                                int precio;
                                int cont=0;

                                System.out.println("Cuantos productos pondra a la venta:");
                                opcion=in.nextInt();in.nextLine();
                                System.out.println("Ingrese los datos de los productos:");
                                do {
                                    System.out.println("Ingrese si el producto es: 1.MP3 2.CD");
                                    int y=in.nextInt();in.nextLine();
                                    switch(y){
                                        
                                        case 1 -> {
                                            System.out.println("Ingrese el titulo:");
                                            tit=in.nextLine();
                                            System.out.println("Ingrese el codigo:");
                                            cod=in.nextInt(); in.nextLine();
                                            System.out.println("Ingrese el precio:");
                                            precio=in.nextInt();in.nextLine();
                                            prod1=new Mp3(precio,cod,0,tit);
                                            catalogo.addFirst(prod1);
                                            cont+=1;
                                }
                                        
                                        case 2 -> {
                                            System.out.println("Ingrese el titulo:");
                                            tit=in.nextLine();
                                            System.out.println("Ingrese el interprete:");
                                            it=in.nextLine();
                                            System.out.println("Ingrese el codigo:");
                                            cod=in.nextInt(); in.nextLine();
                                            System.out.println("Ingrese el precio:");
                                            precio=in.nextInt();in.nextLine();
                                            prod=new Cd(precio,cod,0,tit,it);
                                            catalogo.addFirst(prod);
                                            cont+=1;
                                }
                                    }
                                } while (cont<opcion);
                            break;

                            case 2:
                                t=1;
                            break;
                        }
                    }while(t!=1);
                break;
                
                //sucursal
                case 2:
                    t=0;
                    System.out.println("Bienvenido a la sucursal!");
                    do{
                        System.out.println(" Que opcion desea realizar:"
                                + "\n  1. Hacer inventario."
                                + "\n  2. Venta."
                                + "\n  3. Pedir Restock a la central."
                                + "\n  4. Salir.");
                        opcion=in.nextInt();in.nextLine();

                        switch (opcion){
                            case 1:
                                for(Producto pe:catalogo){
                                    System.out.println(pe.toString());
                                    System.out.println("Ingrese el stock actual:");
                                    opcion=in.nextInt(); in.nextLine();
                                    pe.setCant(opcion);
                                }
                            break;
                            
                            case 2:
                                for(Producto pe:catalogo){
                                    System.out.println(pe.toString());
                                    System.out.println("La disponibilidad es de: "+ pe.getCant()+ " unidades");
                                }
                                
                                System.out.println("Que producto desea comprar:");
                                p=in.nextLine();
                                
                                for(Producto pe:catalogo){
                                    if(p.equals(pe.getTitulo())){
                                        System.out.println("Cuantas unidades desea:");
                                        opcion=in.nextInt();in.nextLine();
                                        pe.setCant(pe.getCant()-opcion);
                                        System.out.println("Que medio de pago desea utilizar: Efectivo/Tarjeta");
                                        p=in.nextLine().toLowerCase();
                                        if(p.equals("efectivo"))
                                            pe.setTipopago(new Efectivo());
                                        else if(p.equals("tarjeta"))
                                            pe.setTipopago(new Tarjeta());
                                        System.out.println("Que forma tipo de envio desea: Domicilio/Tienda");
                                        p=in.nextLine().toLowerCase();
                                        if (p.equals("domicilio")) 
                                            pe.setTipoenvio(new Domicilio());
                                        else if(p.equals("tienda"))
                                            pe.setTipoenvio(new Tienda());
                                        System.out.println("El precio de la venta es: "+pe.getPrecio()*opcion);
                                        
                                    }
                            }
                            break;
                            
                            case 3:
                                for(Producto pe:catalogo)
                                    if(pe.getCant()<2){
                                        pe.setCant(10);
                                    }
                            break;
                            
                            case 4:
                                t=1;
                            break;
                        }
                    }while(t!=1);
                break;
                
            }
            
        }while(true);

    }
}