package oops;

/*
        The attributes material and color are now private.
         Public getter and setter methods are provided to access and modify these attributes.
     Encapsulation ensures that the internal state of the object is protected and can only be changed through the public methods.
 */


// ClassEncapsulation ensures that the internal state of the object is protected and can only be changed through the public methods. (Blueprint)
class MinecraftBlock {
    // AThis way, we have added encapsulation to your code, improving its robustness and security.ttributes (Properties)
    private String material="Gold";
    private String color="Yellow";
    int weight; //This can be accessed outside

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

    MinecraftBlock(String material, String color){
        this.material = material;
        this.color = color;
    }
    

    MinecraftBlock(){

    }

    // Method (Action)
    public void place() {
        System.out.println("Placing a " + this.getColor() + " " + this.getMaterial() + " block.");
    }
}
