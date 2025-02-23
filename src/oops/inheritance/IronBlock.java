package oops.inheritance;

public class IronBlock extends MinecraftBlock {
    public IronBlock(String color) {
        super("Iron", color);
    }

    // Overriding the place() method
    @Override
    public void place() {
        System.out.println("Placing a " + this.getColor() + " Iron block with a metallic clang.");
    }

    // Overriding the destroy() method
    @Override
    public void destroy() {
        System.out.println("Destroying an Iron block with significant effort. It breaks with a loud clang.");
    }

    // Implementing the abstract method
    @Override
    public void getBlockStrength() {
        System.out.println("Iron block has high strength.");
    }
}
