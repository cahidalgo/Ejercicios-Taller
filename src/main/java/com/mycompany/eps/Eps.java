package com.mycompany.eps;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Eps {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ListaMedico<Medico> lm=new ListaMedico<>();
        ListaMedico<Cita> lc=new ListaMedico<>();
        Medico medico;
        Cita cita;
        
        int opcion;
        int cedula;
        String usuario;
        String p;
        String nom;
        String espe;
        String horario;
        do {
            System.out.println("----------------------");
            System.out.println("Ingrese una opcion:"
                    + "\n----------------------"
                    + "\n 1.Medico. "
                    + "\n 2.Usuario."
                    + "\n 3.Salir.");
            System.out.println("----------------------");
            opcion=in.nextInt();in.nextLine();
            switch (opcion){
                case 1: //medico
                    int j=0;
                    do{
                        System.out.println("Que opcion desea realiar:"
                                + "\n 1.Añadir un medico."
                                + "\n 2.Conocer las citas agendadas de un medico."
                                + "\n 3.Salir del menu de medico.");
                        opcion=in.nextInt();in.nextLine();
                        switch(opcion){
                            case 1:
                                System.out.println("Ingrese el nombre del medico:");
                                nom=in.nextLine();
                                System.out.println("Ingrese la especializacion del medico:");
                                espe=in.nextLine();
                                System.out.println("Ingrese el horario del medico:");
                                horario=in.nextLine();

                                medico=new Medico(nom,espe,horario);
                                lm.addFirst(medico);
                            break;

                            case 2: 
                                int i=0;
                                System.out.println("Ingrese el nombre del medico para dar a conocer sus citas:");
                                nom=in.nextLine();
                                System.out.println("Las citas del doctor "+nom+" son:");
                                for(Cita ci:lc)
                                    if(ci.getMedico().equals(nom)){
                                        i=1;
                                        System.out.println(ci.toString2());
                                    }
                                if(i!=1)
                                    System.out.println("Error. Medico no encontrado");

                            break;

                            case 3:
                                j=1;
                            break;
                            
                            default: System.out.println("Error. Opcion no encontrada.");
                        }
                    }while(j!=1);
                break;
                
                case 2: //Usuario
                    int y=0;
                    String hora;
                    String dia;
                    String palabra;
                    System.out.println("Bienvenido! Aqui podra agendar sus citas medicas\n");
                    System.out.println("Esta es la lista de medicos: ");
                    System.out.println("-------------------------------------------------------------------");
                    for(Medico med:lm)
                        System.out.println(" "+ med.toString());
                    System.out.println("-------------------------------------------------------------------");
                    System.out.println("Desea agentar una cita medica S/N");
                    palabra=in.nextLine().toUpperCase();
                    
                    while(palabra.equals("S")){
                        System.out.println("Ingrese su nombre:");
                        usuario=in.nextLine();
                        System.out.println("Ingrese su cedula:");
                        cedula=in.nextInt();in.nextLine();
                        
                        System.out.println("Ingrese los datos de su cita");
                        System.out.println("Nombre del medico para la cita:");
                        nom=in.nextLine();
                        System.out.println("Dia de la cita");
                        dia=in.nextLine();
                        System.out.println("Hora de la cita");
                        hora=in.nextLine();
                        for(Cita cit:lc)
                            if(hora.equals(cit.getHora())){
                                System.out.println("Error!Esta hora no se encuentra disponible, ingresela de nuevo:");
                                System.out.println("Hora de la cita");
                                hora=in.nextLine();
                            }
                            
                        System.out.println("Tipo de cita:");
                        espe=in.nextLine();

                        cita=new Cita(usuario,cedula,nom,hora,dia,espe);
                        lc.addFirst(cita);
                        System.out.println("Cita agendada con exito!\nDesea agendar otra cita S/N");
                        palabra=in.nextLine().toUpperCase();
                    }
                    System.out.println("Desea conocer sus citas agendadas si/no");
                    p=in.nextLine().toLowerCase();
                    if (p.equals("si")) {
                        System.out.println("Ingrese su numero de cedula:");
                        cedula=in.nextInt();in.nextLine();
                        for(Cita us:lc){
                            if(cedula==us.getCedula()){
                                y=1;
                                System.out.println("Estas son sus citas asignadas");
                                System.out.println(us.toString());
                            }
                        }
                    }
                    if (y==0) {
                        System.out.println("Error, cedula no encontrada.");
                    }
                    System.out.println("Desea eliminar una de sus citas si/no");
                    p=in.nextLine().toLowerCase();
                    if(p.equals("si")){
                        System.out.println("Ingrese su cedula:");
                        cedula=in.nextInt();in.nextLine();
                        System.out.println("Ingrese el medico con el que agendo la cita");
                        nom=in.nextLine();
                        for(Cita cta:lc){
                            if(cedula==cta.getCedula()&& nom.equals(cta.getMedico())){
                                lc.remove(cta);
                                System.out.println("Su cita ha sido eliminada");
                            }
                        }
                    }
                break;
                
                case 3://salir
                    System.exit(0);
                break;
                
                default: System.out.println("Error. Opcion no encontrada.");
            }
        } while (true);
    }
}
