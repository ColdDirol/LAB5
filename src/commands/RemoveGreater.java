package commands;

import collection.Collection;

import collection.flat.Flat;

import java.util.*;

public class RemoveGreater {
    Collection collection = new Collection();
    Hashtable<String, Flat> hashtable = collection.getHahstable();
    Scanner scanner = new Scanner(System.in);

    Set<String> nameSet = hashtable.keySet();

    String input;

    public void removeGreater() {

        System.out.print("Введите название квартиры, элементы, выше которой, необходимо удалить: ");
        input = scanner.nextLine();
        while(!nameSet.contains(input)) {
            System.out.print("Такого элемента нет, введите название существующего: ");
            input = scanner.nextLine();
        }

        for(Iterator<Map.Entry<String, Flat>> item = hashtable.entrySet().iterator();item.hasNext();) {
            if (item.next().getKey().equals(input)) break;
            item.remove();
        }
    }
}
