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
		
		Mazo mazo = new Mazo();
		Mazo mazoParaEsteJuego = new Mazo();


	/*! \brief determina si la partida es de dos jugadores o de uno contra la CPU
	 *
	 * pregunta la cantidad de jugadores y compara el dato recibido,
	   si son dos jugadores entonces devuelve false, lo que indica que el jugador 2 no es el CPU si no un jugador
	 */
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

	/*! \brief Agrega 2 cartas a la mano del jugadores
	 * este método agrega ejecuta una accion llamada come 2, que agrega 2 cartas a la mano de un jugador x cantidad de veces (cantidad de cartas come dos acuimuladas)
	 * 
	 */
	public void come2 (String[] deck){

		//for(int i = 0; i<=contadorCome2; i++){
		//	deck[indiceDelMazo] = mazo ....
		//}
	}

	/*! \brief ejecuta la acción de buscar cartas en la pila de cartas ya jugadas
	 * este método imprime la lista de cartas ya jugadas y le permite al jugador elegir una carta
	 * 
	 */
	public void buscarEnPila(){
	//	imprimirPila();
	//	agarrarDePila();
	}
	/*! \brief guarda la ultima carta jugada
	 * guarda la ultima carta jugada en un String para utilizarse cuando se verifica la ultima carta al inicio de cada turno
	 * 
	 */
	public String ultimaCarta(){
		return "a";
	}


	/*! \brief Método que ejecuta los ciclos del juego
	 * Método principal que se encarga de ejectar los ciclos para cada uno de los dos tipos de partidas (un jugador y dos jugadores)
	 * 
	 */
	public void Jugar(){
	
	if(jugador2IA == false){
		
		/*while(condicionGanar == false){

			while(turno % 2 == 0){

				ultimaCarta();

				if(int x==9){
					contadorCome2 = 0;
					turno++;
				}

				else if(int==10){
					buscarEnPila();
				}

				else if(int==8){
					contadorCome2++;
					turno++;
				}
				else{
					ponerCartaValida();
					comer2();

					//preguntar condicionGanar = ?

					System.out.println("Es el turno del siguiente jugador")
					turno++;
			}

			while(turno % 2 != 0){

				ultimaCarta();

				if(int=9){
					contadorCome2 = 0;
					turno++;
				}

				else if(int=10){
					buscarEnPila();
				}

				else if(int=8){
					contadorCome2++;
					turno++;
				}
				else{
					ponerCartaValida();
					comer2();

					preguntar si cumple con la condicionGanar = ?

					System.out.println("Es el turno del siguiente jugador")
					turno++;
			} */
		}

	else{

		while(!condicionGanar){

			while(turno % 2 == 0){

			/*	ultimaCarta();

				if(int=9){
					contadorCome2 = 0;
					turno++;
				}

				else if(int=10){
					buscarEnPila();
				}

				else if(int=8){
					contadorCome2++;
					turno++;
				}
				
				else{
					ponerCartaValida();
					comer2();

					preguntar condicionGanar = ?

					System.out.println("Es el turno del CPU")
					turno++;
			}

			while(turno % 2 != 0){

				ultimaCarta();

				if(int=9){
					contadorCome2 = 0;
					turno++;
				}

				else if(int=10){
					buscarEnPilaCPU();
				}

				else if(int=8){
					contadorCome2++;
					turno++;
				}

				else{
					ponerCartaValidaCPU();
					comer2();

					preguntar condicionGanar = ?

					System.out.println("Es el turno del jugador")
					turno++;
				}
			*/}
		}
	}
	}

	public static void main(String[] args){

	}
}

//imprimir "turno de la IA"//


/*
turno IA:

revisa la ultima carta jugada

si fue comer:  busque en todo el arreglo si hay un come, un busca pila o un cancelar y ponga el primero

si fue un busca pila: busque en todo el arreglo si hay un come, un busca pila o un cancelar y ponga el primero

si fue un cancelar: continue

else: buscar una carta de igual color o numero.

}

}
*/




