
package g_de_tache;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GetProcess {
    private String GetProcessListData()
    {
        Process p;
        Runtime runTime;
        String process = null;
        try {
            System.out.println("Processes Reading is started...");

            //Get Runtime environment of System
            runTime = Runtime.getRuntime();

            //Execute command thru Runtime
            p = runTime.exec("tasklist");      // For Windows
            //p=r.exec("ps ux");              //For Linux

            //Create Inputstream for Read Processes
            InputStream inputStream = p.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            //Read the processes from sysrtem and add & as delimeter for tokenize the output
            String line = bufferedReader.readLine();
            process = "&";
            while (line != null) {
                line = bufferedReader.readLine();
                process += line + "&";
            }
        
        //Close the Streams
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();

            System.out.println("Processes are read.");
            } catch (IOException e) {
            System.out.println("Exception arise during the read Processes");
            e.printStackTrace();
            }
            return process;
    }}