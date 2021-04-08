package oopCase;

public class Clown implements IAct{
    private String name;
    private int years;

    public Clown(){}

    public Clown(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void dress(){
        System.out.println("wearing colorful suits");
    }

    @Override
    public void skill() {
        System.out.println("clown can walk on stilts");
    }

    @Override
    public void act() {
        System.out.println(this.getName());
        System.out.println(this.getYears());
        this.dress();
        this.skill();
    }
}
