/**
 * Created by ANGELUS on 29/10/16.
 */
public class Triangulo extends FigurasGeometricas {

    public Triangulo(int base) {
        this.base = base;
    }

    @Override
    public int calcularArea() {
        return 0;
    }

    @Override
    public void rotarFigura() {

    }

    @Override
    public void moverFigura(int numespacio) {

    }

    @Override
    public void pintar() {


        for (int k=1;k<=base-1;k++)
            System.out.print(" ");
        System.out.print("*");
        System.out.print("\n");

        for (int k=2;k<=base-1;k++)
        {
            for (int j=1;j<=base-k;j++)
                System.out.print(" ");
                System.out.print("*");
            for (int j=1;j<=2*k-3;j++)
                System.out.print(" ");
            System.out.print("*");
            System.out.print("\n");
        }
        System.out.print("*");
        for (int k=1;k<=base-1;k++)
        {
            System.out.print(" ");
            System.out.print("*");
        }
        System.out.print("\n");
    }

    @Override
    public void imprimir() {

    }

}

