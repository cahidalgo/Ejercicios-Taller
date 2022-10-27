package com.mycompany.inmueble;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class InmuebleManage {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        DoublyLinkedList<Edificio> lista=new DoublyLinkedList<>();
        Edificio edificio;
        Piso piso;
        Local local;
        
        String p;
        String nom;
        int est;
        int opcion;
        do {
             System.out.println("Ingrese la opcion que desea: "
                     + "\n 1.Agregar inmueble."
                     + "\n 2.Eliminar inmueble."
                     + "\n 3.Consultar inmuebles."
                     + "\n 4.Alquilar inmuebles."
                     + "\n 5.Salir.");
            opcion=in.nextInt();in.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese la opcion que desee: "
                            + "\n 1.Cambiar el estado del inmueble"
                            + "\n 2.Añadir nuevo inmueble."
                            + "");
                    opcion=in.nextInt();in.nextLine();
                    switch(opcion){
                        case 1:
                            System.out.println("Ingrese el inmueble al que le desea cambiar el estado:"
                                    + "\n 1.Edificio."
                                    + "\n 2.Piso."
                                    + "\n 3.Local.");
                            opcion=in.nextInt();in.nextLine();
                            switch(opcion){
                                case 1:
                                    int i=0;
                                    System.out.println("Ingrese el nombre del edificio:");
                                    p=in.nextLine();
                                    for(Edificio ed:lista)
                                        if(ed.getNombre().equals(p)){
                                            ed.setEst(1);
                                            i=1;
                                            for(Piso pi:ed.getPiso()){
                                                pi.setEst(1);
                                                for(Local lo:pi.getLoc()){
                                                    lo.setEstado(1);
                                                }
                                            }
                                            System.out.println("Estado cambiado a  1");
                                        }
                                    if(i!=1){
                                        System.out.println("Edificio inexistente");
                                    }
                                break;
                                    
                                case 2:
                                    int x=0;
                                    int y=0;
                                    System.out.println("Ingrese el nombre del edificio:");
                                    p=in.nextLine();
                                    for(Edificio ed:lista)
                                        if(ed.getNombre().equals(p)){
                                            x=1;
                                            System.out.println("Ingrese el nombre del piso:");                           
                                            p=in.nextLine();
                                            for(Piso pi:ed.getPiso()){
                                                if (p.equals(pi.getNombre())) {
                                                    y=1;
                                                    pi.setEst(1);
                                                    for(Local lo:pi.getLoc()){
                                                        lo.setEstado(1);
                                                    }
                                               }
                                            }
                                        }
                                    if(x!=1){
                                        System.out.println("Edificio inexistente.");
                                    }
                                    if (y!=1) {
                                        System.out.println("Piso inexsistente.");
                                    }
                                break;
                                
                                case 3:
                                    int c=0;
                                    int a=0;
                                    int t=0;
                                    System.out.println("Ingrese el nombre del edificio:");
                                    p=in.nextLine();
                                    for(Edificio ed:lista)
                                        if(ed.getNombre().equals(p)){
                                            c=1;
                                            System.out.println("Ingrese el nombre del piso:");
                                            p=in.nextLine();
                                            for(Piso pi:ed.getPiso()){
                                                if (p.equals(pi.getNombre())) {
                                                    a=1;
                                                    System.out.println("Ingrese el nombre del local:");
                                                    p=in.nextLine();
                                                    for(Local lo:pi.getLoc()){
                                                        if (p.equals(lo.getNombre())) {
                                                            lo.setEstado(1);
                                                            t=1;
                                                            System.out.println("Estado del local cambiado a 1");
                                                        }
                                                    }
                                               }
                                            }
                                        }
                                    if(c!=1){
                                        System.out.println("Edificio inexistente.");
                                    }
                                    if (a!=1) {
                                        System.out.println("Piso inexsistente.");
                                    }
                                    if (t!=1) {
                                        System.out.println("Local inexsistente.");
                                    }
                                break;
                            }
                        break;
                            
                        case 2:
                            int locales=0;
                            int pisos=0;
                            System.out.println("Que inmueble desea agregar:"
                                    + "\n 1.Edificio."
                                    + "\n 2.Piso."
                                    + "\n 3.Local.");
                            opcion=in.nextInt();in.nextLine();
                            switch(opcion){
                                case 1:

                                    System.out.println("Ingrese cuantos locales tiene cada piso");
                                    locales=in.nextInt();in.nextLine();
                                    System.out.println("Ingrese cuantos pisos tiene el edificio");
                                    pisos=in.nextInt();in.nextLine();
                                    System.out.println("Ingrese el nombre del edificio");
                                    nom=in.nextLine();
                                    Piso[] pis=new Piso[pisos];
                                    for(int b=0;b<pisos;b++){
                                        Local[] s = new Local[locales];
                                        for(int i=0;i<locales;i++){
                                            Local r=new Local(i,1);
                                            s[i]=r;
                                        }
                                        Piso o=new Piso(b,1);
                                        o.setLoc(s);
                                        pis[b]=o;
                                    }
                                    Edificio f=new Edificio(nom,1);
                                    f.setPiso(pis);
                                    lista.addFirst(f);
                                break;
                                    
                                case 2:
                                   
                                    System.out.println("Ingrese cuantos locales tiene cada piso");
                                    locales=in.nextInt();in.nextLine();
                                    System.out.println("Ingrese cuantos pisos tiene el edificio");
                                    pisos=in.nextInt();in.nextLine();
                                    System.out.println("Ingrese el numero del piso a su disposicion");
                                    int n=in.nextInt();in.nextLine();
                                    System.out.println("Ingrese el nombre del edificio");
                                    nom=in.nextLine();
                                    Piso[] pise=new Piso[pisos];
                                    for(int b=0;b<pisos;b++){
                                        Local[] s = new Local[locales];
                                        for(int i=0;i<locales;i++){
                                            Local r=new Local(i,0);
                                            s[i]=r;
                                        }
                                        if(b==n-1){
                                            Piso o=new Piso(b,1);
                                            o.setLoc(s);
                                            pise[b]=o;
                                        }else{
                                            Piso o=new Piso(b,0);
                                            o.setLoc(s);
                                            pise[b]=o;
                                        }
                                    }
                                    Edificio fe=new Edificio(nom,0);
                                    fe.setPiso(pise);
                                    lista.addFirst(fe);
                                    
                                break;
                                    
                                case 3:
                                    System.out.println("Ingrese cuantos locales tiene cada piso");
                                    locales=in.nextInt();in.nextLine();
                                    System.out.println("Ingrese cuantos pisos tiene el edificio");
                                    pisos=in.nextInt();in.nextLine();
                                    System.out.println("Ingrese el piso donde esta ubicado el local");
                                    int pisos1=in.nextInt();in.nextLine();
                                    System.out.println("Ingrese el numero del local a su disposicion");
                                    int ne=in.nextInt();in.nextLine();
                                    System.out.println("Ingrese el nombre del edificio");
                                    nom=in.nextLine();
                                    Piso[] pises=new Piso[pisos];
                                    for(int b=0;b<pisos;b++){
                                        Local[] s = new Local[locales];
                                        for(int i=0;i<locales;i++){
                                            if(i==ne-1 && b==pisos1-1){
                                            Local r=new Local(i,1);
                                            s[i]=r;    
                                            }else{
                                            Local r=new Local(i,0);
                                            s[i]=r;
                                            }
                                        }
                                        Piso o=new Piso(b,1);
                                        o.setLoc(s);
                                        pises[b]=o;
                                    }
                                    Edificio fes=new Edificio(nom,0);
                                    fes.setPiso(pises);
                                    lista.addFirst(fes);
                                    
                                break;
                            }
                        break;
                            
                    }
                break;
                    
                case 2:
                    System.out.println("Que inmueble desea eliminar:"
                                    + "\n 1.Edificio."
                                    + "\n 2.Piso."
                                    + "\n 3.Local.");
                            opcion=in.nextInt();in.nextLine();
                            switch(opcion){
                                case 1:
                                    int i=0;
                                    System.out.println("Ingrese el nombre del edificio:");
                                    p=in.nextLine();
                                    for(Edificio ed:lista)
                                        if(ed.getNombre().equals(p)){
                                            ed.setEst(0);
                                            i=1;
                                            for(Piso pi:ed.getPiso()){
                                                pi.setEst(0);
                                                for(Local lo:pi.getLoc()){
                                                    lo.setEstado(0);
                                                }
                                            }
                                            System.out.println("Estado cambiado a 0");
                                        }
                                    if(i!=1){
                                        System.out.println("Edificio inexistente");
                                    }
                                break;
                                
                                case 2:
                                    int x=0;
                                    int y=0;
                                    System.out.println("Ingrese el nombre del edificio:");
                                    p=in.nextLine();
                                    for(Edificio ed:lista)
                                        if(ed.getNombre().equals(p)){
                                            x=1;
                                            System.out.println("Ingrese el nombre del piso:");                           
                                            p=in.nextLine();
                                            for(Piso pi:ed.getPiso()){
                                                if (p.equals(pi.getNombre())) {
                                                    y=1;
                                                    pi.setEst(0);
                                                    for(Local lo:pi.getLoc()){
                                                        lo.setEstado(0);
                                                    }
                                                    System.out.println("Estado cambiado a 0");
                                               }
                                            }
                                        }
                                    if(x!=1){
                                        System.out.println("Edificio inexistente.");
                                    }
                                    if (y!=1) {
                                        System.out.println("Piso inexsistente.");
                                    }
                                break;
                                
                                case 3:
                                    int c=0;
                                    int a=0;
                                    int t=0;
                                    System.out.println("Ingrese el nombre del edificio:");
                                    p=in.nextLine();
                                    for(Edificio ed:lista)
                                        if(ed.getNombre().equals(p)){
                                            c=1;
                                            System.out.println("Ingrese el nombre del piso:");
                                            p=in.nextLine();
                                            for(Piso pi:ed.getPiso()){
                                                if (p.equals(pi.getNombre())) {
                                                    a=1;
                                                    System.out.println("Ingrese el nombre del local:");
                                                    p=in.nextLine();
                                                    for(Local lo:pi.getLoc()){
                                                        if (p.equals(lo.getNombre())) {
                                                            lo.setEstado(0);
                                                            t=1;
                                                            System.out.println("Estado del local cambiado a 0");
                                                        }
                                                    }
                                               }
                                            }
                                        }
                                    if(c!=1){
                                        System.out.println("Edificio inexistente.");
                                    }
                                    if (a!=1) {
                                        System.out.println("Piso inexsistente.");
                                    }
                                    if (t!=1) {
                                        System.out.println("Local inexsistente.");
                                    }
                                break;
                            }
                break;
                    
                case 3:
                    System.out.println("Que inmueble desea consultar:"
                                    + "\n 1.Edificio."
                                    + "\n 2.Piso."
                                    + "\n 3.Local.");
                            opcion=in.nextInt();in.nextLine();
                            switch(opcion){
                                case 1:
                                    int i=0;
                                    System.out.println("Ingrese el nombre del edificio:");
                                    p=in.nextLine();
                                    for(Edificio ed:lista)
                                        if(ed.getNombre().equals(p)){
                                            i=1;
                                            System.out.println(ed.toString());
                                            for(Piso pi:ed.getPiso()){
                                              System.out.println(pi.toString());
                                                for(Local lo:pi.getLoc()){
                                                    System.out.println(lo.toString());
                                                }
                                            }
                                            
                                        }
                                    if(i!=1){
                                        System.out.println("Edificio inexistente");
                                    }
                                break;
                                
                                case 2:
                                    int x=0;
                                    int y=0;
                                    System.out.println("Ingrese el nombre del edificio:");
                                    p=in.nextLine();
                                    for(Edificio ed:lista)
                                        if(ed.getNombre().equals(p)){
                                            x=1;
                                            System.out.println("Ingrese el nombre del piso:");                           
                                            int q=in.nextInt();in.nextLine();
                                            for(Piso pi:ed.getPiso()){
                                                if (pi.getNombre()==q) {
                                                    System.out.println(pi.toString());
                                                    for(Local lo:pi.getLoc()){
                                                        System.out.println(lo.toString());
                                                    }
                                               }
                                            }
                                        }
                                    if(x!=1){
                                        System.out.println("Edificio inexistente.");
                                    }
                                    if (y!=1) {
                                        System.out.println("Piso inexsistente.");
                                    }
                                break;
                                
                                case 3:
                                    int c=0;
                                    int a=0;
                                    int t=0;
                                    System.out.println("Ingrese el nombre del edificio:");
                                    p=in.nextLine();
                                    for(Edificio ed:lista)
                                        if(ed.getNombre().equals(p)){
                                            c=1;
                                            System.out.println("Ingrese el nombre del piso:");
                                            int q=in.nextInt();in.nextLine();
                                            for(Piso pi:ed.getPiso()){
                                                if (pi.getNombre()==q) {
                                                    a=1;
                                                    System.out.println("Ingrese el nombre del local:");
                                                    q=in.nextInt();in.nextLine();
                                                    for(Local lo:pi.getLoc()){
                                                        if (lo.getNombre()==q) {
                                                            t=1;
                                                            System.out.println(lo.toString());
                                                        }
                                                    }
                                               }
                                            }
                                        }
                                    if(c!=1){
                                        System.out.println("Edificio inexistente.");
                                    }
                                    if (a!=1) {
                                        System.out.println("Piso inexsistente.");
                                    }
                                    if (t!=1) {
                                        System.out.println("Local inexsistente.");
                                    }
                                break;
                            }
                break;
                    
                case 4:
                    String nombre;
                    String sexo;
                    int cedula;
                    int edad;
                   
                    System.out.println("Que inmueble desea alquilar:"
                                    + "\n 1.Edificio."
                                    + "\n 2.Piso."
                                    + "\n 3.Local.");
                            opcion=in.nextInt();in.nextLine();
                    switch(opcion){
                        
                        case 1:
                            int i=0;
                            System.out.println("Ingrese el nombre del edificio:");
                            p=in.nextLine();
                            for(Edificio ed:lista)
                                if(ed.getNombre().equals(p)){
                                    i=1;
                                    if(ed.getUsuario() == null){

                                        System.out.println("*****DATOS DEL QUE ALQUILA*****");
                                        System.out.println("Ingrese el nombre: ");
                                        nombre=in.nextLine();
                                        System.out.println("Ingrese el sexo: ");
                                        sexo=in.nextLine();
                                        System.out.println("Ingrese la edad: ");
                                        edad=in.nextInt();in.nextLine();
                                        System.out.println("Ingrese la cedula: ");
                                        cedula=in.nextInt();in.nextLine();

                                        ed.setUsuario(new Usuario(nombre,sexo,cedula,edad));
                                    }else{
                                        System.out.println("ESTE INMUEBLE YA ESTA ALQUILADO");
                                    }

                                }
                            if(i!=1){
                                System.out.println("Edificio inexistente");
                            }
                        break;
                        
                        case 2:
                            int x=0;
                            int y=0;
                            System.out.println("Ingrese el nombre del edificio:");
                            p=in.nextLine();
                            for(Edificio ed:lista)
                                if(ed.getNombre().equals(p)){
                                    x=1;
                                    System.out.println("Ingrese el nombre del piso:");                           
                                    int q=in.nextInt();in.nextLine();
                                    for(Piso pi:ed.getPiso()){
                                        if (pi.getNombre()==q) {
                                            y=1;
                                            if(pi.getUsuario() == null){

                                            System.out.println("*****DATOS DEL QUE ALQUILA*****");
                                            System.out.println("Ingrese el nombre: ");
                                            nombre=in.nextLine();
                                            System.out.println("Ingrese el sexo: ");
                                            sexo=in.nextLine();
                                            System.out.println("Ingrese la edad: ");
                                            edad=in.nextInt();in.nextLine();
                                            System.out.println("Ingrese la cedula: ");
                                            cedula=in.nextInt();in.nextLine();

                                            pi.setUsuario(new Usuario(nombre,sexo,cedula,edad));
                                            }else{
                                            System.out.println("ESTE INMUEBLE YA ESTA ALQUILADO");
                                            }
                                        }
                                    }
                                }
                            if(x!=1){
                                System.out.println("Edificio inexistente.");
                            }
                            if (y!=1) {
                                System.out.println("Piso inexsistente.");
                            }
                        break;
                        
                        case 3:
                            int c=0;
                            int a=0;
                            int t=0;
                            System.out.println("Ingrese el nombre del edificio:");
                            p=in.nextLine();
                            for(Edificio ed:lista)
                                if(ed.getNombre().equals(p)){
                                    c=1;
                                    System.out.println("Ingrese el nombre del piso:");
                                    int q=in.nextInt();in.nextLine();
                                    for(Piso pi:ed.getPiso()){
                                        if (pi.getNombre()==q) {
                                            a=1;
                                            System.out.println("Ingrese el nombre del local:");
                                            q=in.nextInt();in.nextLine();
                                            for(Local lo:pi.getLoc()){
                                                if (lo.getNombre()==q) {
                                                    t=1;
                                                    if(lo.getUsuario() == null){

                                                    System.out.println("*****DATOS DEL QUE ALQUILA*****");
                                                    System.out.println("Ingrese el nombre: ");
                                                    nombre=in.nextLine();
                                                    System.out.println("Ingrese el sexo: ");
                                                    sexo=in.nextLine();
                                                    System.out.println("Ingrese la edad: ");
                                                    edad=in.nextInt();in.nextLine();
                                                    System.out.println("Ingrese la cedula: ");
                                                    cedula=in.nextInt();in.nextLine();

                                                    lo.setUsuario(new Usuario(nombre,sexo,cedula,edad));
                                                    }else{
                                                    System.out.println("ESTE INMUEBLE YA ESTA ALQUILADO");
                                                    }
                                                }
                                            }
                                       }
                                    }
                                }
                            if(c!=1){
                                System.out.println("Edificio inexistente.");
                            }
                            if (a!=1) {
                                System.out.println("Piso inexsistente.");
                            }
                            if (t!=1) {
                                System.out.println("Local inexsistente.");
                            }
                        break;
                    }
                break;
                
                case 5:
                    System.exit(0);
                break;
                    
            }
        } while (true);
    }
}
