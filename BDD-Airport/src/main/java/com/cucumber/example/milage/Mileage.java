package com.cucumber.example.milage;

import com.cucumber.example.airport.Passenger;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Mileage {

    private static final int VIP_FACTOR = 10;
    private static final int USUAL_FACTOR = 20;

    private Map<Passenger, Integer> passengerMileageMap = new HashMap<>();
    private Map<Passenger, Integer> passengerPointsMap = new HashMap<>();

    public Map<Passenger, Integer> getPassengerPointsMap(){

        return Collections.unmodifiableMap(passengerPointsMap);
    }
    public void addMileage(Passenger passenger, int miles){

        if(passengerMileageMap.containsKey(passenger)){
            passengerMileageMap.put(passenger, passengerMileageMap.get(passenger) + miles);
        }else{
            passengerMileageMap.put(passenger, miles);
        }
    }

    public void calculateGivenPoints(){

        for(Passenger passenger: passengerMileageMap.keySet()){
            if(passenger.isVip()){
                passengerPointsMap.put(passenger, passengerMileageMap.get(passenger) / VIP_FACTOR);
            }else{
                passengerPointsMap.put(passenger, passengerMileageMap.get(passenger) / USUAL_FACTOR);
            }
        }
    }
}
