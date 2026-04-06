package entregas.huidobroMarcos;

class Partido {

    public Partido(Equipo local, Equipo visitante, String fecha) {
    this.local = local;
    this.visitante = visitante;
    this.fecha = fecha;
    this.pendiente = true;
    this.golesLocal = 0;
    this.golesVisitante = 0;
    }

    private Equipo local;
    private Equipo visitante;
    private String fecha;
    private int golesLocal;
    private int golesVisitante;
    private boolean pendiente;

    public String fecha() {}
    public String preguntaEquipos() {}
    public boolean estaPendiente() {}
    public String mostrarResultados() {}
    public String reprogramarPartido() {}
}