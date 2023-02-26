package commands;

import collection.Collection;
import collection.CollectionManager;
import collection.flat.Flat;

import java.time.LocalDateTime;
import java.util.Hashtable;

public class Info {
    Collection collection = new Collection();
    Hashtable<String, Flat> hashtable = collection.getHahstable();
    LocalDateTime initializationDate = collection.getInitializationDate();
    public void info(){
        System.out.println("Информация о коллекции:");
        System.out.println("Тип коллекции: " + hashtable.getClass().getSimpleName() + ";");
        System.out.println("Дата инициализации: " + initializationDate.getHour() + ":" + initializationDate.getMinute() + " " + initializationDate.getDayOfMonth() + " " + initializationDate.getMonth() + " " + initializationDate.getYear());
        System.out.println("Количество элементов: " + hashtable.size());
    }

    @Override
    public String toString() {
        return "info";
    }
}
