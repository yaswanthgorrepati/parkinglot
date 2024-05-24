package org.lld.parkinglot.parkingspot.gate;

import org.lld.parkinglot.Type;
import org.lld.parkinglot.Vehicle;
import org.lld.parkinglot.parkingspot.ParkingSpot;
import org.lld.parkinglot.parkingspot.Ticket;
import org.lld.parkinglot.parkingspot.manager.ParkingSpotManager;
import org.lld.parkinglot.parkingspot.manager.factory.ParkingSpotManagerFactory;

import java.util.Date;

public class EntranceGate {

    private ParkingSpotManagerFactory parkingSpotManagerFactory;

    public EntranceGate(ParkingSpotManagerFactory parkingSpotManagerFactory) {
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }

    public ParkingSpot findSpace(Type vehicleType){
        return parkingSpotManagerFactory.getParkingSlotManager(vehicleType).findParkingSpot().get();
    }

    public Ticket parkVehicleAndGenerateTicket(Vehicle vehicle){
        ParkingSpot parkingSpot =  parkingSpotManagerFactory.getParkingSlotManager(vehicle.getVehicleType()).findParkingSpot().get().parkVehicle(vehicle);
        return new Ticket(new Date(), vehicle, parkingSpot);
    }

}
