package org.lld.parkinglot.parkingspot;

import org.lld.parkinglot.Vehicle;

import java.util.Objects;

public abstract class ParkingSpot <T extends ParkingSpot<T>>{
    String parkingSpotId;
    Vehicle vehicle;
    int price;

    public ParkingSpot(String parkingSpotId, int price) {
        this.parkingSpotId = parkingSpotId;
        this.price = price;
    }

    public String getParkingSpotId() {
        return parkingSpotId;
    }

    public void setParkingSpotId(String parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isEmpty(){
        return Objects.isNull(vehicle) ? true : false;
    }

    public T parkVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        return (T)this;
    }

    public T unParkVehicle(Vehicle vehicle){
        this.vehicle = null;
        return  (T)this;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "parkingSpotId='" + parkingSpotId + '\'' +
                ", vehicle=" + vehicle +
                ", price=" + price +
                '}';
    }
}
