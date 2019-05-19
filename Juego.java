//! \class Clase Juego que se utiliza para ejecutar el juego

/*!
  Crea y ejecutael programa, además de nombrar ciertos atributos que permiten la ejecuión de la mayoría
  métodos.
*/

import javax.swing.JOptionPane;

public class Juego{
		Interfaz interfaz1 = new Interfaz(); 
		String cantidad = "Cuantos jugadores? 1 o 2 jugadores?"; ///< String utilizado para preguntar mediante una ventana, la cantidad de jugadores para la partida actual
		int cantidadJugadores = interfaz1.solicitarNumeroEntero(cantidad);
		int indiceDelMazo = 0; ///< entero utilizado para indicar cuál es la siguiente celda del mazo barajado a usar cuando se debe comer o coger carta
		int contadorCome2 = 0; ///< contador que almacena un entero, representado la cantidad de veces que se han tirado Cartas Come 2
		boolean jugador2IA = false; ///< booleano que indica si el juego está pensado para jugar contra la IA o conta un segundo jugador modo "hot seat"
		boolean condicionGanar = false; ///< booleano que indica si se cumplió o no la condición para salir del ciclo del juego
		int turno = 2; ///< entero que se utiliza para calcular quién controla el turno; jugador 1, jugador 2 o el "CPU"
		String[] cartasJugadas;
		Mazo[] mazoParaEsteJuego = new Mazo[73];
		Jugador jugador1 = new Jugador();
		Jugador jugador2 = new Jugador();
		Jugador jugador3 = new Jugador();


	public boolean ponerCartaValida1(){
		System.out.println("la ultima carta en la pila de cartas jugadas es: " + ultimaCarta());


		jugador1.imprimirCartasJugador();
		int numeroDeCelda = interfaz1.solicitarNumeroEntero("cual celda/carta desea jugar?");
		Mazo[] cartas = jugador1.getCartasJugador();
		Mazo cartasReducido = cartas[numeroDeCelda];

		return false;
		
		
	}
	
	public boolean jugador2EsIA (){
		if (this.cantidadJugadores > 0 && cantidadJugadores <= 2){

			if (this.cantidadJugadores == 1){
				return true;
			}
			else {
				return false;
			}
		}

		else {
			System.out.println("el numero de jugadores digitado es erróneo, solo pueden jugar 1 o dos jugadores");
			return jugador2EsIA();
		}
	} 

	/*! \brief guarda la ultima carta jugada
	 * guarda la ultima carta jugada en un String para utilizarse cuando se verifica la ultima carta al inicio de cada turno
	 * 
	 */
	public String ultimaCarta(){
		return "7 Azul";
	}


	/*! \brief Método que ejecuta los ciclos del juego
	 * Método principal que se encarga de ejectar los ciclos para cada uno de los dos tipos de partidas (un jugador y dos jugadores)
	 * 
	 */
	public void jugar(){
	
	if(jugador2IA == false){
		
		while(condicionGanar == false){

			while(turno % 2 == 0){

				String x = ultimaCarta();

				if(x.charAt(0)==9){
					contadorCome2 = 0;
				}

				else if(x.charAt(0)==10){
					jugador1.buscarEnPila(mazoParaEsteJuego);
				}

				else if(x.charAt(0)==8){
					contadorCome2++;
					contadorCome2++;
					turno++;
				}
				else{
					if(contadorCome2!=0){
						jugador1.come2(contadorCome2, mazoParaEsteJuego);
						turno++;
					}
					
					else{
						ponerCartaValida1();
						if(2>0){
							System.out.println("felicidades ha ganado");
							condicionGanar=true;
						}

						else{
						System.out.println("Es el turno del siguiente jugador");
						turno++;
						}

					}
				}
			}

			while(turno % 2 != 0){
				String x = ultimaCarta();

				if(x.charAt(0)==9){
					contadorCome2 = 0;
					turno++;
				}

				else if(x.charAt(0)==10){
					jugador2.buscarEnPila(mazoParaEsteJuego);
				}

				else if(x.charAt(0)==8){
					contadorCome2++;
					turno++;
				}
				else{
				ponerCartaValida1();
				jugador2.come2(contadorCome2, mazoParaEsteJuego);


						/*jugador2.getCantidadCartas>=1*/
					if(2>=1){
						System.out.println("felicidades ha ganado");
						condicionGanar=true;
					}

					else{
						System.out.println("Es el turno del siguiente jugador");
						turno++;
					}
				}
			}
		}
	}

	else{

		while(!condicionGanar){

			while(turno % 2 == 0){

				String x = ultimaCarta();

				if(x.charAt(0)==9){
					contadorCome2 = 0;
					turno++;
				}

				else if(x.charAt(0)==10){
					jugador1.buscarEnPila(mazoParaEsteJuego);
				}

				else if(x.charAt(0)==8){
					contadorCome2++;
					turno++;
				}
				else{
					ponerCartaValida1();
					jugador1.come2(contadorCome2, mazoParaEsteJuego);

					System.out.println("Es el turno del CPU");
					turno++;
				}
			}

			while(turno % 2 != 0){

				String x = ultimaCarta();

				if(x.charAt(0)==9){
					contadorCome2 = 0;
					turno++;
				}

				else if(x.charAt(0)==10){
					jugador3.buscarEnPila(mazoParaEsteJuego);
				}

				else if(x.charAt(0)==8){
					contadorCome2++;
					turno++;
				}

				else{
					ponerCartaValida1();
					if(2>0){
							System.out.println("felicidades ha ganado");
							condicionGanar=true;
					}

					else{
						System.out.println("Es el turno del siguiente jugador");
						turno++;
					}

				}
			}
		}
	}
}
	public static void main(String[] args){
		Juego juego = new Juego();
		juego.jugar();
	}
}



