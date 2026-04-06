package entregas.huidobroMarcos;

import java.util.ArrayList;

class Liga {

    private String nombre;
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> partidos;
    private Clasificacion clasificacion;

    public Liga liga() {
        return new Liga();
    }

    public Liga() {
        this.equipos = new ArrayList<>();
        this.partidos = new ArrayList<>();
        this.clasificacion = new Clasificacion();
    }

    public void añadirEquipo(Equipo equipo) {
        this.equipos.add(equipo);
        this.clasificacion.añadirEquipo(equipo);
    }

    public void añadirPartido(Partido partido) {
        this.partidos.add(partido);
    }

    public String Equipos() {}
    public String Clasificacion() {}
    public String Partidos() {}
    public void crearLiga() {}
}