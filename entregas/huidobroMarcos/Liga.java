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

    public String Equipos() {
    String resultado = "";
    for (Equipo equipo : equipos) {
        resultado += equipo.mostrarInformacion() + "\n";
    }
    return resultado;
    }

    public String Clasificacion() {
        return clasificacion.consultaClasificacion();
    }

    public String Partidos() {
        String resultado = "";
        for (Partido partido : partidos) {
            resultado += partido.mostrarResultados() + "\n";
        }
        return resultado;
    }

    public void crearLiga() {
        this.nombre = "Liga Universitaria Santander - Temporada 2025/26";
    }

}