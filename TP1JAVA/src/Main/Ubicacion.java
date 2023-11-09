package Main;

public abstract class Ubicacion implements CalcularUnPrecio {

    protected Double tarifa;
    protected String nombre;

    public abstract Double calcularTarifa();

    public String nombre(){
        return nombre;
    }

    public Double tarifa(){
        return tarifa;
    }
}
