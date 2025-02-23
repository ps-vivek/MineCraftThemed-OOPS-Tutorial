package oops;

import oops.inheritance.*;
import oops.composition.House;

public class MineCraftMain {
    public static void main(String[] args) {
        MinecraftBlock woodenBlock = new WoodenBlock("Brown");
        MinecraftBlock stoneBlock = new StoneBlock("Gray", 2);
        MinecraftBlock ironBlock = new IronBlock("Silver");

        // Creating a house using composition
        House myHouse = new House(stoneBlock, woodenBlock, ironBlock);
        myHouse.buildHouse();
    }
}
