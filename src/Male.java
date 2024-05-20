
public class Male extends Competitor implements MaleDetails {

    public Male(String competitiorID, String name, competitorGender gender) {
        super(competitiorID, name, gender);
    }

    public String getCompetitorMaleId() {
        return super.getCompetitionrId();
    }

    public String getMaleName() {
        return super.getName();
    }

    public competitorGender getMaleGender() {
        return super.getGender();
    }

    public void getMales() {
        System.out.println(getCompetitorMaleId() + " " + " " + getMaleName() + " " + getMaleGender());
    }

    public void getMalesID() {
        System.out.println(getCompetitorMaleId());
    }

    public void getMalesName() {
        System.out.println(getMaleName());
    }

    public void getMalesGender() {
        System.out.println(getMaleGender());
    }

    public void getMaleIDName() {
        System.out.println(getCompetitorMaleId() + "           " + getMaleName());
    }

    //These Female Methods are in this male class because the competitor class is abstarct. These dont return anythiing in this Female class as they have been left black.
    public void getFemales() {
    }

    public void getFemalesID() {
    }

    public void getFemalesName() {
    }

    public void getFemalesGender() {
    }

    public void getFemaleIDName() {
    }

}
