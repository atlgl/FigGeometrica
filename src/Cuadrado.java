import java.util.Date;

/**
 * Created by ANGELUS on 29/10/16.
 */
public class Cuadrado extends FigurasGeometricas {


    public Cuadrado(int lado) {

            this.base=this.altura=lado;
            printfig=new StringBuilder();
            matriz = new int[this.base][this.altura];
    }

    @Override
    public int calcularArea() {
        return base*base;
    }

    @Override
    public void rotarFigura() {
        printfig.append("-----------45 Grados-----------------\n");

        for (int fila=1;fila<=base;fila++)
        {
            for (int j=1;j<=base-fila;j++)
                System.out.print(" ");
            for (int j=1;j<=fila;j++)
                System.out.print("* ");
            System.out.print("\n");
        }

        for (int fila=1;fila<=base-1;fila++)
        {
            for (int j=1;j<=fila;j++)
                System.out.print(" ");
            for (int j=1;j<=base-fila;j++)
                System.out.print("* ");
            System.out.print("\n");
        }

        printfig.append("-------------------------------\n");

    }

    @Override
    public void moverFigura(int numespacios) {

        printfig.append("-------------------------------\n");
        String espacios="";
        for (int i = 0; i <numespacios ; i++) {
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

    @Override
    public void imprimir() {
        System.out.println(printfig);
    }

    @Override
    public String toString() {
        return "Cuadrado{ Lado:"+this.base+",fecha: "+ String.format(new Date().toString(),"dd/mm/yyy" )+"}";
    }
}
