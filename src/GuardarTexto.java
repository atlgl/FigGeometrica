import java.io.FileWriter;
/**
 * Created by ANGELUS on 04/11/16.
 * Clase que se encarga de crear un archivo de texto y guardarlo en el sistema
 * Proporciona metodos para la lectura y escritura de un archivo
 */
public class GuardarTexto  {

    private String fileName;
    private FileWriter fileWriter;

    /**
     * Constructor por default inicia un fichero de texto establece el nombre del archivo desde el inicio
     * @param fileName String nombre del archivo
     */
    public GuardarTexto(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Devuelve el nombre del archivo
     * @return String
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Agrega el nombre del archivo
     * @param fileName String
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Metodo que prepara un archivo para escritura
     */
    public void openFile(){
        try{
            fileWriter=new FileWriter(fileName,true);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * Metodo que se encarga de guardar una linea de texto en el archivo
     * @param texto String
     */
    public void guardarLineaTxt(String texto){
        try{
            fileWriter.write(texto);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * Metodo que se encarga de cerrar el archivo de texto
     */
    public void close(){
        try{
            fileWriter.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }




}
