import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> queue;
        queue = NewGame.choosePlayers();
        String choose = "default";
        do {
            Menu.printMenu(queue);
            choose = Menu.chooseMenu(queue);

        } while (!(choose.equals("99")));
    }
}
