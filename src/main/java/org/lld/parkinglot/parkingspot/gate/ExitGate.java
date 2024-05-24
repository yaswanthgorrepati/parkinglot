package org.lld.parkinglot.parkingspot.gate;

import org.lld.parkinglot.parkingspot.ParkingSpot;
import org.lld.parkinglot.parkingspot.Ticket;
import org.lld.parkinglot.parkingspot.manager.factory.ParkingSpotManagerFactory;

public class ExitGate {

    private ParkingSpotManagerFactory parkingSpotManagerFactory;

    public ExitGate(ParkingSpotManagerFactory parkingSpotManagerFactory) {
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }

    public ParkingSpot unParkVehicle(Ticket ticket){
        return parkingSpotManagerFactory.getParkingSlotManager(ticket.getVehicle().getVehicleType()).unParkVehicle(ticket.getVehicle(), ticket.getParkingSpot());
    }

    public int priceCalculator(Ticket ticket){
        return ticket.getParkingSpot().getPrice();
    }
}
