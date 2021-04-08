package oopCase;

public class Parrot extends Animal implements IAct{
    private String type;

    public Parrot() {
    }

    public Parrot(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void love() {
        System.out.println("Parrot likes flying");
    }

    @Override
    public void skill() {
        System.out.println("Bear can speak");
    }

    @Override
    public void act() {
        System.out.println(this.getName());
        System.out.println(this.getAge());
        System.out.println(this.getType());
        this.love();
        this.skill();
    }
}
