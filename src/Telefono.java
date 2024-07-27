import java.util.Scanner;
public class Telefono extends DispositivoMovil{
    Scanner scanner = new Scanner(System.in);
    private String marca;

    public void EnviarMensaje (){
        System.out.println("A quien desea enviar el mensaje");
        String destinatario = scanner.nextLine();
        System.out.println("El destinatario es: " + destinatario);
        System.out.println("Ingrese el mensaje");
        String mensaje = scanner.nextLine();
        System.out.println("Mensaje enviado exitosamente");
        System.out.println(mensaje);
    }
}
