package entregas.huidobroMarcos;

import java.util.ArrayList;

class Clasificacion {

    private ArrayList<Equipo> equipos;

    public Clasificacion clasificacion() {
        return new Clasificacion();
    }

    public Clasificacion() {
        this.equipos = new ArrayList<>();
    }

    public void añadirEquipo(Equipo equipo) {
        this.equipos.add(equipo);
    }

    
    public String consultaClasificacion() {}
    public void mostrar() {}
    public String lider() {}
    public String ultimo() {}
}
