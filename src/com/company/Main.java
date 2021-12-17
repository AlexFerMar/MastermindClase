package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Tablero tablero = Tablero.getInstance();
        if (tablero.iniciarJuego())
            do {
                Funciones.generateAleatorios(tablero);
                boolean victoria = false;
                for (int intentos = tablero.getINTENTOS(); intentos != 0 && !victoria; intentos--) {

                    Funciones.askRespuesta(tablero);

                    victoria = Funciones.checkVictoria(tablero);

                    if (!victoria) {
                        Funciones.givePista(tablero);

                        Funciones.showPista(tablero);
                    }
                }
            } while (Funciones.volverJugar(tablero));

        JOptionPane.showMessageDialog(null, "Muchas gracias, ojala vuelvas a jugar!");
    }

}

