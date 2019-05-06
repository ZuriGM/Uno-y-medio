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

   public static void main (String [] args){
      Interfaz interfaz = new Interfaz();
      int jugadores = interfaz.solicitarNumeroEntero("Digite la cantidad de jugadores");
   }


}