package test;

import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DOMxmReader2 {
    private static ArrayList<Employee> sportsmanArrayList = new ArrayList<>();
    String filepath = "src/test/Sportsman.xml";
    File file = new File(filepath);

    public void readXml() throws ParserConfigurationException, IOException, SAXException {
        // Получение фабрики, чтобы после получить билдер документов.
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        // Получили из фабрики билдер, который парсит XML, создает структуру Document в виде иерархического дерева.
        DocumentBuilder builder = factory.newDocumentBuilder();

        // Запарсили XML, создав структуру Document. Теперь у нас есть доступ ко всем элементам, каким нам нужно.
        Document document = builder.parse(file);

        Element sportsmanElements = (Element) document.getElementsByTagName("sportsman").item(0);
        int id = Integer.parseInt(sportsmanElements.getAttribute("id"));

        NodeList sportsmanNodeList = document.getElementsByTagName("sportsman");

        for(int i = 0; i < sportsmanNodeList.getLength(); i++){
            if(sportsmanNodeList.item(i).getNodeType() == Node.ELEMENT_NODE){
                Element sportsmanElement = (Element) sportsmanNodeList.item(i);

                Sportsman sportsman = new Sportsman();
                sportsman.setId(id);

                NodeList childNodes = sportsmanElement.getChildNodes();
                for(int j = 0; j < childNodes.getLength(); j++){
                    if(childNodes.item(j).getNodeType() == Node.ELEMENT_NODE){
                        Element childElement = (Element) childNodes.item(j);

                        if(childElement.getNodeName() == "name"){
                            System.out.println(childElement.getTextContent());
                        }
                    }
                }
            }
        }
    }
}
