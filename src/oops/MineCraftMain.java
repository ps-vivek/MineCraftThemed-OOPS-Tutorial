package oops;

import oops.inheritance.*;
/*
	1. Compile-Time Polymorphism (Static Binding)
		○ Achieved through method overloading.
		○ The method to be called is determined at compile time.
Example: Same method name but different parameters.


	2. Run-Time Polymorphism (Dynamic Binding)
		○ Achieved through method overriding.
		○ The method to be called is determined at runtime.
		○ Example: A method in the parent class is overridden in the child class, and the method called is based on the object's runtime type.

 */
public class MineCraftMain {
    public static void main(String[] args) {
        // Creating objects (Instances of the subclasses)
        MinecraftBlock woodenBlock = new WoddenBlock("Brown");
        MinecraftBlock stoneBlock = new StoneBlock("Gray", 2);
        MinecraftBlock ironBlock = new IronBlock("Silver");

        // Demonstrating polymorphism through method overriding
        woodenBlock.place();
        woodenBlock.place(); // Calls WoodenBlock's overridden place() method
        stoneBlock.place(); // Calls StoneBlock's overridden place() method
        ironBlock.place(); // Calls IronBlock's overridden place() method

        // Demonstrating method overloading
        ((WoddenBlock) woodenBlock).craft(); // Calls craft() without parameters
        ((WoddenBlock) woodenBlock).craft("Planks"); // Calls craft() with a String parameter

        // Using the destroy() method to demonstrate another form of overriding
        woodenBlock.destroy();
        stoneBlock.destroy();
        ironBlock.destroy();
    }
}
