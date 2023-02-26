package test;

import java.beans.XMLDecoder;
import java.io.*;

public class TestXMLDecoder {
    public Object xmlRead(String filepath) throws FileNotFoundException {
        //String filepath = "src\\test\\outSportsman.xml";
        File file = new File(filepath);
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        XMLDecoder xmlDecoder = new XMLDecoder(bufferedInputStream);

        return xmlDecoder.readObject();

    }
}
