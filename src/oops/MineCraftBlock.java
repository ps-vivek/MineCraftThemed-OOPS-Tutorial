package oops;


// Class (Blueprint)
class MinecraftBlock {
    // Attributes (Properties)
    String material;
    String color;

    // Constructor
    public MinecraftBlock(String material, String color) {
        this.material = material;
        this.color = color;
    }

    // Method (Action)
    public void place() {
        System.out.println("Placing a " + color + " " + material + " block.");
    }
}
