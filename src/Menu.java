import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void printMenu(List<Player> queue) {
        System.out.println("------------------------------------------");
        String[] listMenu = {queue.get(0).getName() + " " + queue.get(0).getRound() + " round", "1.Add new question", "2.Get my previous questions", "3.I know who I am", "4.Next player", "99.End game"};
        for (String option : listMenu) System.out.println(option);
    }
    public static String chooseMenu(List<Player> queue) {
        Scanner scanner = new Scanner(System.in);
        String choose = scanner.next();
        switch (choose) {
            case "1":
                System.out.print("Write your question ");
                Scanner scanner1 = new Scanner(System.in);
                String newQuestion = scanner1.nextLine();
                queue.get(0).addQuestion(newQuestion);
                System.out.println("Question added");
                return "1";
            case "2":
                System.out.println("You questions:");
                queue.get(0).getQuestions();
                return "2";
            case "3":
                System.out.println("Congratulation you won, now you can get new hero");
                queue.get(0).setRound(0);
                queue.get(0).removeQuestions();
                queue.get(0).setHero(scanner.next());
                return "3";
            case "4":
                System.out.println("Next Player");
                return "4";
            case "99":
                System.out.println("Ending game");
                return choose;
            default:
                System.out.println("Number is not valid");
                return "default";
        }
    }
}
