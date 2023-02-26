package commands;

import java.util.HashMap;
import java.util.Map;

public class CommandsList {
    private Map<String, String> commandsMapInfo = new HashMap<String, String>();
    {
        commandsMapInfo.put("help", "вывести справку по доступным командам");
        commandsMapInfo.put("info", "вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)");
        commandsMapInfo.put("show", "вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
        commandsMapInfo.put("insert null {element}", "добавить новый элемент с заданным ключом");
        commandsMapInfo.put("update id {element}", "обновить значение элемента коллекции, id которого равен заданному");
        commandsMapInfo.put("remove_key null", "удалить элемент из коллекции по его ключу");
        commandsMapInfo.put("clear", "очистить коллекцию");
        commandsMapInfo.put("save", "сохранить коллекцию в файл");
        commandsMapInfo.put("execute_script file_name", "считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме");
        commandsMapInfo.put("exit", "завершить программу (без сохранения в файл)");
        commandsMapInfo.put("remove_greater {element}", "удалить из коллекции все элементы, превышающие заданный");
        commandsMapInfo.put("replace_if_greater null {element}", "заменить значение по ключу, если новое значение больше старого");
        commandsMapInfo.put("replace_if_lowe null {element}", "заменить значение по ключу, если новое значение меньше старого");
        commandsMapInfo.put("sum_of_number_of_rooms", "вывести сумму значений поля numberOfRooms для всех элементов коллекции");
        commandsMapInfo.put("max_by_view", "вывести любой объект из коллекции, значение поля view которого является максимальным");
        commandsMapInfo.put("count_by_number_of_rooms numberOfRooms", "вывести количество элементов, значение поля numberOfRooms которых равно заданному");
    }
    public Map getCommandsMapInfo(){
        return commandsMapInfo;
    }

    // <String, Object>
    private Map<String, String> commandsMap = new HashMap<String, String>();
    {
        commandsMapInfo.put("help", "вывести справку по доступным командам");
        commandsMapInfo.put("info", "вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)");
        commandsMapInfo.put("show", "вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
        commandsMapInfo.put("insert null {element}", "добавить новый элемент с заданным ключом");
        commandsMapInfo.put("update id {element}", "обновить значение элемента коллекции, id которого равен заданному");
        commandsMapInfo.put("remove_key null", "удалить элемент из коллекции по его ключу");
        commandsMapInfo.put("clear", "очистить коллекцию");
        commandsMapInfo.put("save", "сохранить коллекцию в файл");
        commandsMapInfo.put("execute_script file_name", "считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме");
        commandsMapInfo.put("exit", "завершить программу (без сохранения в файл)");
        commandsMapInfo.put("remove_greater {element}", "удалить из коллекции все элементы, превышающие заданный");
        commandsMapInfo.put("replace_if_greater null {element}", "заменить значение по ключу, если новое значение больше старого");
        commandsMapInfo.put("replace_if_lowe null {element}", "заменить значение по ключу, если новое значение меньше старого");
        commandsMapInfo.put("sum_of_number_of_rooms", "вывести сумму значений поля numberOfRooms для всех элементов коллекции");
        commandsMapInfo.put("max_by_view", "вывести любой объект из коллекции, значение поля view которого является максимальным");
        commandsMapInfo.put("count_by_number_of_rooms numberOfRooms", "вывести количество элементов, значение поля numberOfRooms которых равно заданному");
    }
    public Map getCommandsMap(){
        return commandsMapInfo;
    }
}
