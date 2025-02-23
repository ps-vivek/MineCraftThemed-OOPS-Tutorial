package oops;

import oops.inheritance.*;

public class MineCraftMain {
    public static void main(String[] args) {
        // Creating objects (Instances of the subclasses)
        MinecraftBlock woodenBlock = new WoodenBlock("Brown");
        MinecraftBlock stoneBlock = new StoneBlock("Gray", 2);
        MinecraftBlock ironBlock = new IronBlock("Silver");

        // Demonstrating polymorphism through method overriding
        woodenBlock.place();
        stoneBlock.place();
        ironBlock.place();

        // Demonstrating method overloading
        ((WoodenBlock) woodenBlock).craft();
        ((WoodenBlock) woodenBlock).craft("Planks");

        // Using the destroy() method to demonstrate another form of overriding
        woodenBlock.destroy();
        stoneBlock.destroy();
        ironBlock.destroy();

        // Using the abstract method
        woodenBlock.getBlockStrength();
        stoneBlock.getBlockStrength();
        ironBlock.getBlockStrength();
    }
}
