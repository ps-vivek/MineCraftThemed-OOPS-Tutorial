package oops.composition;

import oops.inheritance.*;
/*
Composition is when one class contains references to objects of other classes as its member variables. This allows the composed class to use the functionalities of the contained objects, creating a more modular and flexible system.

Composition in object-oriented programming (OOP) is a design principle that models a "has-a" relationship. It allows classes to be composed of one or more objects of other classes, enabling code reuse and flexibility.
 */
public class House {
    private MinecraftBlock walls;
    private MinecraftBlock roof;
    private MinecraftBlock floor;

    public House(MinecraftBlock walls, MinecraftBlock roof, MinecraftBlock floor) {
        this.walls = walls;
        this.roof = roof;
        this.floor = floor;
    }

    public void buildHouse() {
        System.out.println("Building a house:");
        System.out.print("Walls: ");
        walls.place();
        System.out.print("Roof: ");
        roof.place();
        System.out.print("Floor: ");
        floor.place();
    }
}
