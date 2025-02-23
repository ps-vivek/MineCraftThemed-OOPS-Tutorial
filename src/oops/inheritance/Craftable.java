package oops.inheritance;
/*
Interface:
	• Pure Blueprint: An interface is a complete blueprint that only defines methods, without any implementation. (Note: In Java 8+, interfaces can have default and static methods with implementations, but this is an additional feature rather than the main use.)
	• No State: It cannot have fields, meaning it cannot hold state.
Multiple Inheritance: A class can implement multiple interfaces, allowing for more flexible design.
 */

public interface Craftable {
    void craft();
    void craft(String item);
    String getCraftingMaterial();
}
