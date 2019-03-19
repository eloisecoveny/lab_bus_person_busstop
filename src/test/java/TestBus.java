import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBus {

    public Bus bus;
    public Person person;
    public BusStop busStop;

    @Before
    public void setup(){
        bus = new Bus("Penny Lane", 50);
        person = new Person();
        busStop = new BusStop("Hill St");
    }

    // Create a Bus class with a Destination, Capacity and an initially empty ArrayList passengers of type Person

    @Test
    public void busHasDestination(){
        assertEquals("Penny Lane", bus.getDestination());
    }

    @Test
    public void busHasCapacity(){
        assertEquals(50, bus.getCapacity());
    }

    // Create a method to return the number of passengers on the bus.

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.countPassengers());
    }

    // Create a method to add a passenger onto the bus only if the passenger count is less than the capacity.

    @Test
    public void busCanAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.countPassengers());
    }

    // Create a method to remove a passenger from the bus.

    @Test
    public void busCanRemovePassenger(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(1, bus.countPassengers());
    }

    // Create a pickUp method in bus that gets person from bus stop and adds to bus passengers.

    @Test
    public void busCanPickUpPassengerFromBusStop(){
        busStop.addPersonToQueue(person);
        Person passenger = busStop.removePersonFromQueue();
        bus.addPassenger(passenger);
        assertEquals(0, busStop.countQueue());
        assertEquals(1, bus.countPassengers());
    }
}
