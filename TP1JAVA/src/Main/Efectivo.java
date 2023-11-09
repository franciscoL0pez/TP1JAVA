package Main;

public class Efectivo implements MetodoDePago {


    @Override
    public Double calcularTarifa(Double unCosto) {
        return unCosto;
    }
}
