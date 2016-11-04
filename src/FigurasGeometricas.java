/**
 * Created by ANGELUS on 29/10/16.
 */
public abstract class FigurasGeometricas
{
    public static final char ASTERISCO='*';
    public static final char BLANCO=' ';
    public static final char SIGLINEA='\n';
    public static final char TAB='\t';


    protected StringBuilder printfig;
    protected int gradosrotacion;
    protected int altura;
    protected int base;
    protected int matriz[][];





    public abstract int calcularArea();

    public  abstract void rotarFigura();

    public abstract void moverFigura(int numespacio);

    public abstract void pintar();


    public abstract void imprimir();




}
