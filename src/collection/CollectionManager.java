package collection;

import collection.flat.Flat;
import org.xml.sax.SAXException;
import xmlactions.XmlReader;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CollectionManager {
    Collection collection = new Collection();
    XmlReader xmlReader = new XmlReader();
    ArrayList<Flat> flatArrayList;

    public void collectionReader() throws ParserConfigurationException, IOException, SAXException { // main execution method in the program
        flatArrayList = xmlReader.xmlRead();

        for(int i = 0; i < flatArrayList.size(); i++){
            Flat flat = flatArrayList.get(i);
            String name = flat.getName();
            collection.setHashtableElements(name, flat);
        }
    }

    public Collection getCollection() {
        return collection;
    }
}
