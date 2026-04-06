package entregas.huidobroMarcos;

class Cliente {
    public static void main(String[] args) {
        
        Liga liga = new Liga();
        liga.crearLiga("Liga Universitaria Santander - Temporada 2024/25");

        Equipo losCracks = new Equipo("Los Cracks");
        losCracks.sumarJugador(8);

        Equipo byteFC = new Equipo("Byte FC");
        byteFC.sumarJugador(7);

        Equipo compiladores = new Equipo("Compiladores");
        compiladores.sumarJugador(9);

        liga.añadirEquipo(losCracks);
        liga.añadirEquipo(byteFC);
        liga.añadirEquipo(compiladores);





        crearLiga()
        partidosPendientes()
        reprogramarPartido()
        consultarClasificacion()
        consultarEquipo()
        jugadoresEquipo()
    }
}