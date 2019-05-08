public class Jugador {
	
		Mazo[] cartasJugador = new Mazo[73];
		int indiceDeck = 0;
		Mazo mazo = new Mazo();
		Mazo mazoParaEsteJuego[] = new Mazo[73];
	
	public Jugador() {
		
		String[] deckJugador = new String[73];
		
	}
	

	public int getIndiceDeck(){
		return indiceDeck;
	}

	public void setIndiceDeck(int valor){
		indiceDeck = valor;
	}

	public Mazo[] getCartasJugador(){
		
		return cartasJugador;
	}
	
	public Mazo[] crearMazos(int cartas)
	{
		int indice = indiceDeck;
		cartasJugador[indiceDeck] = mazoParaEsteJuego[indice];
		indiceDeck++;

		return cartasJugador;
	}

	
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