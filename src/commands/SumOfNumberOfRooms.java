package commands;

import collection.Collection;
import collection.flat.Flat;

import java.util.ArrayList;
import java.util.Hashtable;

public class SumOfNumberOfRooms {
    Collection collection = new Collection();
    Hashtable<String, Flat> hashtable = collection.getHahstable();

    // Получить набор всех значений
    java.util.Collection <Flat> valuesCollection;

    int sum = 0;

    public void sumOfNumbersOfRooms(){
        valuesCollection = hashtable.values();
        for(Flat value : valuesCollection){
            sum += value.getNumberOfRooms();
        }
        System.out.println("Суммарное количество комнат в коллекции: " + sum);
    }

    @Override
    public String toString() {
        return "sum_of_numbers_of_rooms";
    }
}
