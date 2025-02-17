package oops;


public class MineCraftMain {
    public static void main(String[] args) {
        // Creating objects (Instances of the class)
        MinecraftBlock woodenBlock = new MinecraftBlock("wood","Brown");

        MinecraftBlock stoneBlock = new MinecraftBlock("iron","Gray");
        // Using objects
        woodenBlock.place(); // Outputs: Placing a Brown Wood block.
        stoneBlock.place(); // Outputs: Placing a Gray Stone block.

        MinecraftBlock ironBlock = new MinecraftBlock();
        ironBlock.weight = 3;
        //Private fields cant be accessed outside
        //ironBlock.color = "blue";
        ironBlock.place();

        ironBlock.setColor("copper");
        ironBlock.setMaterial("Iron");
        ironBlock.place();
    }
}
