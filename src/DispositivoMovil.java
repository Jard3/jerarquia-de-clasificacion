public class DispositivoMovil extends DispositivoElectronico{
    private String tipo;

    public void MostrarBateríaRestante (){
        int numeroGenerado = (int) Math.floor(Math.random() * 100 + 1);
        System.out.println("Su porcentaje de bateria restante es: " + numeroGenerado+"%");

    }
}
