package commands;

import collection.Collection;
import collection.ElementConstructor;
import collection.flat.*;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Hashtable;
import java.util.Scanner;

public class Insert {
    Collection collection = new Collection();
    Hashtable<String, Flat> hashtable = collection.getHahstable();
    ElementConstructor elementConstructor = new ElementConstructor();
    Flat flat;
    public void insert() {
        flat = elementConstructor.elementConstruct();

        hashtable.put(flat.getName(), flat);
    }
}