package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Tablero tablero = Tablero.generateTablero();
        if (tablero.iniciarJuego())
            do {
                Funciones.generateAleatorios(tablero);
                boolean victoria = false;
                for (int intentos = tablero.getINTENTOS(); intentos != 0 && !victoria; intentos--) {

                    Funciones.askRespuesta(tablero);

                    victoria = Funciones.checkVictoria(tablero);

                    if (!victoria) {
                        Funciones.givePista(tablero);

                        JOptionPane.showMessageDialog(null, "Aqui tienes una pequeña pista:\n" + tablero.getSecuencia() + "\n" + tablero.getPista());
                    }
                }
            } while ((JOptionPane.showConfirmDialog(null, tablero.menasajeFinal(), "Volver a jugar?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION));

        JOptionPane.showMessageDialog(null, "Muchas gracias, ojala vuelvas a jugar!");
    }

}

