import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBusStop {

    public BusStop busStop;
    public Person person;

    @Before
    public void setup(){
        busStop = new BusStop("Hill St");
        person = new Person();
    }

    // BusStop should have a name and an initially empty ArrayList of type "Person" called Queue.

    @Test
    public void busStopHasName(){
        assertEquals("Hill St", busStop.getName());
    }

    @Test
    public void busStopHasEmptyQueue(){
        assertEquals(0, busStop.countQueue());
    }

    // Add a method to add a Person to the queue.

    @Test
    public void busStopShouldAddPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.countQueue());
    }

    // Add a method to remove a person from the queue.

    @Test
    public void busStopShouldRemovePersonFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(1, busStop.countQueue());
    }
}
