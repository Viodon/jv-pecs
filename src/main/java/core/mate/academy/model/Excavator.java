package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int length;
    private int numberOfDoor;

    public Excavator() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    public void setNumberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
