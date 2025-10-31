package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }


    public void addVehicle(Vehicle vehicle) {
        this.inventory.add(vehicle);
    }

    public void removeVehicle (Vehicle vehicle) {
        this.inventory.add(vehicle);
    }




    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", inventory=" + inventory +
                '}';
    }





//    public List<Vehicle> getVehiclesByPrice (double min, double max){
//
//    }
//
//    public List<Vehicle> getVehiclesByMakeModel (String make, String model) {
//
//    }
//
//    public List<Vehicle> getVehiclesByYear (int min, int max){
//
//    }
//
//    public List<Vehicle> getVehiclesByColor (String color){
//
//    }
//
//    public List<Vehicle> getVehiclesByMileage (int minMileage, int maxMileage) {
//
//    }
//
//    public List<Vehicle> getVehiclesBYType (String vehicleType){
//
//    }
//
//    public List<Vehicle> getAllVehicles (){
//
//    }
//
//    public void addVehicle(Vehicle vehicle) {
//
//    }
//
//    public void removeVehicle (Vehicle vehicle) {
//

//    }
}
