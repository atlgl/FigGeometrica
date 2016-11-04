import java.util.Date;

/**
 * Created by ANGELUS on 29/10/16.
 */
public class Rectangulo extends FigurasGeometricas {


    public Rectangulo() {
    }

    public Rectangulo(int ancho, int altura) {
        this.altura = altura;
        this.base = ancho;
        this.printfig=new StringBuilder();
    }

    @Override
    public int calcularArea() {
        return base*altura;
    }

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

    @Override
    public void imprimir() {
        System.out.println(printfig);
    }

    @Override
    public String toString() {
        return "Rectangulo { Ancho:"+this.base+"Altura: "+this.altura+",fecha: "+ String.format(new Date().toString(),"dd/mm/yyy" )+"}";
    }

}
