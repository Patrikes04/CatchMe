import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewGame {
    public static List<Player> choosePlayers(){
        String name;
        Scanner scanner=new Scanner(System.in);
        List<Player> queue =new ArrayList<>();
        System.out.println(queue.size()+1+"-Player choose your name");
        name=scanner.next();
        queue.add(new Player(name));
        System.out.println(queue.get(0).getName()+" time to choose your hero");
        String hero=scanner.next();
        queue.get(0).setHero(hero);
        return queue;
    }
}
