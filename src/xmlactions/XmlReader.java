package xmlactions;

import collection.flat.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class XmlReader {
    private static ArrayList<Flat> flatElementsList = new ArrayList<>();
    private static ArrayList<Coordinates> coordinatesElementsList = new ArrayList<>();
    private static ArrayList<House> houseElementsList = new ArrayList<>();

    String filepath = "Flat.xml";
    File file = new File(filepath);

    public ArrayList<Flat> xmlRead() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);

        Element flatElements = (Element) document.getElementsByTagName("flat_catalog").item(0);

        //
        ArrayList<Flat> flatsArrayList = new ArrayList<>();

        NodeList flatNodeList = document.getElementsByTagName("flat");
        for(int i = 0; i < flatNodeList.getLength(); i++){
            if(flatNodeList.item(i).getNodeType() == Node.ELEMENT_NODE){
                Element flatElement = (Element) flatNodeList.item(i);

                Flat flat = new Flat();

                flat.setId(Integer.parseInt(flatElement.getAttribute("id")));

                NodeList flatChildNodes = flatElement.getChildNodes();
                for(int j = 0; j < flatChildNodes.getLength(); j++){
                    if(flatChildNodes.item(j).getNodeType() == Node.ELEMENT_NODE){
                        Element flatChildElement = (Element) flatChildNodes.item(j);

                        switch (flatChildElement.getNodeName()){
                            case "name" : {
                                flat.setName(flatChildElement.getTextContent());
                            } break;

                            case "coordinates" : {
                                NodeList coordinatesNodeList = document.getElementsByTagName("coordinates");
                                for(int k = 0; k < coordinatesNodeList.getLength(); k++){
                                    if(coordinatesNodeList.item(k).getNodeType() == Node.ELEMENT_NODE){
                                        Element coordinatesElement = (Element) coordinatesNodeList.item(k);

                                        NodeList coordinatesChiledNodes = coordinatesElement.getChildNodes();
                                        for(int l = 0; l < coordinatesChiledNodes.getLength(); l++) {
                                            if(coordinatesChiledNodes.item(l).getNodeType() == Node.ELEMENT_NODE){
                                                Element coordinatesChildElement = (Element) coordinatesChiledNodes.item(l);

                                                switch (coordinatesChildElement.getNodeName()) {
                                                    case "x" : {
                                                        flat.setCoordinatesX(Float.valueOf(coordinatesChildElement.getTextContent()));
                                                    } break;

                                                    case "y" : {
                                                        flat.setCoordinatesY(Float.valueOf(coordinatesChildElement.getTextContent()));
                                                    } break;
                                                }
                                            }
                                        }
                                    }
                                }
                            } break;

//                            case "x" : {
//                                flat.setCoordinatesX(Float.valueOf(flatChildElement.getTextContent()));
//                            } break;
//
//                            case "y" : {
//                                flat.setCoordinatesY(Float.valueOf(flatChildElement.getTextContent()));
//                            } break;

                            case "creation_date" : {
                                flat.setCreationDate(LocalDateTime.parse(flatChildElement.getTextContent()));
                            } break;

                            case "area" : {
                                flat.setArea(Float.parseFloat(flatChildElement.getTextContent()));
                            } break;

                            case "numbers_of_rooms" : {
                                flat.setNumberOfRooms(Long.parseLong(flatChildElement.getTextContent()));
                            } break;

                            case "furnish" : {
                                flat.setFurnish(Furnish.valueOf(flatChildElement.getTextContent()));
                            } break;

                            case "view" : {
                                flat.setView(View.valueOf(flatChildElement.getTextContent()));
                            } break;

                            case "transport" : {
                                flat.setTransport(Transport.valueOf(flatChildElement.getTextContent()));
                            } break;

                            case "house" : {
                                flat.setHouseName(flatChildElement.getAttribute("name"));
                                flat.setHouseYear(Integer.parseInt(flatChildElement.getAttribute("year")));
                                flat.setHouseNumberOfLifts(Integer.valueOf(flatChildElement.getAttribute("number_of_lifts")));
                            }
                        }
                    }
                }
                flatsArrayList.add(flat);
            }
        }
        return flatsArrayList;
    }
}
