package offLineSoftId;

import java.io.*;
import java.nio.charset.Charset;


public class Tools {
    public static void getData() throws IOException, InterruptedException {

        //TODO absolute path
        //Start process
        ProcessBuilder softID = new ProcessBuilder("D:\\offLineSoftId\\offLineSoftId.exe");
        //Set working directory
        softID.directory(new File("D:\\offLineSoftId\\"));
        //Process start
        Process soft = softID.start();
        //Create new log file
        File file = new File("D:\\xxx.xml");
        //Init reader and writer
        BufferedReader br = new BufferedReader(new InputStreamReader(soft.getInputStream(), Charset.forName("UTF8")));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        //Init data string
        String line;

        System.out.println("Getting data");

        //Getting data
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.flush();
            System.out.println(line);
        }

        soft.waitFor();
        br.close();
        bw.close();
    }
}



