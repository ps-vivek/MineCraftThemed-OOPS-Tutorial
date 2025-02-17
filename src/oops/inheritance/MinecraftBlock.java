package oops.inheritance;

public class MinecraftBlock {
    // Attributes (Properties)
    private String material = "Gold";
    private String color = "Yellow";

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    MinecraftBlock(String material, String color) {
        this.material = material;
        this.color = color;
    }

    MinecraftBlock() {
    }

    // Method (Action)
    public void place() {
        System.out.println("Placing a " + this.getColor() + " " + this.getMaterial() + " block.");
    }
}