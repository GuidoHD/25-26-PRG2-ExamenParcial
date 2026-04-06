package entregas.huidobroMarcos;

import java.util.ArrayList;

class Equipo {

    private String nombre;
    private String color;
    private int puntos;
    private int jugadores;


    public Equipo equipo() {
        return new Equipo("");
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.color = "";
        this.puntos = 0;
        this.jugadores = 0;
    }


    public void resultados(String resultados) {
        this.partidos.add(resultados);
    }

    public int numero_Jugadores(int jugadores) {
        return this.jugadores;
    }

    public void sumarJugador(int jugadores) {
        this.jugadores += jugadores;
    }

    public void añadirVictoria() {
        this.puntos += 3;
    }

    public void añadirEmpate() {
        this.puntos += 1;
    }

    public String mostrarPuntos() {
        return nombre + " - " + puntos + " puntos";
    }

    public String mostrarInfo() {
        return "Equipo: " + nombre + " | Color: " + color + " | Jugadores: " + jugadores + " | Puntos: " + puntos + " puntos";
    }

    public String color() {
        return this.color;
    }

    public void verPartidos() {
        for (String partido : partidos) {
            System.out.println(partido);
        }
    }

    public String consultarEquipo() {
        return mostrarInfo();
    }
}