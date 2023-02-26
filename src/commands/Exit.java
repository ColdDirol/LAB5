package commands;

public class Exit {
    public void exit(){
        System.out.println("Всего хорошего...");
        System.exit(0);
    }

    @Override
    public String toString() {
        return "exit";
    }
}
