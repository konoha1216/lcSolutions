package oopCase;

public class Bear extends Animal implements IAct{
    public Bear(){

    }
    public Bear(String name, int age){
        super(name, age);
    }

    @Override
    public void love(){
        System.out.println("Bear likes honey");
    }
    @Override
    public void skill(){
        System.out.println("Bear can dance");
    }
    @Override
    public void act(){
        System.out.println(this.getName());
        System.out.println(this.getAge());
        this.love();
        this.skill();
    }
}
