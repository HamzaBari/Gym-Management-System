
public class Routine {

    private String description;
    private int calculateScore;
    private int routineRating;

    public Routine(String description, int calculateScore, int routineRating) {
        this.description = description;
        this.calculateScore = calculateScore;
        this.routineRating = routineRating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalculateScore() {
        return calculateScore;
    }

    public void setCalculateScore(int calculateScore) {
        this.calculateScore = calculateScore;
    }

    public int getRoutineRating() {
        return routineRating;
    }

    public void setRoutineRating(int routineRating) {
        this.routineRating = routineRating;
    }

    @Override
    public String toString() {
        return description + " " + calculateScore;
    }

}
