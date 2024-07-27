public class Desktop extends Computadora{
    private String nombre;

    public void RenderizarVideo(){
        int Renderizado = 0;
        System.out.println("Renderizando Video");
        while (Renderizado < 100){
        int numGenerado = (int) Math.floor(Math.random() * 100 + 1);
        Renderizado += numGenerado;
        if (Renderizado > 100){
            Renderizado = 100;
        }
        System.out.println("Porcentaje de Renderizado: " + Renderizado +"%");}
    }
}
