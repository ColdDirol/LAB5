package commands;

import collection.Collection;
import collection.flat.Flat;

import java.util.Hashtable;
import java.util.Map;

public class Show {
    Collection collection = new Collection();
    Hashtable<String, Flat> hashtable = collection.getHahstable();

    public void show(){
        System.out.println("-----------");
        for(Map.Entry<String, Flat> item : hashtable.entrySet()){
            System.out.println("Квартира " + item.getKey());
            System.out.println("+");
            System.out.println(item.getValue().toString());
            System.out.println("---");
        }
        System.out.println("-----------");
    }

    @Override
    public String toString() {
        return "show";
    }
}
