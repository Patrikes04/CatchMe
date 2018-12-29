import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewGame {
    public static List<Player> choosePlayers(){
        String name;
        Scanner scanner=new Scanner(System.in);
        boolean countTrue;
        int count=0;
        do{
            try {
                System.out.println("How many players will play?");
                Scanner scannerCount = new Scanner(System.in);
                count= scannerCount.nextInt();
                countTrue=true;
            }catch (Exception e){
                System.out.println("This is not number");
                countTrue=false;
            }
        }while (!countTrue);
        List<Player> queue =new ArrayList<>();
        for(int i=0;i<count;i++) {
            System.out.println(i + 1 + "-Player choose your name");
            name = scanner.next();
            queue.add(new Player(name));
            System.out.println(queue.get(i).getName() + " time to choose your hero");
            String hero = scanner.next();
            queue.get(i).setHero(hero);
            Clear.cleaning();
        }
        return queue;
    }
}
