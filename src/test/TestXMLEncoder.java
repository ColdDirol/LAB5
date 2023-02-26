package test;

import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestXMLEncoder {
    public void xmlWrite(Object object) throws FileNotFoundException {
        FileOutputStream out = new FileOutputStream("src\\test\\outSportsman.xml");
        XMLEncoder xmlEncoder = new XMLEncoder(out);
        xmlEncoder.writeObject(object);
        xmlEncoder.flush();
        xmlEncoder.close();
    }
}
