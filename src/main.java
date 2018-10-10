import java.io.*;
import java.nio.file.Files;

/**
 * Created by robertbarta on 18.05.16.
 */
public class main {
    public static void main(String[] args) throws IOException {
        File dir = new File(".");

        String source = dir.getCanonicalPath() + File.separator + "phpbb.txt";
        String dest = dir.getCanonicalPath() + File.separator + "phpbb_ready.txt";

        File fin = new File(source);
        FileInputStream fis = new FileInputStream(fin);
        BufferedReader in = new BufferedReader(new InputStreamReader(fis));

        FileWriter fstream = new FileWriter(dest, true);
        BufferedWriter out = new BufferedWriter(fstream);

        String aLine = null;
        while ((aLine = in.readLine()) != null) {
            //Process each line and add output to Dest.txt file
            aLine += "000000"; // Insert matriculation number here
            out.write(aLine);
            out.newLine();
        }

        // do not forget to close the buffer reader
        in.close();

        // close buffer writer
        out.close();
    }
}
