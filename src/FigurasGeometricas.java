/**
 * Created by ANGELUS on 29/10/16.
 * Clase abstracta supertipo de figura geometrica tiene todos
 * los atributos necesarios para crear cualquier tipo de figura
 */
public abstract class FigurasGeometricas
{
    /**
     * Variable de clase que define un asterisco
     */
    public static final char ASTERISCO='*';
    /**
     * Variable de clase que define un espacio
     */
    public static final char BLANCO=' ';
    /**
     * Variable de clase que define un nueva linea
     */
    public static final char SIGLINEA='\n';
    /**
     * Variable de clase que define un espacio
     */
    public static final char TAB='\t';
    
    protected StringBuilder printfig;
    protected int gradosrotacion;
    protected int altura;
    protected int base;

    /**
     * Devuelve un constructor de cadenas para la impresion de la figura
     * @return StringBuilder
     */
    public StringBuilder getPrintfig() {
        return printfig;
    }

    /**
     * Agrega un nuevo StringBuilder a la figura
     * @param printfig StringBuilder
     */
    public void setPrintfig(StringBuilder printfig) {
        this.printfig = printfig;
    }

    /**
     * Metodo Abstracto para calcular el area
     * @return
     */
    public abstract int calcularArea();

    /**
     * Metodo Abstracto para rotar una figura
     */
    public  abstract void rotarFigura();

    /**
     * Metodo Abstracto que permite mover una figura segun el parametro numero de espacios
     * @param numespacio
     */
    public abstract void moverFigura(int numespacio);


    /**
     * Metodo Abstracto que permite pintar una figura geometrica
     */
    public abstract void pintar();

    /**
     * Metodo Abstracto que permite imprimir la figura geometrica
     */
    public abstract void imprimir();

}
