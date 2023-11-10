package Main;
import java.util.ArrayList;
import java.util.Comparator;

public class Algotek {
    private final ArrayList<Evento> eventos;
    private Artista artista;

    public Algotek() {

        this.eventos = new ArrayList<>();
    }


    public void registrarunArtistaNacional(String unEvento, String unNombreDeArtista, Double unaTarifa) {
        artista = new ArtistaNacional();
        artista.nombreConTarifa(unNombreDeArtista, unaTarifa);
    }

    public void registrarunArtistaInternacional(String unEvento, String unArtista, double unaTarifa) {

        artista = new ArtistaInternacional();
        artista.nombreConTarifa(unArtista,unaTarifa);
    }


    public void registrarUbicacionPlatea(String unEvento, String unaUbicacion, Double unaTarifa) {
        Platea ubicacion = new Platea();
        ubicacion.nombreConTarifa(unaUbicacion, unaTarifa);
        eventos.add(new Evento(unEvento, artista, ubicacion));
    }

    public void registrarUbicacionVip(String unEvento, String unaUbicacion, double unaTarifa, int unosLugares) {
        Vip ubicacion = new Vip();
        ubicacion.nombreConTarifaYUnosLugares(unaUbicacion,unaTarifa,unosLugares );
        eventos.add(new Evento(unEvento, artista, ubicacion));

    }

    public void registrarUbicacionCampo(String unEvento, String unaUbicacion, double tarifa) {
        Campo ubicacion = new Campo();
        ubicacion.nombreCon(unaUbicacion, tarifa);
        eventos.add(new Evento(unEvento, artista, ubicacion));
    }


    public Double costoDeEntrada(String unEvento, String unaUbicacion,MetodoDePago unMetodo ) {
        Double costo = null;
        for (Evento evento : eventos) {
            if (unaUbicacion.equals(evento.ubicacion().nombre())) {

                costo = evento.pagarcon(unMetodo);
            }
        }

        return costo;

    }



    public Double costoEntradaMasBarata(String unEvento, MetodoDePago unMetodo) {
        Evento enTradaMasBarata = eventos.stream()
                .min(Comparator.comparing(Evento::calcularTarifa))
                .orElse(null);


        return ( enTradaMasBarata.pagarcon(unMetodo));

    }
}
