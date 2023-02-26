package commands;

import collection.Collection;
import collection.flat.Flat;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class RemoveKey {
    Collection collection = new Collection();
    Hashtable<String, Flat> hashtable = collection.getHahstable();

    public void remove(String key) {
//        for(Iterator<Map.Entry<String, Flat>> item = hashtable.entrySet().iterator(); item.hasNext();) {
//            if (item.next().getKey().equals(key)) {
//                item.remove();
//                break;
//            }
//        }

        for(Map.Entry<String, Flat> item : hashtable.entrySet()){
            if(item.getKey().equals(key)) {
                hashtable.remove(key);
            }
        }
    }

    @Override
    public String toString() {
        return "remove_key";
    }
}
