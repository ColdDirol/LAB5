package commands;

import collection.flat.Flat;

public class CommandsManager {
    // команды без ввода
    Help help = new Help();
    Info info = new Info();
    Show show = new Show();
    Clear clear = new Clear();
    Exit exit = new Exit();
    SumOfNumberOfRooms sumOfNumberOfRooms = new SumOfNumberOfRooms();
    MaxByView maxByView = new MaxByView();

    // команды с вводом
    Insert insert = new Insert();
    Update update = new Update();
    RemoveKey removeKey = new RemoveKey();
    RemoveGreater removeGreater = new RemoveGreater();
    ReplaceIfGreater replaceIfGreater = new ReplaceIfGreater();
    ReplaceIfLowe replaceIfLowe = new ReplaceIfLowe();
    CountByNumberOfRooms countByNumberOfRooms = new CountByNumberOfRooms();

    public void executeCommand(String command){
        // безадресные команды
        switch (command){

            case "help" : {
                help.help();
                break;
            }

            case "info" : {
                info.info();
                break;
            }

            case "show" : {
                show.show();
                break;
            }

            case "clear" : {
                clear.clear();
                break;
            }

            case "exit" : {
                exit.exit();
                break;
            }

            case "sum_of_numbers_of_rooms" : {
                sumOfNumberOfRooms.sumOfNumbersOfRooms();
                break;
            }

            case "max_by_view" : {
                maxByView.maxByView();
                break;
            }

            // Команды с вводом
            case "insert 1" : {
                insert.insert();
                break;
            }
        }

        if(command.contains("update")){
            int cnt = 0;
            String id = "";
            String nums = "1234567890";
            for(int i = 0; i < command.length(); i++) {
                if(command.charAt(i) == ' ') cnt = i;
                if(cnt > 0 & i > cnt & nums.indexOf(command.charAt(i)) != -1) id += command.charAt(i);
            }
            update.update(Integer.parseInt(id));
        }

        if(command.contains("remove_key")){
            int cnt = 0;
            String key = "";
            for(int i = 0; i < command.length(); i++) {
                if(command.charAt(i) == ' ') cnt = i;
                if(cnt > 0 & i > cnt) key += command.charAt(i);
            }
            removeKey.remove(key);
            System.out.println("Квартира \"" + key + "\" удалена.");
        }

        if(command.contains("count_by_number_of_rooms")){
            int cnt = 0;
            String numberOfRooms = "";
            for(int i = 0; i < command.length(); i++) {
                if(command.charAt(i) == ' ') cnt = i;
                if(cnt > 0 & i > cnt) numberOfRooms += command.charAt(i);
            }
            countByNumberOfRooms.countByNumberOfRooms(Long.valueOf(numberOfRooms));
        }

        if(command.contains("remove_greater")){
            removeGreater = new RemoveGreater();
            removeGreater.removeGreater();
        }

        if(command.contains("replace_if_greater")){
            int cnt = 0;
            String key = "";
            boolean checker = false;
            for(int i = 0; i < command.length(); i++) {
                if(command.charAt(i) == ' ') cnt = i;
                if(cnt > 0 & i > cnt) key += command.charAt(i);
            }
            checker = replaceIfGreater.replaceIfGreater(key);
            if(checker) System.out.println("Квартира \"" + key + "\" заменена.");
            else System.out.println("Квартира \"" + key + "\" не заменена.");
        }

        if(command.contains("replace_if_lowe")){
            int cnt = 0;
            String key = "";
            boolean checker = false;
            for(int i = 0; i < command.length(); i++) {
                if(command.charAt(i) == ' ') cnt = i;
                if(cnt > 0 & i > cnt) key += command.charAt(i);
            }
            checker = replaceIfLowe.replaceIfLowe(key);
            if(checker) System.out.println("Квартира \"" + key + "\" заменена.");
            else System.out.println("Квартира \"" + key + "\" не заменена.");
        }
    }
}
