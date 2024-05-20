
public class MaleAttempt extends Attempt {

    public MaleAttempt(Routine routine, Competitor competitor, int Score) {
        super(routine, competitor, Score);
    }

    public String getMaleRoutineDescription() {
        return super.getRoutineDescription();
    }

    public int getMaleRoutineRating() {
        return super.getRoutineRating();
    }

    public int getCalulatedScore() {
        return super.getScore();
    }

    public String getCompetitorName() {
        return super.getCompetitorName();
    }

    public void getMaleAttempts() {
        System.out.println("Name: " + getCompetitorName() + "\n"
                + "Routine Description: " + getMaleRoutineDescription() + "\n"
                + "Routine Rating: " + getMaleRoutineRating() + "\n"
                + "Score : " + calculateScore() + "\n");
    }

    public void getFemaleAttempts() {
    }

}
