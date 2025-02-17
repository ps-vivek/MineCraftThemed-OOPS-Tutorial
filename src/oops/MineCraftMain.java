package oops;


import oops.inheritance.IronBlock;
import oops.inheritance.MinecraftBlock;
import oops.inheritance.StoneBlock;
import oops.inheritance.WoddenBlock;


public class MineCraftMain {
    public static void main(String[] args) {
        // Creating objects (Instances of the subclasses)
        MinecraftBlock woodenBlock = new WoddenBlock("gold");
        MinecraftBlock stoneBlock = new StoneBlock("Gray",2);

        // Using objects
        woodenBlock.place(); // Outputs: Placing a Brown Wood block.
        stoneBlock.place(); // Outputs: Placing a Gray Stone block.

        // Creating an iron block using the default constructor
        MinecraftBlock ironBlock = new IronBlock("brown");

        ironBlock.place();
    }
}
