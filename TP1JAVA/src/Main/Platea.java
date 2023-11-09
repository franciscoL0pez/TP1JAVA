package Main;

public class Platea extends Ubicacion{

    public void nombreConTarifa(String unNombre, double unaTarifa){
        nombre = unNombre;
        tarifa = unaTarifa;
    }



    @Override
    public Double calcularTarifa() {
        //Tomo los ultimos dos caracteres
        String ultimosDosCaracteres = nombre.substring(nombre.length() - 2);

        //Los paso a int
        int numero = Integer.parseInt(ultimosDosCaracteres);

        return (tarifa * numero );
    }



}
