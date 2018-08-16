import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kshitish Pokharel on 5/20/2018 at 9:36 AM.
 */
public class TrackFileReader {
    public static void main(String[] args) {
        Map<String,Integer> m=new HashMap<>();
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader("tracks_per_year.txt"));
            String line=" ";

            while ((line=bufferedReader.readLine())!=null){
                String [] values=line.split("<SEP>");
                String year=values[0];
                if(m.containsKey(year))
                {
                    int newCount =m.get(year)+1;
                    m.put(year,newCount);


                }
                else
                {
                    m.put(year,1);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(m);
    }
}
