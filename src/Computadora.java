import java.util.Scanner;
public class Computadora extends DispositivoElectronico{
    Scanner scanner = new Scanner(System.in);
    private String nombre;

    public void EscribirDocumento (){

            System.out.println("Ingrese el texto");
            String documento = scanner.nextLine();
            System.out.println("documento creado exitosamente");
            System.out.println(documento);


    }
}
