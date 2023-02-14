package Gun47_ReadingTXT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readText {
    public static void main(String[] args) throws IOException {

        String path = "src/Gun47_ReadingTXT/deneme.txt";

        FileInputStream fis = new FileInputStream(path);

        System.out.println(fis.read()); // read() dönüşünü ASCII ile yapar.
        System.out.println((char) fis.read()); // read() iterator gibi çalışır. Her çalıştığında bir sonraki elemana geçer.
                                                    // dönüşü int tir. Eğer sonraki eleman yoksa -1 döner.

        int control=0;
        while ((control=fis.read()) !=-1)
        {
            System.out.print((char) control);
        }




    }
}
