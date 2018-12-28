import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void printMenu(List<Player> queue,int i) {
        System.out.println("------------------------------------------");
        String[] listMenu = {queue.get(i).getName() + " " + queue.get(i).getRound() + " round", "1.Add new question", "2.Get my previous questions", "3.I know who I am", "4.Next player","5.Name of your hero" ,"99.End game"};
        for (String option : listMenu) System.out.println(option);
    }
    public static int[] chooseMenu(List<Player> queue, int i) {
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        int[] controler={i,choose};
        switch (choose) {
            case 1:
                System.out.print("Write your question ");
                Scanner scanner1 = new Scanner(System.in);
                String newQuestion = scanner1.nextLine();
                queue.get(i).addQuestion(newQuestion);
                System.out.println("Question added");
                return controler;
            case 2:
                System.out.println("Your questions:");
                queue.get(i).getQuestions();
                return controler;
            case 3:
                System.out.println("Congratulation you won, now you can get new hero");
                queue.get(i).setRound(0);
                queue.get(i).removeQuestions();
                queue.get(i).setHero(scanner.next());
                return controler;
            case 4:
                System.out.println("Next Player");
                queue.get(i).addRound();
                controler[0]++;
                if(queue.size()==controler[0]){
                    controler[0]=0;
                }
                return controler;
            case 5:
                System.out.println(queue.get(i).getHero());
                return controler;
            case 99:
                System.out.println("Ending game");
                return controler;
            default:
                System.out.println("Number is not valid");
                return controler;
        }
    }
}
