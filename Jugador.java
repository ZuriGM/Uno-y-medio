//! \class Clase Juego que se utiliza para ejecutar el juego

/*!
  Crea y ejecutael programa, además de nombrar ciertos atributos que permiten la ejecuión de la mayoría
  métodos.
*/

public class Jugador {
	
		Mazo[] cartasJugador = new Mazo[73];
		int indiceDeck = 0; ///< contador que permite saber cúal es la siguiente celda disponible en la mano y que permita agregar una carta
		Mazo mazo = new Mazo(); 
		Mazo mazoParaEsteJuego[] = new Mazo[73];
	
	public Jugador() {
		String[] deckJugador = new String[73];
	}
	
    /*! \brief retorna el valor actual del indiceDeck
    *
    * Imprime el valor almacenado en IndiceDeck, lo que signidica que imprime el indice última celda agregada en el arreglo la ultima que vez que se modifcó con algun método
    * 
    */
	public int getIndiceDeck(){
		return indiceDeck;
	}
    /*! \brief Asigna un número al indiceDeck
    *
    \param int el número que asignará
    */
	public void setIndiceDeck(int valor){
		indiceDeck = valor;
	}
	/*! \brief retorna el arreglo que contiene las cartas del jugador
    *
    * retorna un arreglo de tipo Mazo que contiene las cartas del jugador
    * 
    */
	public Mazo[] getCartasJugador(){
		
		return cartasJugador;
	}
	
	/*! \brief crea los manos iniciales de cada jugador
    *
    \param int el número de cartas que se agregaran a la mano
    */
	public Mazo[] crearMazos(int cartas)
	{
		int indice = indiceDeck;
		cartasJugador[indiceDeck] = mazoParaEsteJuego[indice];
		indiceDeck++;

		return cartasJugador;
	}

	/*! \brief método que permite agarrar una carta de la pila
    *
    *método que permite agarrar una carta de la pila
    */
	public void agarrarDeLaPila(){
		
	}
	
	public static void main (String args[]){
		Mazo mazo = new Mazo();
		mazo.revolver();
		Jugador jugador = new Jugador();
		jugador.crearMazos(5);
		Mazo[] dato = jugador.getCartasJugador(); 
		System.out.println(jugador);
	}

}