package commands;

import collection.Collection;
import collection.flat.Flat;
import collection.flat.View;

import java.util.Hashtable;
import java.util.Map;

public class MaxByView {
    Collection collection = new Collection();
    Hashtable<String, Flat> hashtable = collection.getHahstable();

    public void maxByView() {
        for(Map.Entry<String, Flat> item : hashtable.entrySet()){
            if(item.getValue().getView() == View.GOOD) {
                System.out.println(item.getValue().toString());
            }
        }
    }
}
