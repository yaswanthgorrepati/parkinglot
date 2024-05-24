package org.lld.parkinglot.parkingspot.manager;

import org.lld.parkinglot.Type;
import org.lld.parkinglot.Vehicle;
import org.lld.parkinglot.parkingspot.ParkingSpot;

import java.util.List;
import java.util.Optional;

public abstract class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;

    public ParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public void setParkingSpotList(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }

    public Optional<ParkingSpot> findParkingSpot(){
        return parkingSpotList.stream().filter(parkingSpot -> parkingSpot.isEmpty()).findFirst();
    }
    public ParkingSpot addParkingSpot(ParkingSpot parkingSpot){
        this.parkingSpotList.add(parkingSpot);
        return parkingSpot;
    }
    public boolean removeParkingSpace(ParkingSpot parkingSpot){
        return  this.parkingSpotList.remove(parkingSpot);
    }
    public ParkingSpot parkVehicle(Vehicle vehicle, ParkingSpot parkingSpot){
        return parkingSpot.parkVehicle(vehicle);
    }
    public ParkingSpot unParkVehicle(Vehicle vehicle, ParkingSpot parkingSpot){
        return parkingSpot.unParkVehicle(vehicle);
    }
}
