public class Electrodomestico extends DispositivoElectronico{
    private String nombre;

    public void MedirTemperatura (){
        int numeroGenerado = (int) Math.floor(Math.random() * 12 + 1);
        System.out.println("La temperatuta medida es: " + numeroGenerado);

    }
}
