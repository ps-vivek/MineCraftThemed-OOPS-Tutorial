package oops;

/**
 *
 * Class
 * Definition: A class is like a blueprint or a recipe.
 * It defines what attributes (properties) and
 * methods (actions) an object should have.
 *
 * Purpose: It provides a template to create objects with specific characteristics and behaviors.
 *
 * Example in Minecraft:
 *  Class: Think of a "Blueprint for a Minecraft Block".
 *  It defines the properties (like color, material) and methods (like place, destroy)
 *  that a Minecraft block should have.
 *
 * Object
 * Definition: An object is an instance of a class.
 * It is a concrete item created using the blueprint provided by the class.
 *
 * Purpose: It represents a specific item that can be used and manipulated in the program.
 *
 * Example in Minecraft:
 * Object: Think of an actual "Minecraft Block" you place in the game.
 * It is created based on the blueprint and has specific properties (like being a wooden block) and
 * can perform actions (like being placed or destroyed).
 */
public class MineCraftMain {
    public static void main(String[] args) {
        // Creating objects (Instances of the class)
        MinecraftBlock woodenBlock = new MinecraftBlock("Wood", "Brown");
        MinecraftBlock stoneBlock = new MinecraftBlock("Stone", "Gray");

        // Using objects
        woodenBlock.place(); // Outputs: Placing a Brown Wood block.
        stoneBlock.place(); // Outputs: Placing a Gray Stone block.
    }
}
