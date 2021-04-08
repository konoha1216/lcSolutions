package oopCase;

public class Monkey extends Animal implements IAct{
    private String type;

    public Monkey() {
    }

    public Monkey(String name, int age, String type) {
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
        System.out.println("Monkey likes fruits");
    }

    @Override
    public void skill() {
        System.out.println("Monkey can climb");
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
