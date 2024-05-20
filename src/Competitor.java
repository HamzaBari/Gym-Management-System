
public abstract class Competitor {

    private String competitiorID;
    private String name;
    private competitorGender gender;

    public Competitor(String competitiorID, String name, competitorGender gender) {
        this.competitiorID = competitiorID;
        this.name = name;
        this.gender = gender;
    }

    public String getCompetitionrId() {
        return competitiorID;
    }

    public String getName() {
        return name;
    }

    public competitorGender getGender() {
        return gender;
    }

    public void maleCompetitors(String competitiorID, String name, competitorGender gender) {
        this.competitiorID = competitiorID;
        this.name = name;
        this.gender = gender;
    }

    public void femaleCompetitors(String competitiorID, String name, competitorGender gender) {
        this.competitiorID = competitiorID;
        this.name = name;
        this.gender = gender;
    }

    //Male
    public abstract void getMales();

    public void getMale() {
        getMales();
    }

    public abstract void getMalesID();

    public void getMaleID() {
        getMalesID();
    }

    public abstract void getMalesName();

    public void getMName() {
        getMalesName();
    }

    public abstract void getMalesGender();

    public void getMGender() {
        getMalesGender();
    }

    public abstract void getMaleIDName();

    public void getMIdName() {
        getMaleIDName();
    }

    //Female 
    public abstract void getFemales();

    public void getFemale() {
        getFemales();
    }

    public abstract void getFemalesID();

    public void getFemaleID() {
        getFemalesID();
    }

    public abstract void getFemalesName();

    public void getFName() {
        getFemalesName();
    }

    public abstract void getFemalesGender();

    public void getFGender() {
        getFemalesGender();
    }

    public abstract void getFemaleIDName();

    public void getFIdName() {
        getFemaleIDName();
    }

    @Override
    public String toString() {
        return "\n" + competitiorID + "\n" + name + "\n" + gender + "\n";
    }

}
