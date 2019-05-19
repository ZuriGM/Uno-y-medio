//! \class Clase Interfaz que se utiliza para pedir datos al jugador/usuario

/*!
  Clase encargada de representar una carta de un deck. 
  Convierte hileras de texto a numeros enteros
  y los modifica para imprimir al usuario datos más facilmente
*/


import javax.swing.JOptionPane;

public class Interfaz {
   
   public String solicitarDatoAlUsuario(String titulo){
      String contenido = JOptionPane.showInputDialog(titulo);
      return contenido;
   }

   public int solicitarNumeroEntero(String titulo){
      String valorDigitado = this.solicitarDatoAlUsuario(titulo);
      int valorEntero = 0;
      try{
         valorEntero = Integer.parseInt(valorDigitado);
      }
      catch(NumberFormatException e){
         System.err.println("Ocurrio un error: " + e + "\n");
         solicitarNumeroEntero("debe digitar un numero entero entre 1 y 2 (cantidad de jugadores)");
      }

      return valorEntero;
   }

  /*! \brief determina si la partida es de dos jugadores o de uno contra la CPU
   *
   * pregunta la cantidad de jugadores y compara el dato recibido,
     si son dos jugadores entonces devuelve false, lo que indica que el jugador 2 no es el CPU si no un jugador
   */
   public static void main (String [] args){
      Interfaz interfaz = new Interfaz();
      int jugadores = interfaz.solicitarNumeroEntero("Digite la cantidad de jugadores");
   }


}