package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DealershipFileManager {
    Dealership dealership = new Dealership();

    try
    private final boolean line;

    {
        FileReader fileReader = new FileReader("inventory.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        bufferedReader.readLine();
        String [] dealerShipData = line.split("\\|");

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        
        while ((line = bufferedReader.readLine() != null)){
            String [] parts = line.split("\\|");
            
            int vin = Integer.parseInt(parts[0]);
            int year = Integer.parseInt(parts[1]);
            String make = parts[2];
            String model = parts [3];
            String vehicleType = parts[4];
            String color = parts [5];
            double price = Double.parseDouble(parts [6]);
            int odometer = Integer.parseInt(parts [7]);


        }

//        while ((input = bufferedReader.readLine()) !+ null) {
//            String[] parts = line.split(Pattern.quote("|"));
//
//            LocalDate date = LocalDate.parse(parts[0]);
//
//            LocalTime time = LocalTime.parse(parts[1]);
//
//            String description = parts[2];
//
//            String vendor = parts[3];
//
//            String amountAsString = parts[4];
//            double amount = Double.parseDouble(amountAsString);
//
//            Transaction transaction = new Transaction(date, time, description, vendor, amount);
//            transactions.add(transaction);
//
        //    private int vin;
//    private int year;
//    private String make;
//    private String model;
//    private String vehicleType;
//    private String color;
//    private double price;
//    private int odometer;
//        }

        System.out.println(input);
        }

        bufferedReader.close();
    }catch (IOException e) {
        e.printStackTrace();
    }




}
