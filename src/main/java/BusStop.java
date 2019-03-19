import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public String getName(){
        return this.name;
    }

    public int countQueue(){
        return this.queue.size();
    }

    public void addPersonToQueue(Person person){
        this.queue.add(person);
    }

    public Person removePersonFromQueue(){
        Person passenger = null;
        if(this.countQueue() > 0) {
            passenger = this.queue.remove(0);
        }
        return passenger;
    }
}
