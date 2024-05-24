package org.lld.parkinglot.parkingspot.manager.factory;

import org.lld.parkinglot.Type;
import org.lld.parkinglot.parkingspot.FourWheelerParkingSpot;
import org.lld.parkinglot.parkingspot.ParkingSpot;
import org.lld.parkinglot.parkingspot.TwoWheelerParkingSpot;
import org.lld.parkinglot.parkingspot.manager.FourWheelerParkingSpotManager;
import org.lld.parkinglot.parkingspot.manager.ParkingSpotManager;
import org.lld.parkinglot.parkingspot.manager.TwoWheelerParkingSpotManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ParkingSpotManagerFactory {
    private TwoWheelerParkingSpotManager twoWheelerParkingSpotManager = null;
    private FourWheelerParkingSpotManager fourWheelerParkingSpotManager = null;

    public ParkingSpotManagerFactory(TwoWheelerParkingSpotManager twoWheelerParkingSpotManager, FourWheelerParkingSpotManager fourWheelerParkingSpotManager) {
        this.twoWheelerParkingSpotManager = twoWheelerParkingSpotManager;
        this.fourWheelerParkingSpotManager = fourWheelerParkingSpotManager;
    }

    public ParkingSpotManager getParkingSlotManager(Type vehicleType) {
        switch (vehicleType) {
            case TWO_WHEELER: {
                return twoWheelerParkingSpotManager;

            }
            case FOUR_WHEELER: {
                return fourWheelerParkingSpotManager;

            }
        }
        return null;
    }

}
