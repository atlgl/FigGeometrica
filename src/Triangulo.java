import java.util.Date;

/**
 * Created by ANGELUS on 29/10/16.
 * Clase encargada de crear una figura y de dibujarla en consola
 */
public class Triangulo extends FigurasGeometricas {

    /**
     * Constructor de una figura geometrica triangulo
     * Recibe como parametro la medida del triangulo
     * @param base Int
     */
    public Triangulo(int base) {
        this.base = base;
        this.printfig=new StringBuilder();
    }
    /**
     * Sobreescritura del metodo calcula el area de un triangulo
     * @return Int
     */
    @Override
    public int calcularArea() {

        int area= (int) ((Math.sqrt(3)/4) * Math.pow(this.base,2));
        return area;
    }

    /**
     * Sobreecritura del metodo rota una figura en 180 Grados
     */
    @Override
    public void rotarFigura() {

        printfig.append("----------180 Triangulo-------------\n");
        for (int k=1;k<=base;k++)
        {
            printfig.append(" *");
        }
        printfig.append("\n");

        for (int k=2;k<=base-1;k++)
        {
            for(int j=0;j<k;j++)
                printfig.append(" ");

            printfig.append("*");

            for(int t=k;t<(2*base)-(k+1);t++)
                printfig.append(" ");
            printfig.append("*");

            printfig.append("\n");
        }
        for (int k=1;k<=base;k++)
            printfig.append(" ");
        printfig.append("*");

        printfig.append("\n---------------______----------------------");
    }

    /**
     *Sobreescritura del metodo que se encarga de desplazar una figura
     * @param numespacio Int
     */
    @Override
    public void moverFigura(int numespacio) {

        String espacios="";
        for (int i = 0; i <numespacio ; i++) {
            espacios+=FigurasGeometricas.TAB;
        }

        printfig.append(espacios);
        for (int k=1;k<=base-1;k++)
            printfig.append(" ");
        printfig.append("*");
        printfig.append("\n");
        printfig.append(espacios);
        for (int k=2;k<=base-1;k++)
        {
            for (int j=1;j<=base-k;j++)
                printfig.append(" ");

            printfig.append("*");
            for (int j=1;j<=2*k-3;j++)
                printfig.append(" ");
            printfig.append("*");
            printfig.append("\n"+espacios);
        }

        printfig.append("*");
        for (int k=1;k<=base-1;k++)
        {
            printfig.append(" ");
            printfig.append("*");
        }
        printfig.append("\n");

    }

    /**
     * Sobreescritura de un metodo que se encarga de pintar un cuadrado
     */
    @Override
    public void pintar() {
        for (int k=1;k<=base-1;k++)
            printfig.append(" ");
        printfig.append("*");
        printfig.append("\n");

        for (int k=2;k<=base-1;k++)
        {
            for (int j=1;j<=base-k;j++)
                printfig.append(" ");
            printfig.append("*");
            for (int j=1;j<=2*k-3;j++)
                printfig.append(" ");
            printfig.append("*");
            printfig.append("\n");
        }
        printfig.append("*");
        for (int k=1;k<=base-1;k++)
        {
            printfig.append(" ");
            printfig.append("*");
        }
        printfig.append("\n");
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
        return "Triangulo{ Base:"+this.base+"Altura:"+this.altura+" Fecha: "+String.format(new Date().toString(),"dd/mm/yyy" )+"}";
    }
}

