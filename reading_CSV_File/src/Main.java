import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\alias\\Desktop\\Proje\\imdb_top_250.csv";
        String line ="";


        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine()) != null){
                String[] values = line.split(";");
                System.out.println(values[1]);
            }
        }
        catch (FileNotFoundException e ){
            e.printStackTrace();
        }catch (IOException e ){
            e.printStackTrace();
        }
    }
}