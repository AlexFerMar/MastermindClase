import javax.swing.*;


public class Funciones {

    //Esta funcion genera un String que contiene 5 numeros aleatorios
    public static void generateAleatorios(Tablero tablero) {
        String numerosAleatorios = "";
        for (int i = 0; i < tablero.getESPACIO(); i++) {
            numerosAleatorios += (int) (Math.random() * 10);
        }
        tablero.setAleatorio(numerosAleatorios);
        System.out.println(tablero.getAleatorio());
    }

    //Esta funcion le pide al usuario 5 numeros para generar un String con ellos
    public static void askRespuesta(Tablero tablero) {

        String numerosRespuesta = "";
        for (int i = 0; i < tablero.getESPACIO(); i++) {

            Integer numeroSecuencia = 0;

            do {
                numeroSecuencia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero del 0 al 9"));
            } while (numeroSecuencia > 9 || numeroSecuencia < 0);

            numerosRespuesta += numeroSecuencia.toString();
        }
        tablero.setSecuencia(numerosRespuesta);
        System.out.println(tablero.getSecuencia());
    }

    //Esta funcion comprueba si el String dado por el usuario y la generada aleatoriamente coinciden y devuelve un true o un false en consecuencia
    public static boolean checkVictoria(Tablero tablero) {

        return tablero.getSecuencia().equals(tablero.getAleatorio());

    }

    //Esta funcion revisa que numeros coiciden en cada una de las posiciones del String, si el numero existe en el string o si el numero no esta dentro
    public static void givePista(Tablero tablero) {
        String pista = "";

        for (int i = 0; i < tablero.getESPACIO(); i++) {

            if (tablero.getSecuencia().charAt(i) == tablero.getAleatorio().charAt(i)) pista += "O";

            else if (tablero.getAleatorio().indexOf(tablero.getSecuencia().charAt(i)) !=-1) pista += "X";

            else pista += "-";
        }
        tablero.setPista(pista);
    }

    public static void showPista(Tablero tablero){

        JOptionPane.showMessageDialog(null, "Aqui tienes una pequeña pista:\n" + tablero.getSecuencia() + "\n" + tablero.getPista());
    }

    public static boolean volverJugar(Tablero tablero){

        return JOptionPane.showConfirmDialog(null,tablero.menasajeFinal() , "Volver a jugar?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }


}
