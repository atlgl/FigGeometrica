import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by ANGELUS on 30/10/16.
 * Clase que muestra todos los menus dentro de la aplicación
 */
public class MenuFiguras {

    private Scanner scan;
    private LinkedList<FigurasGeometricas> figuras;

    /**
     * Constructor por default del menu de figuras
     */
    public MenuFiguras() {
        this.scan = new Scanner(System.in);
        figuras=new LinkedList<>();
    }

    /**
     * Metodo que muestra toda a estructura del menu principal del programa
     * Selección de los objetos a crear
     */
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
                    figuras.add(cuadrado);

                    break;
                case 2:

                    System.out.println("-----Triangulo-------");
                    System.out.println("Tamaño del triangulo\n");
                    Triangulo triangulo = new Triangulo(leerInt());
                    menuFiguras(triangulo);
                    figuras.add(triangulo);
                    break;

                case 3:
                    System.out.println("-----Rectangulo-------");
                    System.out.println("Proporcione la altura\n");
                    int altura=leerInt();
                    System.out.println("Proporcione el ancho\n");
                    int ancho=leerInt();
                    Rectangulo rectangulo = new Rectangulo(ancho,altura);
                    menuFiguras(rectangulo);
                    figuras.add(rectangulo);
                    break;
                case 4:
                    if(!figuras.isEmpty()){
                        System.out.println("Nombre del archivo ??\n");
                        GuardarTexto guardarTexto=new GuardarTexto(leerString());
                        guardarTexto.openFile();
                        for (int i = 0; i <figuras.size() ; i++) {
                            guardarTexto.guardarLineaTxt(figuras.get(i).getPrintfig().toString());
                        }
                        guardarTexto.close();
                    }
                    else{
                        System.out.println("Debe agregar algunas figuras");
                    }
                    break;
                case 5:
                    if(!figuras.isEmpty()){
                        for (int i = 0; i <figuras.size() ; i++) {
                            System.out.println(figuras.get(i).getPrintfig().toString());
                        }
                    }
                    break;
                default:
                    System.out.println("Opcion no disponible");
            }

        }while(opc!=6);
    }

    /**
     * Metodo que muestra el menu de las operaciones que se pueden hacer con las figuras geometricas
     * @param figura
     */
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
                    figura.imprimir();
                    break;
                case 3:
                    System.out.println("Cuantos espacios desea mover la figura?\n");
                    figura.moverFigura(leerInt());
                    figura.imprimir();
                    break;
                case 4:
                    System.out.println("Area Calculada es:"+figura.calcularArea()+"\n");
                    break;
            }

        }while(opcfig!=5);

    }

    /**
     * Metodo leer un entero evita que una lectura cause algun error en pantalla
     * Retorna el entero leido del teclado
     * @return int
     */
    public  int leerInt(){
        try{
            return scan.nextInt();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }

    /**
     * Metodo leer una cadena de texto evita excepciones en la lectura de una cadena de texto
     * Retorna la cadena de texto leida
     * @return String
     */
    public String leerString(){
        try{
            return scan.next();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return "";
    }

    /**
     * Metodo principal que sirve para ejecutar la aplicacion de escritorio
     * @param args
     */
    public static void main(String args[]){
        MenuFiguras mf=new MenuFiguras();
        mf.mostrarMenu();
    }
}
