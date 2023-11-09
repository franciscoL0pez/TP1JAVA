package Main;

public class Vip extends Ubicacion {

    private int lugaresDisponibles;
    public void nombreConTarifaYUnosLugares(String unaUbicacion, double unaTarifa, int unosLugares) {
        nombre = unaUbicacion;
        tarifa = unaTarifa;
        lugaresDisponibles = unosLugares;

    }

    @Override
    public Double calcularTarifa() {
        lugaresDisponibles = lugaresDisponibles -1;
        return  (tarifa / (lugaresDisponibles+1));
    }
}
