package Main;

public class Evento {
    private String nombreDelEvento;
    private Ubicacion ubicacion;

    private Artista artista;


    public Evento(String unEvento, Artista unArtista, Ubicacion unaUbicacion){
        nombreDelEvento = unEvento;
        ubicacion = unaUbicacion;
        artista = unArtista;

    }

    public String nombre(){
        return nombreDelEvento;
    }


    public Artista artista(){
        return artista;
    }


    public Ubicacion ubicacion(){
        return ubicacion;
    }

    public Double calcularTarifa(){
        Double costo;

        costo = artista.calcularTarifa() + ubicacion.calcularTarifa() ;

        return costo;
    }

    public Double pagarcon(MetodoDePago unMetodoDePago){
        Double precio =  calcularTarifa();

        return (unMetodoDePago.calcularTarifa(precio));
    }
}
