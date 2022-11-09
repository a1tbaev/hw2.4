public class Singer extends Person{
    private String skill;
    private String skill1;
    public Singer(String name, String designation, String skill, String skill1) {
        super(name, designation);
        this.skill = skill;
        this.skill1 = skill1;
    }
    public Singer(){

    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getSkill1() {
        return skill1;
    }

    public void setSkill1(String skill1) {
        this.skill1 = skill1;
    }

    @Override
    public String toString() {
        return "Singer{" + super.getName() + " " + super.getDesignation() +
                " " + skill + " " +
                " " + skill1 + " " +
                '}';
    }
}
