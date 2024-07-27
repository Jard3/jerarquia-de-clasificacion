import java.util.Scanner;
public class Refrigerador extends Electrodomestico{
    Scanner scan = new Scanner(System.in);
    private String Modelo;

    public void CambiarTemperatura(){
        int temperatura = 0;
        System.out.println("La temperatura actual es: "+temperatura);
        System.out.println("Deseas subir o bajar la temperatura");
        String SubirBajar = scan.next();
        if (SubirBajar.equals("bajar")||SubirBajar.equals("Bajar")){
            System.out.println("Cuantos grados deseas bajar");
            int grados = scan.nextInt();
            temperatura -= grados;
            System.out.println("La temperatura es: "+temperatura);
        }
        else if (SubirBajar.equals("subir")||SubirBajar.equals("Subir")){
            System.out.println("Cuantos grados deseas subir");
            int grados = scan.nextInt();
            temperatura += grados;
            System.out.println("La temperatura es: "+temperatura);
        }


    }
}
