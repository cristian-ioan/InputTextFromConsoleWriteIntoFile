import java.io.*;
import java.util.stream.Stream;

public class FileName {

    String fileName;

    public FileName(){};

    public FileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void WriteIntoFile(String fName){

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Stream<String> stream = in.lines().limit(5); // 5 is maximum number of lines that I type

        try (PrintWriter pw = new PrintWriter(fName, "UTF-8")) {
            stream.forEachOrdered(pw::println);
        } catch (UnsupportedEncodingException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
