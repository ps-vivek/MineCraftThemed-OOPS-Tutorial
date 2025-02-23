package oops;

import oops.inheritance.*;
/*
Explanation of the interface addition:

Interface Creation:

We created a Craftable interface with methods craft(), craft(String item), and getCraftingMaterial().

Interface Implementation:

WoodenBlock and IronBlock implement the Craftable interface, while StoneBlock does not.

This demonstrates that not all blocks need to be craftable.

Polymorphism with Interfaces:

In the MineCraftMain class, we check if a block is instanceof Craftable before calling crafting methods.

This allows us to treat craftable blocks differently from non-craftable ones.

Multiple Inheritance of Type:

By implementing an interface, WoodenBlock and IronBlock now inherit from both MinecraftBlock and Craftable.

This demonstrates how interfaces allow a form of multiple inheritance in Java.

Abstraction through Interfaces:

The Craftable interface defines a contract for craftable blocks without specifying how the crafting is done.

Each implementing class provides its own specific implementation of the crafting methods.
 */
public class MineCraftMain {
    public static void main(String[] args) {
        MinecraftBlock woodenBlock = new WoodenBlock("Brown");
        MinecraftBlock stoneBlock = new StoneBlock("Gray", 2);
        MinecraftBlock ironBlock = new IronBlock("Silver");

        woodenBlock.place();
        stoneBlock.place();
        ironBlock.place();

        woodenBlock.destroy();
        stoneBlock.destroy();
        ironBlock.destroy();

        woodenBlock.getBlockStrength();
        stoneBlock.getBlockStrength();
        ironBlock.getBlockStrength();

        // Demonstrating the use of interface
        if (woodenBlock instanceof Craftable) {
            Craftable craftableWood = (Craftable) woodenBlock;
            craftableWood.craft();
            craftableWood.craft("Wooden Planks");
            System.out.println("Crafting material: " + craftableWood.getCraftingMaterial());
        }

        if (ironBlock instanceof Craftable) {
            Craftable craftableIron = (Craftable) ironBlock;
            craftableIron.craft();
            craftableIron.craft("Iron Ingot");
            System.out.println("Crafting material: " + craftableIron.getCraftingMaterial());
        }
    }
}
