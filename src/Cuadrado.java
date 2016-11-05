import java.util.Date;

/**
 * Created by ANGELUS on 29/10/16.
 * Clase encargada de crear una figura y de dibujarla en consola
 */
public class Cuadrado extends FigurasGeometricas {

    /**
     * Constructor de una figura geometrica cuadrado
     * Recibe como parametro la medida del cuadrado
     * @param lado Int
     */
    public Cuadrado(int lado) {
            this.base=this.altura=lado;
            printfig=new StringBuilder();
    }

    /**
     * Sobreescritura del metodo calcula el area de un cuadrado
     * @return Int
     */
    @Override
    public int calcularArea() {
        return base*base;
    }

    /**
     * Sobreecritura del metodo rota una figura en 45 Grados
     */
    @Override
    public void rotarFigura() {
        printfig.append("-----------45 Grados-----------------\n");

        for (int fila=1;fila<=base;fila++)
        {
            for (int j=1;j<=base-fila;j++)
                printfig.append(" ");
            for (int j=1;j<=fila;j++)
                printfig.append("* ");
            printfig.append("\n");
        }

        for (int fila=1;fila<=base-1;fila++)
        {
            for (int j=1;j<=fila;j++)
                printfig.append(" ");
            for (int j=1;j<=base-fila;j++)
                printfig.append("* ");
            printfig.append("\n");
        }

        printfig.append("-------------------------------\n");

    }

    /**
     *Sobreescritura del metodo que se encarga de desplazar una figura
     * @param numespacio Int
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

        for(int fila = 2;fila < base; fila++){
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
     * Sobreescritura de un metodo que se encarga de pintar un cuadrado
     */
    @Override
    public void pintar() {

        printfig.append("-------------------------------\n\n");

        for(int col=1;col<=base;col++)
            printfig.append(" *");

        printfig.append("\n");

        for(int fila = 2;fila < base; fila++){
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
     * Sobreescitura del metodo para imprimir el cuadrado
     */
    @Override
    public void imprimir() {
        System.out.println(printfig);
    }

    /**
     *Sobreescritura del metodo toString imprime los atributos de la clase
     * @return String
     */
    @Override
    public String toString() {
        return "Cuadrado{ Lado:"+this.base+",fecha: "+ String.format(new Date().toString(),"dd/mm/yyy" )+"}";
    }
}
