package Main;

public class Campo extends Ubicacion {


    public void nombreCon(String unaUbicacion, Double unaTarifa){
        nombre = unaUbicacion;
        tarifa = unaTarifa;
    }
    @Override
    public Double calcularTarifa() {
        return tarifa;
    }
}
