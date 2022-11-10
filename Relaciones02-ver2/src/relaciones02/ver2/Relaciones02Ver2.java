/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones02.ver2;

import java.util.ArrayList;
import java.util.Scanner;
import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;

public class Relaciones02Ver2 {
    
    private static  Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        
        ArrayList <Jugador> jugadores = new ArrayList<>();
        
        System.out.println("Se va a iniciar un nuevo juego");
        System.out.println("Indique la cantidad de jugadores");
       int cantidad = leer.nextInt();
        if (cantidad<1 || cantidad>6) {
            cantidad=6;
        }
        for (int i = 0; i < cantidad; i++) {
            Jugador agregar =new Jugador(i+1);
            jugadores.add(agregar);
        }
        Revolver r= new Revolver();
        r.llenarRevolver();
        System.out.println("El revolver ya esta listo");
        
        Juego jugar = new Juego();
        jugar.llenarJuego(jugadores, r);
        
       int turno=0;
       boolean sigue=true;
       
       while(sigue){
           if (turno==cantidad) {
               turno=0;
           }
           System.out.println("El jugador "+jugadores.get(turno).getNombre()+" procede a disparar");
           sigue= jugar.ronda(turno);
           
           if (sigue) {
               System.out.println("El jugador "+jugadores.get(turno).getNombre()+" se salva");
           }else{
               System.out.println("El jugador "+jugadores.get(turno).getNombre()+" se mojo");
               System.out.println("Juego Finalizado");
           }
           turno++;
       }
        System.out.println("");
    }
    
}
