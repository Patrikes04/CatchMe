import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> queue;
        queue = NewGame.choosePlayers();
        int choose = 69;
        int[] controler={0,choose};
        do {
            Menu.printMenu(queue,controler[0]);
            controler = Menu.chooseMenu(queue,controler[0]);
        } while (!(controler[1]==99));
    }
}
