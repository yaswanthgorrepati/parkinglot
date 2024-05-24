package org.lld.parkinglot.parkingspot.manager;

import org.lld.parkinglot.Type;
import org.lld.parkinglot.Vehicle;
import org.lld.parkinglot.parkingspot.ParkingSpot;

import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{
    public TwoWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList);
    }
}
