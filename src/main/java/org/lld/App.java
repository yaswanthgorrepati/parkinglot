package org.lld;

import org.lld.parkinglot.Type;
import org.lld.parkinglot.Vehicle;
import org.lld.parkinglot.parkingspot.FourWheelerParkingSpot;
import org.lld.parkinglot.parkingspot.ParkingSpot;
import org.lld.parkinglot.parkingspot.Ticket;
import org.lld.parkinglot.parkingspot.TwoWheelerParkingSpot;
import org.lld.parkinglot.parkingspot.gate.EntranceGate;
import org.lld.parkinglot.parkingspot.gate.ExitGate;
import org.lld.parkinglot.parkingspot.manager.FourWheelerParkingSpotManager;
import org.lld.parkinglot.parkingspot.manager.TwoWheelerParkingSpotManager;
import org.lld.parkinglot.parkingspot.manager.factory.ParkingSpotManagerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println("Generating 5 - 2 wheeler and 5 - four wheeler parking spots");
        List<ParkingSpot> twoWheelerParkingSpots = new ArrayList<>();
        twoWheelerParkingSpots.add(new TwoWheelerParkingSpot("TWO_123", 10));
        twoWheelerParkingSpots.add(new TwoWheelerParkingSpot("TWO_124", 10));
        twoWheelerParkingSpots.add(new TwoWheelerParkingSpot("TWO_125", 10));
        twoWheelerParkingSpots.add(new TwoWheelerParkingSpot("TWO_126", 10));
        twoWheelerParkingSpots.add(new TwoWheelerParkingSpot("TWO_127", 10));
        TwoWheelerParkingSpotManager twoWheelerParkingSpotManager = new TwoWheelerParkingSpotManager(twoWheelerParkingSpots);
        List<ParkingSpot> fourWheelerParkingSpots = new ArrayList<>();
        fourWheelerParkingSpots.add(new FourWheelerParkingSpot("FOUR_123", 20));
        fourWheelerParkingSpots.add(new FourWheelerParkingSpot("FOUR_124", 20));
        fourWheelerParkingSpots.add(new FourWheelerParkingSpot("FOUR_125", 20));
        fourWheelerParkingSpots.add(new FourWheelerParkingSpot("FOUR_126", 20));
        fourWheelerParkingSpots.add(new FourWheelerParkingSpot("FOUR_127", 20));
        FourWheelerParkingSpotManager fourWheelerParkingSpotManager = new FourWheelerParkingSpotManager(fourWheelerParkingSpots);

        System.out.println("Initiating the ParkingSpotManagerFactory");
        ParkingSpotManagerFactory parkingSpotManagerFactory = new ParkingSpotManagerFactory(twoWheelerParkingSpotManager, fourWheelerParkingSpotManager);

        System.out.println("Vehicle started coming in!!");
        Vehicle v1 = new Vehicle("V123", Type.TWO_WHEELER);
        Vehicle v2 = new Vehicle("V124", Type.FOUR_WHEELER);


        EntranceGate entranceGate = new EntranceGate(parkingSpotManagerFactory);
        ExitGate exitGate = new ExitGate(parkingSpotManagerFactory);

        System.out.println("Check for parking spot for vehicle " + v1);
        ParkingSpot p1 = entranceGate.findSpace(v1.getVehicleType());
        System.out.println("Parking Spot found: "+p1);
        Ticket t1 = entranceGate.parkVehicleAndGenerateTicket(v1);
        System.out.println("Park vehicle and generate ticket: "+ t1);

        System.out.println("Check for parking spot for vehicle " + v2);
        ParkingSpot p2 = entranceGate.findSpace(v2.getVehicleType());
        System.out.println("Parking Spot found: "+p2);
        Ticket t2 =entranceGate.parkVehicleAndGenerateTicket(v2);
        System.out.println("Park vehicle and generate ticket: "+ t2);

        System.out.println("Calculate price for ticket-1: " +t1);
        int price1 = exitGate.priceCalculator(t1);
        System.out.println("Calculated Price: "+ price1);

        ParkingSpot freeParkingSpot = exitGate.unParkVehicle(t1);
        System.out.println("Unpark vehicle T1: "+t1 + "freed ParkingSpot:  " +freeParkingSpot);


    }
}
