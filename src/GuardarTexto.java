import java.io.File;
import java.io.FileWriter;

/**
 * Created by ANGELUS on 04/11/16.
 */
public class GuardarTexto  {

    private String fileName;
    private FileWriter fileWriter;

    public GuardarTexto(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void openFile(){
        try{
            fileWriter=new FileWriter(fileName,true);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


    public void guardarLineaTxt(String texto){
        try{
            fileWriter.write(texto);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


    public void close(){
        try{
            fileWriter.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }




}
