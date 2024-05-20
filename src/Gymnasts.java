
public class Gymnasts implements GenderEvents {

    private String name;
    private String description;

    public Gymnasts() {
    }

    public String getName() {
        return name;
    }

    public void maleGymnasts(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void femaleGymnasts(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void mixedGendersGymnasts(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + " " + description;
    }

}
