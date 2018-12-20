import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int round;
    private String hero;
    List<String> questions= new ArrayList<String>();

    public Player(String name) {
        this.name = name;
        this.round=1;
    }

    public String getName() {
        return name;
    }

    public int getRound() {
        return round;
    }

    public String getHero() {
        return hero;
    }

    public void getQuestions() {
        for (String question : questions) System.out.println(question);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public void addQuestion(String question) {
        this.questions.add(question);
    }
    public void removeQuestions(){
        this.questions.clear();
    }
}
