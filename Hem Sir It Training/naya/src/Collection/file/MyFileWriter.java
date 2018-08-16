package Collection.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by madhu on 5/26/2017.
 */
public class MyFileWriter {
    public static void main(String[] args) {
        String filepath="E:message.txt";
        String m="vayo jindagi hurray";
        File file=new File(filepath);
        try{
            file.createNewFile();
            FileWriter writer=new FileWriter(file);
            writer.write(m);
            /*file.createNewFile();
            FileOutputStream fout=new FileOutputStream(file);
            fout.write(m.getBytes());
            fout.close();*/
            writer.close();
        }catch(IOException e){
            System.out.println("ghsdfjjg");
        }
    }
}
