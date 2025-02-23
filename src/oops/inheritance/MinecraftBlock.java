package oops.inheritance;

/*
Abstract Class:
	• Blueprint with Implementation: An abstract class can provide both a blueprint (abstract methods) and actual implementation (concrete methods).
	• Partial Blueprint: It can define some methods that must be implemented by subclasses, and also provide default implementations for other methods.
State and Behavior: It can have fields (state) and methods (behavior) that can be used by subclasses.
 */
public abstract  class MinecraftBlock {
    private String material;
    private String color;

    public MinecraftBlock(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public abstract void getBlockStrength();

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
