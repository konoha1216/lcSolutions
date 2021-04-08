package oopCase;

public class Lion extends Animal implements IAct{
    private String color;
    private String gender;

    public Lion(){}
    public Lion(String name, int age, String color, String gender){
        super(name, age);
        this.setColor(color);
        this.setGender(gender);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void love() {
        System.out.println("Lion likes running");
    }

    @Override
    public void skill() {
        System.out.println("Bear can rush");
    }

    @Override
    public void act() {
        System.out.println(this.getName());
        System.out.println(this.getAge());
        System.out.println(this.getColor());
        System.out.println(this.getGender());
        this.love();
        this.skill();
    }
}
