import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\test.txt"));
        System.out.println(br.readLine());




    }

}
