package com.workintech;


public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(300, PaintColor.BLUE);

        Bed bed = new Bed("Classic", 4, 100, 2, 1);
        Lamp lamp = new Lamp(true, LampType.NIGHTSTAND, 60);
        Wardrobe wardrobe = new Wardrobe(200, 240, 150.5);
        Carpet carpet = new Carpet(300, 400, PaintColor.PINK);

        Bedroom myBedroom = new Bedroom("My Bedroom", wall1, wall2, wall3, wall4,carpet,
                ceiling, bed, lamp, wardrobe);

        myBedroom.getBed().make();
        myBedroom.getLamp().turnOn();
        myBedroom.getWall1().create();
        myBedroom.getCeiling().create();

        System.out.println("Pillows: " + myBedroom.getBed().getPillows());
        System.out.println("Carpet Color: " + myBedroom.getCarpet().getColor());

    }
}