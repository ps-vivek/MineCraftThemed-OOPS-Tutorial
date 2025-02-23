package oops.inheritance;

public class WoddenBlock extends MinecraftBlock {
    public WoddenBlock(String color) {
        super("Wood", color);
    }

    // Overriding the place() method
    @Override
    public void place() {
        System.out.println("Placing a " + this.getColor() + " Wooden block with a thud.");
    }

    // Overriding the destroy() method
    @Override
    public void destroy() {
        System.out.println("Destroying a Wooden block with ease. It splinters into pieces.");
    }

    // Method overloading
    public void craft() {
        System.out.println("Crafting something from wood.");
    }

    public void craft(String item) {
        System.out.println("Crafting " + item + " from wood.");
    }
}
