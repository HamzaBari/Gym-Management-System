
import java.util.ArrayList;

public class Competition {

    private String competitionName;
    private String competitionDate;
    private ArrayList<Event> events;

    public Competition(String competitionName, String competitionDate, ArrayList<Event> events) {
        this.competitionName = competitionName;
        this.competitionDate = competitionDate;
        this.events = events;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public String getCompetitionDate() {
        return competitionDate;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    @Override
    public String toString() {
        return competitionName + "\n" + competitionDate + "\n" + events;
    }

}
