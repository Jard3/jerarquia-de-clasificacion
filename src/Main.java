import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Laptop laptop = new Laptop();
        Desktop desktop = new Desktop();
        Refrigerador refrigerador = new Refrigerador();
        Tablet tablet = new Tablet();
        Telefono telefono = new Telefono();

        int salir = 0;
        while (salir == 0) {
System.out.println("Seleccione un opcion");
System.out.println("1: Escribir documento"+"\n"+
        "2: Porcentaje de uso de los recursos"+"\n"+
                "3: Renderizar"+"\n"+
                "4: Medir temperatura"+"\n"+
                "5: Cambiar temperatura"+"\n"+
                "6: Mostrar bateria restante"+"\n"+
                "7: Enviar mensaje"+"\n"+
                "8: Ver pelicula"+"\n"+
                "9: Ver serie"+"\n"+
                "10: Salir"
        );

int opcion = scanner.nextInt();


switch (opcion) {
    case 1:
        laptop.EscribirDocumento();
    break;
    case 2:
        laptop.PorcentajeUso();
        break;
    case 3:
        desktop.RenderizarVideo();
        break;
    case 4:
        refrigerador.MedirTemperatura();
        break;
    case 5:
        refrigerador.CambiarTemperatura();
        break;
    case 6:
        tablet.MostrarBateríaRestante();
        break;
    case 7:
        telefono.EnviarMensaje();
        break;
    case 8:
        tablet.VerPelicula();
        break;
    case 9:
        tablet.VerSerie();
        break;
    case 10:
        salir =1;
        break;
}
}
    }
}