import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        Scanner scanner=new Scanner(System.in);
        List<Player> queue =new ArrayList<Player>();
        System.out.println(queue.size()+1+"-Player choose your name");
        name=scanner.next();
        queue.add(new Player(name));
        System.out.println(queue.get(0).getName()+" time to choose your hero");
        queue.get(0).setHero(scanner.next());

        String choose;
        do {
            System.out.println(queue.get(0).getName()+" "+queue.get(0).getRound()+ " round" );
            Menu.printMenu();
            choose=scanner.nextLine();
            Menu.chooseMenu(choose,queue);

        }while(!(choose.equals("99")));
    }
}
