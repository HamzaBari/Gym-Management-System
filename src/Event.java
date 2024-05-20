
import java.util.ArrayList;

public class Event {

    private Gymnasts event;
    private String startTime;
    private ArrayList<Competitor> competitors;
    private ArrayList<CommiteeMember> commiteeMembers;
    private ArrayList<Attempt> attempts;

    public Event(Gymnasts event, String startTime, ArrayList<Competitor> competitors, ArrayList<CommiteeMember> commiteeMember, ArrayList<Attempt> attempts) {
        this.event = event;
        this.startTime = startTime;
        this.competitors = competitors;
        this.commiteeMembers = commiteeMember;
        this.attempts = attempts;
    }

    public Gymnasts getEvent() {
        return event;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setEvent(Gymnasts eventName) {
        this.event = eventName;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ArrayList<Competitor> getCompetitors() {
        return competitors;
    }

    public void setCompetitors(ArrayList<Competitor> competitors) {
        this.competitors = competitors;
    }

    public ArrayList<CommiteeMember> getCommiteeMembers() {
        return commiteeMembers;
    }

    public void setCommiteeMembers(ArrayList<CommiteeMember> commiteeMembers) {
        this.commiteeMembers = commiteeMembers;
    }

    public ArrayList<Attempt> getAttempts() {
        return attempts;
    }

    public void setAttempts(ArrayList<Attempt> attempts) {
        this.attempts = attempts;
    }

    @Override
    public String toString() {
        return "Event name & Description: " + event + "\n"
                + "Start Time: " + startTime + "\n"
                + "List of Competitors: " + competitors + "\n"
                + "Commitee Members: " + commiteeMembers + "\n"
                + "Attempts made by the competitors: " + attempts;
    }

}
