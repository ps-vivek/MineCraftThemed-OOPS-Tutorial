package oops.inheritance;

public class MinecraftBlock {
    private String material;
    private String color;

    public MinecraftBlock(String material, String color) {
        this.material = material;
        this.color = color;
    }

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

    // Method to be overridden by subclasses
    public void place() {
        System.out.println("Placing a " + this.getColor() + " " + this.getMaterial() + " block inside MinecraftBlock class.");
    }

    // New method to be overridden by subclasses
    public void destroy() {
        System.out.println("Destroying a " + this.getMaterial() + " block.");
    }
}
