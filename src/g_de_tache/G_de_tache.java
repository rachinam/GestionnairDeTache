
package g_de_tache;

import java.io.*;
import java.util.StringTokenizer;
 

public class G_de_tache {

    public void test() throws IOException, InterruptedException{
        Runtime rt = Runtime.getRuntime();

        String[] commands = {"ps aux"};

        Process proc = rt.exec(commands);

        InputStream stdin = proc.getInputStream();
        InputStreamReader isr = new InputStreamReader(stdin);
        BufferedReader br = new BufferedReader(isr);

        String line = null;
        System.out.println("<OUTPUT>");
        line = br.readLine();
        System.out.println(line);

        //while ( (line = br.readLine()) != null)
          //   System.out.println(line);

        System.out.println("</OUTPUT>");
        int exitVal = proc.waitFor();
        System.out.println("Process exitValue: " + exitVal);
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        Process process = Runtime.getRuntime().exec("ps -aux");
	BufferedReader r =  new BufferedReader(new InputStreamReader(process.getInputStream()));
	String line = null;
        line=r.readLine();line=r.readLine();line=r.readLine();
        
        
        String[] ary = line.split(" ");
        String h [] =new String[20]; 
        int j = 0;
        String yy = "";
        for(int i = 0;i < ary.length;i++){
            if(ary[i].length() != 0)
            {
                h[j] = ary[i];
                j++;
                yy+=ary[i]+"-";
            }
        }
       System.out.println(yy);
       String[] ary1 = yy.split("-");
       System.out.println(ary1.length);
       for(String h1:ary1){
            System.out.println(h1);
        }
       
       
       
//        System.out.println("lenght hh  :"+h.length);
//        System.out.println("lenght :"+yy);
        
//        for(String h1:h){
//            System.out.println(h1);
//        }
      
        
    }
    
}
