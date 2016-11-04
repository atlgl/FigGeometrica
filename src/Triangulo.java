import java.util.Date;

/**
 * Created by ANGELUS on 29/10/16.
 */
public class Triangulo extends FigurasGeometricas {

    public Triangulo(int base) {
        this.base = base;
        this.printfig=new StringBuilder();
    }

    @Override
    public int calcularArea() {
        return (this.base*this.altura)/2;
    }

    @Override
    public void rotarFigura() {


        for (int k=1;k<=base;k++)
        {

            printfig.append(" *");
        }

        printfig.append("\n");

        for (int k=2;k<=base-1;k++)
        {

            printfig.append(" *");

            for (int j=1;j<=base-2;j++)
                printfig.append("_");
            printfig.append("*");
            printfig.append("\n");

            for (int j=1;j<=base-k;j++)
                printfig.append("_");
            printfig.append("*");
        }
        printfig.append("\n");

        for (int k=1;k<=base-1;k++)
            printfig.append(" ");
        printfig.append("*");

    }

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

    @Override
    public void imprimir() {
        System.out.println(printfig);
    }

    @Override
    public String toString() {
        return "Triangulo{ Base:"+this.base+"Altura:"+this.altura+" Fecha: "+String.format(new Date().toString(),"dd/mm/yyy" )+"}";
    }
}

