import java.io.File;
import java.io.IOException;
public class test1 {
    public static void main(String[] args) throws IOException{
          File f = new File("d:\\abc.txt");
          f.createNewFile();
          /* throws is an indication there is a need of
          exception handling here try/catch
          */
    }
}
