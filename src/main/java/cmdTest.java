

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class cmdTest {
    public static void main(String[] args) throws Exception {
        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", "cd \"D:\\Soft\" && dir");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream(), Charset.forName("CP866")));
        String line;


        Process ping = Runtime.getRuntime().exec("ping localhost");
        BufferedReader br = new BufferedReader(new InputStreamReader(ping.getInputStream(), Charset.forName("CP866")));

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();

        while (true) {
            line = r.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }
    }


}
