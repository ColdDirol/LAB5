package commands;

import collection.Collection;
import collection.ElementConstructor;
import collection.flat.Flat;

import java.util.Hashtable;
import java.util.Map;

public class Update {
    Collection collection = new Collection();
    Hashtable<String, Flat> hashtable = collection.getHahstable();
    ElementConstructor elementConstructor = new ElementConstructor();
    Flat flat;
    public void update(int id) {
        for(Map.Entry<String, Flat> item : hashtable.entrySet()){
            if(item.getValue().getId() == id) {
                flat = elementConstructor.elementConstruct(id);

                hashtable.replace(item.getKey(), flat);
            }
        }
//        flat = elementConstructor.elementConstruct();

        hashtable.put(flat.getName(), flat);
    }
}
