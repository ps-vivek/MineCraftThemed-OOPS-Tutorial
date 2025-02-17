package oops.inheritance;
/*
Inheritance in Java is a fundamental object-oriented programming concept that allows
a new class (subclass or derived class) to inherit the properties and
behaviors (fields and methods) of an existing class (superclass or base class).
This provides a way to create a new class based on an existing class, promoting code reuse
and reducing redundancy.

Key Points:
Superclass (Base Class): The class whose properties and methods are inherited.

Subclass (Derived Class): The class that inherits properties and methods from the superclass.

extends Keyword: Used to indicate that a class is inheriting from another class.
 */
public class StoneBlock extends MinecraftBlock {

    private int weight;

    public StoneBlock(String color,int weight) {
        super("Stone", color);
        this.setWeight(weight);
    }

    public void displayStoneWeight(){
        System.out.println(this.getMaterial()+"weighs: "+this.getWeight());
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //Overriding the parent class method
    @Override
    public void place() {
        System.out.println("Placing a " + this.getColor() + " " + this.getMaterial() + " block." + " It weighs: "+this.getWeight());
    }

}
