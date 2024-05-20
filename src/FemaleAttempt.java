
public class FemaleAttempt extends Attempt {

    public FemaleAttempt(Routine routine, Competitor competitor, int Score) {
        super(routine, competitor, Score);
    }

    public String getFemaleRoutineDescription() {
        return super.getRoutineDescription();
    }

    public int getFemaleRoutineRating() {
        return super.getRoutineRating();
    }

    public int getCalulatedScore() {
        return super.getScore();
    }

    public String getCompetitorName() {
        return super.getCompetitorName();
    }

    public void getFemaleAttempts() {
        System.out.println("Name: " + getCompetitorName() + "\n"
                + "Routine Description: " + getFemaleRoutineDescription() + "\n"
                + "Routine Rating: " + getFemaleRoutineRating() + "\n"
                + "Score : " + calculateScore() + "\n");
    }

    public void getMaleAttempts() {
    }

}
