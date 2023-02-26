package commands;

import collection.Collection;
import collection.ElementConstructor;
import collection.flat.Flat;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class ReplaceIfGreater {
    Collection collection = new Collection();
    Hashtable<String, Flat> hashtable = collection.getHahstable();
    ElementConstructor elementConstructor = new ElementConstructor();
    Flat flat;

    Scanner scanner = new Scanner(System.in);

    Set<String> nameSet = hashtable.keySet();
    public boolean replaceIfGreater(String key) {
        System.out.println(nameSet);
        while(!nameSet.contains(key)) {
            System.out.print("Такого элемента нет, введите название существующего: ");
            key = scanner.nextLine();
        }

        flat = elementConstructor.elementConstruct();

        if(flat.hashCode() > hashtable.get(key).hashCode()) {
            hashtable.replace(key, flat);
            return true;
        }
        else {
            System.out.println("Введенный вами элемент меньше, чем первоначальный.");
            return false;
        }
    }
}
