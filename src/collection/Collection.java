package collection;

import collection.flat.Flat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Collection {
    private static Hashtable<String, Flat> hashtable = new Hashtable<>();
    private static LocalDateTime initializationDate = LocalDateTime.now();

    public Hashtable<String, Flat> getHahstable() {
        return hashtable;
    }
    public void setHashtable(Hashtable<String, Flat> hashtable) {
        this.hashtable = hashtable;
    }
    public void setHashtableElements(String name, Flat flat) {
        hashtable.put(name, flat);
    }


    public LocalDateTime getInitializationDate() {
        return initializationDate;
    }
    public void updateInitializationDate(){
        initializationDate = LocalDateTime.now();
    }


    public void print() {
        // получить набор всех ключей
        Set<String> keysSet = hashtable.keySet();
        // перевести набор ключей в список
        ArrayList<String> keys = new ArrayList<String>();
        for (String key : keysSet) keys.add(key);

        // получить набор всех значений
        java.util.Collection<Flat> valuesSet = hashtable.values();
        // перевести набор значений в список
        ArrayList<Flat> values = new ArrayList<Flat>();
        for (Flat value : valuesSet) values.add(value);
        for(int i = 0; i < keys.size(); i++){
            System.out.println(keys.get(i) + " : " + values.get(i).getName());
        }
    }
}
