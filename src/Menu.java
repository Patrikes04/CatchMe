import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void printMenu(){
        System.out.println("1.Add new question");
        System.out.println("2.Get my previous questions");
        System.out.println("3.I know who I am");
        System.out.println("4.Next player");
        System.out.println("99.End game");
    }
    public static void chooseMenu(String choose, List<Player> queue){
        Scanner scanner= new Scanner(System.in);
        switch (choose){
            case "1":
                String newQuestion= scanner.nextLine();
                queue.get(0).addQuestion(newQuestion);
                System.out.println("Adding your question");
                break;
            case "2":
                System.out.println(queue.get(0).getQuestions());
                break;
            case "3":
                System.out.println("Congratulation you won, now you can get new hero");
                queue.get(0).setRound(0);
                queue.get(0).removeQuestions();
                queue.get(0).setHero(scanner.next());
                break;
            case "4":
                System.out.println("Next Player");
                break;
            case "5":
                System.out.println("Ending game");
                choose="99";
                break;
            default:
                System.out.println("Number is not valid");
        }
    }
}
