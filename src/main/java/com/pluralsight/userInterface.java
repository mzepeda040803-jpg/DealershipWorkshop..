package com.pluralsight;

public class userInterface {
    private Dealership dealership;

    public userInterface() {
    }

    public void display(){
        this.dealership = new Dealership("Vroom", "666 Arches Way", "666-666-6666");

        System.out.println("AdvancedDealership App");
    }

}
