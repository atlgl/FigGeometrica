import java.util.Scanner;

/**
 * Created by ANGELUS on 30/10/16.
 */
public class MenuFiguras {

    private Scanner scan;


    public void mostrarMenu(){
        int opc=0;
        System.out.println("---Menu de Figuras Geometricas");
        System.out.println("1.-Cuadrado");
        System.out.println("2.-Triangulo");
        System.out.println("3.-Rectangulo");
        System.out.println("4.-Guardar");
        System.out.println("5.-Mostrar");
        System.out.println("6.-Salir");
        switch (opc)
        {
            case 1:
                break;
            case 2:
                break;

            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                System.out.println("Opcion no disponible");

        }


    }


    public  int leerInt(){
        try{
            return scan.nextInt();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }

    public String leerString(){
        try{
            return scan.next();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return "";
    }
}
