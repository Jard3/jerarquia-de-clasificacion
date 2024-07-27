import java.util.Objects;
import java.util.Scanner;
public class DispositivoElectronico {
    Scanner scanner = new Scanner(System.in);
    private String nombre;

    public void Encender (){
        System.out.println("Deseas encender el dispositivo"+"\n"+
                "Si/No");
        String decision = scanner.nextLine();
        if (Objects.equals(decision, "Si") || Objects.equals(decision, "si")){System.out.println("El dispositivo encendio exitosamente");}
        else {System.out.println("El dispositivo permanece en su estado actual");}
    }
    public void Apagar (){
        System.out.println("Deseas apagar el dispositivo"+"\n"+
                "Si/No");
        String decision = scanner.nextLine();
        if (Objects.equals(decision, "Si") || Objects.equals(decision, "si")){System.out.println("El dispositivo apago exitosamente");}
        else {System.out.println("El dispositivo permanece en su estado actual");}
    }
}
