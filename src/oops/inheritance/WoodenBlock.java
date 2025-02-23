package oops.inheritance;

public class WoodenBlock extends MinecraftBlock {
    public WoodenBlock(String color) {
        super("Wood", color);
    }

    @Override
    public void place() {
        System.out.println("Placing a " + this.getColor() + " Wooden block with a thud.");
    }

    @Override
    public void destroy() {
        System.out.println("Destroying a Wooden block with ease. It splinters into pieces.");
    }

    // Implementing the abstract method
    @Override
    public void getBlockStrength() {
        System.out.println("Wooden block has low strength.");
    }

    // Method overloading (unchanged)
    public void craft() {
        System.out.println("Crafting something from wood.");
    }

    public void craft(String item) {
        System.out.println("Crafting " + item + " from wood.");
    }
}
