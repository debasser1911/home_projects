package offLineSoftId;

import java.io.*;
import java.nio.charset.Charset;


public class Tools {
    public static void getData() throws IOException, InterruptedException {
        Process softID = new ProcessBuilder("D:\\offLineSoftId\\offLineSoftId.exe").start();

        InputStream errorStream = softID.getErrorStream();
        /*Process soft = Runtime.getRuntime().exec("D:\\offLineSoftId");*/
        File file = new File("D:\\xxx.xml");
        /*File file = new File("D:\\xxx.txt");*/
        BufferedReader br = new BufferedReader(new InputStreamReader(softID.getInputStream(), Charset.forName("CP866")));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));


        String line;


        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.flush();
            System.out.println(line);

            /*if (line.contains("offLineError")){
                System.out.println("Get error");
                break;
            }*/
        }
        softID.waitFor();
        br.close();
    }
}
