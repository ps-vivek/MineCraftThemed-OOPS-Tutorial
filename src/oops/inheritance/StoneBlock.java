package oops.inheritance;

public class StoneBlock extends MinecraftBlock {
    private int weight;

    public StoneBlock(String color, int weight) {
        super("Stone", color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Overriding the place() method
    @Override
    public void place() {
        System.out.println("Placing a " + this.getColor() + " Stone block with a heavy thump. It weighs: " + this.weight + " units.");
    }

    // Overriding the destroy() method
    @Override
    public void destroy() {
        System.out.println("Destroying a Stone block with effort. It crumbles into smaller rocks.");
    }
}
