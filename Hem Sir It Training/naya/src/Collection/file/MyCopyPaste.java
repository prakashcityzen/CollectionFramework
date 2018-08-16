package Collection.file;

import java.io.*;

/**
 * Created by madhu on 5/26/2017.
 */
public class MyCopyPaste {
    public static void main(String[] args) {
        String filepath = "E:message.txt";
        File original=new File("E:/message.txt");
        File copy=new File("E:/messagecopy.txt");
        try{
            copy.createNewFile();
            FileWriter fin=new FileWriter(original);
            FileReader fout=new FileReader(copy);
            int c;
            while((c=fout.read())!=-1){
                fin.write(c);
            }
            fin.close();
            fout.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
