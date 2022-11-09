public class Programmer extends Person{
    private String skill;

    public Programmer(String name, String designation, String skill) {
        super(name, designation);
        this.skill = skill;
    }
    public Programmer(){

    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Programmer{" + super.getName() + " " + super.getDesignation() +
                " " + skill + " " +
                '}';
    }
}
