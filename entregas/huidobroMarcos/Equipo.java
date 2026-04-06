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


    public void resultados(String resultados) {}
    public int numeroJugadores(int jugadores) {}
    public void sumarJugador(int jugadores) {}
    public void añadirVictoria() {}
    public void añadirEmpate() {}
    public String mostrarPuntos() {}
    public String mostrarInfo() {}
    public String color() {}
    public void verPartidos() {}
    public String consultarEquipo() {}
}