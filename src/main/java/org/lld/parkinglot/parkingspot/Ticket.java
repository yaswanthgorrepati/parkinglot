package org.lld.parkinglot.parkingspot;

import org.lld.parkinglot.Vehicle;

import java.util.Date;

public class Ticket {
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;

    public Ticket(Date entryTime, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "entryTime=" + entryTime +
                ", vehicle=" + vehicle +
                ", parkingSpot=" + parkingSpot +
                '}';
    }
}
