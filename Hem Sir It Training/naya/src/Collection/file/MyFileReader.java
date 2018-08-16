package Collection.file;

import java.io.*;

/**
 * Created by madhu on 5/26/2017.
 */
public class MyFileReader {
    public static void main(String[] args) {
        File file = new File("E:message.txt");
       try {
           FileReader reader = new FileReader(file);
           int ch;
           while ((ch = reader.read()) != -1) {
               System.out.print((char) ch);
           }
       }catch(FileNotFoundException e) {
           System.out.println("k ho");
       }catch(IOException i){
           System.out.println("sdsaf");
       }

       /* File file = new File("E:message.txt");
        try {
            FileInputStream fin = new FileInputStream(file);
            int c;
            while((c= fin.read()) !=-1){
                System.out.print((char)c);

            }
            fin.close();
        } catch (FileNotFoundException e) {
            System.out.println("sorry");
        }catch(IOException ae){
            System.out.println("k garira vai");
        }*/
    }
}