
public class Female extends Competitor implements FemaleDetails {

    public Female(String competitiorID, String name, competitorGender gender) {
        super(competitiorID, name, gender);
    }

    public String getCompetitorFemaleId() {
        return super.getCompetitionrId();
    }

    public String getFemaleName() {
        return super.getName();
    }

    public competitorGender getFemaleGender() {
        return super.getGender();
    }

    public void getFemales() {
        System.out.println(getCompetitorFemaleId() + " " + getFemaleName() + " " + getFemaleGender());
    }

    public void getFemalesID() {
        System.out.println(getCompetitorFemaleId());
    }

    public void getFemalesName() {
        System.out.println(getFemaleName());
    }

    public void getFemalesGender() {
        System.out.println(getFemaleGender());
    }

    public void getFemaleIDName() {
        System.out.println(getCompetitorFemaleId() + "           " + getFemaleName());
    }

    //These Male Methods are in this female class because the competitor class is abstarct. These dont return anythiing in this Female class as they have been left black.
    public void getMales() {
    }

    public void getMalesID() {
    }

    public void getMalesName() {
    }

    public void getMalesGender() {
    }

    public void getMaleIDName() {
    }

}
