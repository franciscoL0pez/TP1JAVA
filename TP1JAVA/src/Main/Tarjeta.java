package Main;

public class Tarjeta implements MetodoDePago {

    private String nombre ;


    public void conNombre(String unNombre){
        nombre = unNombre;
    }


    public Double calcularTarifa(Double unCosto){
        return (unCosto *0.8);
    }
}
