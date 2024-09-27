package com.generation;
//Se importo clase Scanner
import java.util.Scanner;

public class Codigo4 {
	public static void main(String[] args) {
		//Se agregao el system.in
		Scanner s = new Scanner(System.in);
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    //Es el turno del jugador 2
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    //se elimino el otro scanner que no era necesario
	    String j2 = s.nextLine();
	    //Se cambio el == por equals
	    if (j1.equals(j2)) {
	    	System.out.println("Empate");
		}else {
			int g = 2;
			switch (j1) {
			case "piedra":
				if (j2.equals("tijeras")) {
		              g = 1;
		            }
				break;//se agrego
			case"papel":
	            if (j2.equals("piedra")) {
	              g = 1;
	            }//se agrego la llave que cierra
	            //Se agrego el brak
	            break;
			case "tijera":
				//Se elimino el equals y se remplazo por ==
	            if (j2.equals("papel")) {
	              g = 1;
	            }
	            break;
	            //se agrego la opcion por default
			default: System.out.println("Opcion Invalida");
				break;
			}
			System.out.println("Gana el jugador " + g);
		}
	    //se agrego la funcion de close
	    s.close();
	}
}
