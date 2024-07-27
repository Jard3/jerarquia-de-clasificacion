public class Laptop extends Computadora{
    private String marca;
    private String modelo;

    public void PorcentajeUso(){
        int uso = (int) Math.floor(Math.random() * 100 + 1);
        System.out.println("El porcentaje de uso del procesador es de: "+uso);
    }

}
