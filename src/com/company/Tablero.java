package com.company;


import javax.swing.*;

public class Tablero {

    private final int ESPACIO = 5;
    private String aleatorio;
    private String secuencia;
    private String pista;
    private final int INTENTOS = 10;
    private static Tablero tablero = null;

    private Tablero() {
    }

    public static Tablero generateTablero() {

        if (tablero == null) tablero = new Tablero();

        return tablero;
    }
    //Inicia el juego y lee sus normas
    public boolean iniciarJuego(){

        return JOptionPane.showConfirmDialog(null,"En este juego tendras que adivinar cinco numeros aleatorios y sus posisciones." +
                "\nPara facilitarte la tarea se te daran unas pistas: " +
                "\n\n   ->Si has acertado el número y la posicion (O)" +
                "\n\n   ->Si has acertado el numero pero no la posicion (x)" +
                "\n\n   ->Si el número no existe en la secuencia (-). ","Bienvenido a Mastermind",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION;
    }
    //Determina el mensaje final a mostrar en funcion de si has ganado o no
    public String menasajeFinal(){

        if(secuencia.equals(aleatorio)) return "Enhorabuena! Juega otra vez y demuestra que no ha sido pura suerte";
        else return "Oh no! No te rindas e intentalo de nuevo!";

    }

    public int getESPACIO() {
        return ESPACIO;
    }

    public int getINTENTOS() {
        return INTENTOS;
    }

    public String getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(String aleatorio) {
        this.aleatorio = aleatorio;
    }

    public String getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(String secuencia) {
        this.secuencia = secuencia;
    }

    public String getPista() {
        return pista;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }
}
