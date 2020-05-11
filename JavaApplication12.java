
package javaapplication12;

import java.util.Scanner;


public class JavaApplication12 {

   
    public static void main(String[] args) {
        
        jugador[] equipo;
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ingrese cantidad de jugadores:");
        int cantidad=sc.nextInt();
        
         
        equipo= new jugador[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("ingrese nombre del jugador"+i+":");
            sc.nextLine();
            String nombre=sc.nextLine();
            System.out.println("ingrese posicion del jugador"+i+":");
            int posicion= sc.nextInt();
            System.out.println("ingrese nroCamiseta del jugador"+i+":");
            int nroCamiseta=sc.nextInt();
            System.out.println("ingrese cantPartidosJugados del jugador"+i+":");
            int cantPartidosJugados=sc.nextInt();
            System.out.println("ingrese PorcentajeEstadoFisico del jugador"+i+":");
            int PorcentajeEstadoFisico=sc.nextInt();
      
            equipo[i] = new jugador (nombre, posicion, nroCamiseta, cantPartidosJugados, PorcentajeEstadoFisico);
            
        }
        for (int i = 0; i < equipo.length; i++) {
            System.out.println(equipo[i]);
            
        }
        
        int cantidadJugadormenos10p=0;
        for (int i = 0; i < equipo.length; i++) {
           if(equipo[i].getCantPartidosJugados()<10){
           cantidadJugadormenos10p++;
           }
            
        }
        System.out.println("jugador con menos de 10 partidos:"+cantidadJugadormenos10p);
        
        jugador jugadorConMasPartidosJugados=equipo[0];
        for (int i = 0; i < equipo.length; i++) {
           
            if(jugadorConMasPartidosJugados.getCantPartidosJugados()<equipo[i].getCantPartidosJugados()){
                jugadorConMasPartidosJugados=equipo[i];
            }
        }
        System.out.println("el jugador con mas partidos jugados es:"+jugadorConMasPartidosJugados);
        
        int suma=0;
       
        
        for (int i = 0; i < equipo.length; i++) {
          
           suma+=equipo[i].getPorcentajeEstadoFisico();
        }
        float promedio=(float)suma/equipo.length;
        System.out.println("el promedio de estado fisico del equipo es:"+promedio);
        /*busqueda*/
        System.out.println("ingrese nroCamiseta:");
        int nroCamiseta=sc.nextInt();
        jugador j=equipo[0];
        for (int i = 0; i < equipo.length; i++) {
            if(equipo[i].getNroCamiseta()==nroCamiseta){
            j=equipo[i];
            break;
            }
           
        }
        System.out.println("el estado fisico del jugador"+j.getPorcentajeEstadoFisico());
        
        int suma1=0;
        for (int i = 0; i < equipo.length; i++) {
            suma1+=equipo[i].getCantPartidosJugados();
            if(equipo[i].getPosicion()==1){
            System.out.println("posicion arquero");
            }
             if(equipo[i].getPosicion()==2){
            System.out.println("posicion defensor");
            }
              if(equipo[i].getPosicion()==3){
            System.out.println("posicion mediocampo");
            }
                if(equipo[i].getPosicion()==4){
            System.out.println("posicion delantero");
            }
        }
        float promedio1=(float)suma1/equipo.length;
        
        System.out.println("el promedio de cantidad de partidos para la posicion arquero es:"+promedio1);
        System.out.println("el promedio de cantidad de partidos para la posicion defensa es:"+promedio1);
        System.out.println("el promedio de cantidad de partidos para la posicion mediocampo es:"+promedio1);
        System.out.println("el promedio de cantidad de partidos para la posicion delantero es:"+promedio1);
   }
   }