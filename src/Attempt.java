
public abstract class Attempt {

    private int Score;
    private Routine routine;
    private Competitor competitor;
    private Event event;

    public Attempt(Routine routine, Competitor competitor, int Score) {
        this.routine = routine;
        this.competitor = competitor;
        this.Score = Score;
        if (Score < 0 || Score > 100) {
            System.out.println("Score out of Bounds");
            this.Score = Score = 0;
        } else {
            this.Score = Score;
        }
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score, Routine routine) {
        this.Score = Score * routine.getCalculateScore();
    }

    public int calculateScore() {
        this.Score = Score * routine.getCalculateScore();
        return Score;
    }

    public Routine getRoutine() {
        return routine;
    }

    public String getRoutineDescription() {
        return routine.getDescription();
    }

    public int getRoutineRating() {
        return routine.getRoutineRating();
    }

    public void setRoutine(Routine routine) {
        this.routine = routine;
    }

    public Competitor getCompetitor() {
        return competitor;
    }

    public String getCompetitorName() {
        return competitor.getName();
    }

    public void getCompetitorMaleName() {
        System.out.print("Name: ");
        competitor.getMName();
    }

    public void getCompetitorFemaleName() {
        System.out.print("Name: ");
        competitor.getFName();
    }

    public void enteredIntoEvent(Competitor competitor) {
        this.competitor = competitor;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Event getEvent() {
        return event;
    }

    public abstract void getMaleAttempts();

    public abstract void getFemaleAttempts();

    @Override
    public String toString() {
        return "Name: " + getCompetitorName() + "\n"
                + "Routine Description: " + getRoutineDescription() + "\n"
                + "Routine Rating: " + getRoutineRating() + "\n"
                + "Score : " + calculateScore() + "\n";
    }

}
