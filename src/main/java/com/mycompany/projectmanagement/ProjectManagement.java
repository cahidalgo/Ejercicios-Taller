/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectmanagement;

import java.util.Scanner;

/**
 *
 * @author Andres Gomez
 */
public class ProjectManagement {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        DoublyLinkedList <Tarea> info;
        DoublyLinkedList <SubTarea> info2;
        info= new DoublyLinkedList<>();
        info2= new DoublyLinkedList<>();
        String[] palabra = new String[3];
        
        Tarea tarea;
        SubTarea subtarea;
        tarea=new Tarea();
        subtarea=new SubTarea();
        int opcion;
        int lim=1;
        int lim2=1;
        Tarea y=null;
        do{
        
        System.out.println("***ProjectManagement***"
                    + "\n__________________________________"
                    + "\nIngrese la opcion que desea: "
                    + "\n__________________________________"
                    + "\n1. Iniciar proyecto."
                    + "\n2. Cambiar estado de una tarea o subtarea"
                    + "\n3. Calcular % de completitud de una tarea"
                    + "\n4. Calcular costos de una tarea. "
                    + "\n5. Calcular costo total."
                    + "\n6. Calcular dias maximos de atraso."
                    + "\n7. Cerrar. "
                    + "\n__________________________________");
        opcion=in.nextInt();
        in.nextLine();
        
        switch(opcion){
            case 1:
                String resp;
                int t;
                lim=1;
                int com=0;
                double costo=0;
                String nom;
                
                do{
  
                System.out.println("Desea ingresar una tarea S/N");
                resp=in.nextLine().toUpperCase();
                if(resp.equals("S")){
                    System.out.println("Ingrese el nombre de la tarea");
                    nom=in.nextLine();
                    System.out.println("Ingrese el tiempo de la tarea");
                    t=in.nextInt();in.nextLine();
                    System.out.println("Ingrese la complejidad de la tarea"
                                        + "\n1. Minima"
                                        + "\n2. Media"
                                        + "\n3. Maxima");
                    opcion=in.nextInt();in.nextLine();
                    switch(opcion){
                        case 1:
                              costo=tarea.compleMin(t);
                              com=opcion;
                        break;
                        case 2:
                              costo=tarea.compleMed(t);
                              com=opcion;
                        break;
                        case 3:
                              costo=tarea.compleMax(t);
                              com=opcion;
                        break;
                    }
                    Tarea a =new Tarea(nom,t,com,costo,"Incompleto");
                    info.addLast(a);
                    
                    System.out.println("Tiene subtareas S/N");
                    resp=in.nextLine().toUpperCase();
                    if(resp.equals("S")){
                        System.out.println("Cuantas subtareas tiene");
                        opcion=in.nextInt();in.nextLine();
                        int temp=0;
                        for(int n=0;n<opcion;n++){
                            System.out.println("Ingrese el nombre de la subtarea");
                            nom=in.nextLine();
                            System.out.println("Ingrese el tiempo de la subtarea");
                            t=in.nextInt();in.nextLine();
                            System.out.println("Ingrese la complejidad de la subtarea"
                                        + "\n1. Minima"
                                        + "\n2. Media"
                                        + "\n3. Maxima");
                            temp=in.nextInt();in.nextLine();
                            switch(temp){
                                case 1:
                                    costo=subtarea.compleMin(t);
                                    com=temp;
                                break;
                                case 2:
                                    costo=subtarea.compleMed(t);
                                    com=temp;
                                break;
                                case 3:
                                    costo=subtarea.compleMax(t);
                                    com=temp;
                                break;
                            }
                            SubTarea b =new SubTarea(nom,t,temp,costo,"Incompleto");
                            info2.addLast(b);
                        }
                    }
                }else{
                    lim=0;
                }
                }while(lim!=0);
            break;
            
            case 2:
                int c=0;
                int d=0;
                String est;
                System.out.println("Ingrese de cual quiere cambiar el estado"
                        + "\n1. Tarea"
                        + "\n2. SubTarea");
                opcion=in.nextInt();in.nextLine();
                
                switch(opcion){
                    
                    case 1:
                        System.out.println("Ingrese el nombre de la tarea");
                        nom=in.nextLine();
                        for(Tarea s: info){
                            if(s.getNom().equals(nom)){
                            c=1;
                            System.out.println("Ingrese el nuevo estado completo/incompleto");
                            est=in.nextLine().toLowerCase();
                            s.setEstado(est);
                            }
                        }
                        if(c==0){
                            System.out.println("No se encontro la tarea ");
                        }
                        
                    break;
                    
                    case 2:
                        System.out.println("Ingrese el nombre de la subtarea");
                        nom=in.nextLine();
                        for(SubTarea s: info2){
                            if(s.getNom().equals(nom)){
                            d=1;
                            System.out.println("Ingrese el nuevo estado completo/incompleto");
                            est=in.nextLine().toLowerCase();
                            s.setEstado(est);
                            }
                        }
                        if(d==0){
                            System.out.println("No se encontro la subtarea ");
                        }
                    break;
                }
            break;
            
            case 3:
                int count=0;
                int count1=0;
                int k=0;
                String compa;
                char compar;
                double x=0;
                System.out.println("Ingrese el nombre de la tarea");
                nom=in.nextLine();
                for(Tarea s:info){
                    if(s.getNom().equals(nom)){
                        k=1;
                        for(SubTarea u:info2){
                            if(s.getNom().charAt(0)==u.getNom().charAt(0)){
                                count++;
                                System.out.println("count: "+count);
                                if(u.getEstado().equals("completo")){
                                    count1++;
                                }
                            }
                            
                            
                        }
                        if(count==0){
                            if(s.getEstado().equals("completo")){
                            System.out.println("El % de completitud es de: "+ 100+"%");
                            }else{
                            System.out.println("El % de completitud es de: "+0+"%"); 
                            }
                        }else{
                            x=(count1*100/count);
                            System.out.println("El % de completitud es de: "+x+"%");
                           
                        }
                    }
                }
                if(k==0){
                    System.out.println("La Tarea no se encontro");
                }
            break;

            case 4:
                
                System.out.println("Ingrese el numero para calcular el costo"
                        + "\n1. Tarea"
                        + "\n2. SubTarea");
                opcion=in.nextInt();in.nextLine();
                switch(opcion){
                    case 1:
                        int b=0;
                        System.out.println("Ingrese el nombre de la tarea");
                        nom=in.nextLine();
                        for(Tarea s: info){
                            if(s.getNom().equals(nom)){
                            b=1;
                            System.out.println("El costo de "+ nom + " es: $"+ s.getCosto());
                            }
                        }
                        if(b==0){
                            System.out.println("No se encontro la tarea ");
                        }
                    break;
                    case 2:
                        int p=0;
                        System.out.println("Ingrese el nombre de la subtarea");
                        nom=in.nextLine();
                        for(SubTarea s: info2){
                            if(s.getNom().equals(nom)){
                            p=1;
                            System.out.println("El costo de "+ nom + " es: $"+ s.getCosto());
                            }
                        }
                        if(p==0){
                            System.out.println("No se encontro la subtarea ");
                        }
                    break; 
                }
            break;
            
            case 5:
                double total=0;
                for(Tarea m:info){
                    total+=m.getCosto();
                }
                for(SubTarea m:info2){
                    total+=m.getCosto();
                }
                System.out.println("El costo total del proyecto es: "+ total +"$");
            break;
            
            case 6:
                int tt=0;
                for(Tarea p:info){
                    if(p.getCom()==1){
                        tt+=5;
                    }else if(p.getCom()==2){
                        tt+=(p.getT()*0.1);
                    }else if(p.getCom()==3){
                        tt+=(p.getT()*0.2)+8;
                    }
                }
                for(SubTarea p:info2){
                    if(p.getCom()==1){
                        tt+=5;
                    }else if(p.getCom()==2){
                        tt+=(p.getT()*0.1);
                    }else if(p.getCom()==3){
                        tt+=(p.getT()*0.2)+8;
                    }
                }
                System.out.println("Los dias maximos de atraso son: "+ tt);
            break;
            
            case 7:
                lim2=0;
            break;
        }
        }while(lim2!=0);    
            
    }
}
