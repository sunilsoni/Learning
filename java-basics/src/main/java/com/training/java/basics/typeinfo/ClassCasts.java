package com.training.java.basics.typeinfo;

public class ClassCasts {

    public static void main(String[] args) {

        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        h = (House) b; //

        try {
            Class<House> hClass = House.class;

            //Produces exact type
            House house = hClass.newInstance();
            Class<? super House> up = hClass.getSuperclass();

            // won't compile:
            //Class<Building> up2 = hClass.getSuperclass();

            //Only produces Object
            Object obj = up.newInstance();

            System.out.println(house);
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}