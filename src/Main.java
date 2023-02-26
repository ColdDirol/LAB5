import collection.CollectionManager;
import commands.CommandsManager;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        Scanner scanner = new Scanner(System.in);

        CollectionManager collectionManager = new CollectionManager();
        collectionManager.collectionReader();

        CommandsManager commandsManager = new CommandsManager();

        while(true){
            System.out.print("Введите команду: ");
            String input = scanner.nextLine();
            commandsManager.executeCommand(input);
        }
    }
}