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

    public String fecha() {
        return this.fecha;
    }
    public String preguntaEquipos() {
        return local.mostrarInformacion() + "VS" visitante.mostrarInformacion();
        
    }
    
    public boolean estaPendiente() {
    return this.pendiente;
    }

    public String mostrarResultados() {
    if (pendiente) {
        return fecha + " | " + local.mostrarInformacion() + " vs " + visitante.mostrarInformacion() + " - pendiente";
    }
    return fecha + " | " + local.mostrarInformacion() + " " + golesLocal + " - " + golesVisitante + " " + visitante.mostrarInformacion();
    }

    public String reprogramarPartido() {
    this.pendiente = true;
    return "Partido reprogramado: " + mostrarResultados();
    }


    
}