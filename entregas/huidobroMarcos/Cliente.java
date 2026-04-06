package entregas.huidobroMarcos;

class Cliente {
    public static void main(String[] args) {
        
        Liga liga = new Liga();
        liga.crearLiga("Liga Universitaria Santander - Temporada 2025/26");

        Equipo losCracks = new Equipo("Los Cracks");
        losCracks.sumarJugador(8);

        Equipo byteFC = new Equipo("Byte FC");
        byteFC.sumarJugador(7);

        Equipo compiladores = new Equipo("Compiladores");
        compiladores.sumarJugador(9);

        liga.añadirEquipo(losCracks);
        liga.añadirEquipo(byteFC);
        liga.añadirEquipo(compiladores);


        Partido partidoUno = new Partido(losCracks, byteFC, "01/04/2026");
        Partido partidoDos = new Partido(compiladores, losCracks, "08/04/2026");
        Partido partidoTres = new Partido(byteFC, compiladores, "15/04/2026");

        liga.añadirPartido(partidoUno);
        liga.añadirPartido(partidoDos);
        liga.añadirPartido(partidoTres);



        partidoUno.registrarResultado(3, 1);
        partidoDos.registrarResultado(2, 2);





        crearLiga()
        partidosPendientes()
        reprogramarPartido()
        consultarClasificacion()
        consultarEquipo()
        jugadoresEquipo()
    }
}