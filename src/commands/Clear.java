package commands;

import collection.Collection;
import collection.flat.Flat;

import java.util.Hashtable;

public class Clear {
    Collection collection = new Collection();
    Hashtable<String, Flat> hashtable = collection.getHahstable();

    public void clear(){
        hashtable.clear();
        System.out.println("Коллекция очищена");
    }

    @Override
    public String toString() {
        return "clear";
    }
}
