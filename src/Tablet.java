import java.util.Scanner;
public class Tablet extends DispositivoMovil{
    Scanner scanner = new Scanner(System.in);
    private String marca;

    public void VerPelicula(){
        System.out.println("Ingrese el nombre de la pelicula que desea ver");
        String pelicula = scanner.nextLine();
        System.out.println("Reproduciendo la pelicula: " + pelicula);
    }
    public void VerSerie(){
        System.out.println("Ingrese el nombre de serie que desea ver");
        String serie = scanner.nextLine();
        System.out.println("Ingrese la temporada de la serie: " + serie);
        String temporada = scanner.nextLine();
        System.out.println("Ingrese el capitulo de la serie: " + serie + " temporada: "+temporada);
        String capitulo = scanner.nextLine();
        System.out.println("Reproduciendo la serie: " + serie + " temporada: " + temporada + " capitulo: " + capitulo);
    }
}
