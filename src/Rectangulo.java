import java.util.Date;

/**
 * Created by ANGELUS on 29/10/16.
 * Clase encargada de crear una figura y de dibujarla en consola
 */
public class Rectangulo extends FigurasGeometricas {


    /**Constructor que permite crear un Rectangulo segun el alto y el ancho
     * @param ancho int
     * @param altura int
     */
    public Rectangulo(int ancho, int altura) {
        this.altura = altura;
        this.base = ancho;
        this.printfig=new StringBuilder();
    }

    /**
     * Metodo Sobrecargado que calcula el area de un cuadrado devuelve el valor en forma de entero
     * @return int
     */
    @Override
    public int calcularArea() {
        return base*altura;
    }

    /**
     * Metodo que se encarga de Rotar una figura
     */
    @Override
    public void rotarFigura() {
        printfig.append("-----------90 Grados-----------------\n");

        for(int col=1;col<=altura;col++)
            printfig.append(" *");

        printfig.append("\n");

        for(int fila = 2;fila < base; fila++){
            printfig.append(" *");
            for (int col = 2; col < altura; col++)
                printfig.append("  ");

            printfig.append(" * \n");
        }

        for (int fila = 1; fila <=altura ; fila++)
            printfig.append(" *");
        printfig.append("\n\n-------------------------------\n");

    }


    /**
     * Metodo sobrecargado que permite mover una figura
     * @param numespacio
     */
    @Override
    public void moverFigura(int numespacio) {

        printfig.append("-------------------------------\n");
        String espacios="";
        for (int i = 0; i <numespacio ; i++) {
            espacios+=FigurasGeometricas.TAB;
        }

        printfig.append(espacios);
        for(int col=1;col<=base;col++)
            printfig.append(" *");

        printfig.append("\n"+espacios);

        for(int fila = 2;fila < altura; fila++){
            printfig.append(" *");
            for (int col = 2; col < base; col++)
                printfig.append("  ");

            printfig.append(" * \n"+espacios);
        }

        for (int fila = 1; fila <=base ; fila++)
            printfig.append(" *");

        printfig.append("\n-------------------------------\n");
    }

    /**
     * Metodo Sobrecargado que se encarga de pintar una figura en este caso el cuadrado
     */
    @Override
    public void pintar() {

        printfig.append("-------------------------------\n\n");

        for(int col=1;col<=base;col++)
            printfig.append(" *");

        printfig.append("\n");

        for(int fila = 2;fila < altura; fila++){
            printfig.append(" *");
            for (int col = 2; col < base; col++)
                printfig.append("  ");

            printfig.append(" * \n");
        }

        for (int fila = 1; fila <=base ; fila++)
            printfig.append(" *");
        printfig.append("\n\n-------------------------------\n");
    }

    /**
     * Metodo Sobrecargado que sirve para imprimir un documento de texto
     */
    @Override
    public void imprimir() {
        System.out.println(printfig);
    }

    /**
     * Metodo Sobrecargado que sirve para imprimir todos los atributos del cuadrado
     * @return String
     */
    @Override
    public String toString() {
        return "Rectangulo { Ancho:"+this.base+"Altura: "+this.altura+",fecha: "+ String.format(new Date().toString(),"dd/mm/yyy" )+"}";
    }

}
