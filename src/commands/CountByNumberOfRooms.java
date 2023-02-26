package commands;

import collection.Collection;
import collection.ElementConstructor;
import collection.flat.Flat;

import java.util.Hashtable;
import java.util.Map;

public class CountByNumberOfRooms {
    Collection collection = new Collection();
    Hashtable<String, Flat> hashtable = collection.getHahstable();
    int cnt = 0;


    Flat flat;
    public void countByNumberOfRooms(Long numberOfRooms) {
        for(Map.Entry<String, Flat> item : hashtable.entrySet()){
            if(item.getValue().getNumberOfRooms() == numberOfRooms) {
                cnt++;
            }
        }
        System.out.println("Количество элементов равно: " + cnt);
    }

    @Override
    public String toString() {
        return "count_by_number_of_rooms";
    }
}
