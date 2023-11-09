package Main;

public abstract class Artista implements CalcularUnPrecio {

    protected Double tarifa;
    protected String nombreArtista;

    public void nombreConTarifa(String unNombre, Double unaTarifa){
        nombreArtista = unNombre;
        tarifa = unaTarifa;
    }

    public abstract Double calcularTarifa();

    public String nombre(){
        return nombreArtista ;
    }

    public Double tarifa(){
        return tarifa ;
    }
}
