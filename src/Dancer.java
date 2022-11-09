public class Dancer extends Person{
    private String skill;

    public Dancer(String name, String designation, String skill) {
        super(name, designation);
        this.skill = skill;
    }
    public Dancer(){

    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Dancer{" + super.getName() + " " + super.getDesignation() +
                " " + skill + " " +
                '}';
    }
}
