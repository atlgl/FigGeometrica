import java.util.Scanner;

/**
 * Created by ANGELUS on 30/10/16.
 */
public class MenuFiguras {

    private Scanner scan;

    public MenuFiguras() {
        this.scan = new Scanner(System.in);
    }

    public void mostrarMenu(){
        int opc=0;
        do{

            System.out.println("---Menu de Figuras Geometricas");
            System.out.println("1.-Cuadrado");
            System.out.println("2.-Triangulo");
            System.out.println("3.-Rectangulo");
            System.out.println("4.-Guardar");
            System.out.println("5.-Mostrar");
            System.out.println("6.-Salir");
            opc=leerInt();
            switch (opc) {
                case 1:
                    System.out.println("-----Cuadrado-------");
                    System.out.println("Tamaño del lado del cuadrado\n");
                    Cuadrado cuadrado = new Cuadrado(leerInt());

                    menuFiguras(cuadrado);

                    break;
                case 2:

                    System.out.println("-----Triangulo-------");
                    System.out.println("Tamaño del triangulo\n");
                    Triangulo triangulo = new Triangulo(leerInt());
                    menuFiguras(triangulo);
                    break;

                case 3:
                    System.out.println("-----Rectangulo-------");
                    System.out.println("Proporcione la altura\n");
                    int altura=leerInt();
                    System.out.println("Proporcione el ancho\n");
                    int ancho=leerInt();
                    Rectangulo rectangulo = new Rectangulo();
                    //menuFiguras(rectangulo);
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

        }while(opc!=6);


    }


    public void menuFiguras(FigurasGeometricas figura){
        int opcfig=0;
        do{
            System.out.println("---1.-Pintar-------\n");
            System.out.println("---2.-Rotar-------\n");
            System.out.println("---3.-Mover--------\n");
            System.out.println("---4.-Calcular area--------\n");
            System.out.println("---5.-Salir--------\n");
            opcfig=leerInt();
            switch (opcfig){
                case 1:
                    figura.pintar();
                    figura.imprimir();
                    break;
                case 2:
                    figura.rotarFigura();
                    figura.rotarFigura();
                    break;
                case 3:
                    System.out.println("Cuantos espacios desea mover la figura?\n");
                    figura.moverFigura(leerInt());
                    figura.imprimir();
                    break;
                case 4:
                    System.out.println("Area Calculada es:"+figura.calcularArea()+"\n");
            }

        }while(opcfig!=5);

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

    public static void main(String args[]){
        MenuFiguras mf=new MenuFiguras();
        mf.mostrarMenu();
    }
}
