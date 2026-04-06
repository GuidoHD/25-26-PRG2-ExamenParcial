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


    public String consultaClasificacion() {
    String resultado = "";
    for (Equipo equipo : equipos) {
        resultado += equipo.mostrarPuntos() + "\n";
    }
    return resultado;
}

    public void mostrar() {
        System.out.println(consultaClasificacion());
    }

    public String lider() {
    Equipo lider = equipos.get(0);
    for (Equipo equipo : equipos) {
        if (equipo.getPuntos() > lider.getPuntos()) {
            lider = equipo;
        }
    }
    return "Lider: " + lider.mostrarInformacion();
    }

    public String ultimo() {
        Equipo ultimo = equipos.get(0);
        for (Equipo equipo : equipos) {
            if (equipo.getPuntos() < ultimo.getPuntos()) {
                ultimo = equipo;
            }
        }
        return "Ultimo: " + ultimo.mostrarInformacion();
    }


}
